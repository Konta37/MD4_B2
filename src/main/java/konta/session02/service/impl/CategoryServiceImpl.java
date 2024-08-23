package konta.session02.service.impl;

import konta.session02.model.entity.Category;
import konta.session02.repository.CategoryRepository;
import konta.session02.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
public class CategoryServiceImpl implements CategoryService {
    @Autowired
    private CategoryRepository categoryRepository;

    @Override
    public List<Category> getCategories() {
        return categoryRepository.findAll();
    }

    @Override
    public Category getCategoryById(String cateId) {
        return categoryRepository.findById(cateId).orElseThrow(()->new NoSuchElementException("Khong co category nao co ma: "+cateId));
    }

    @Override
    public Category insertCategory(Category cate) {
        return categoryRepository.save(cate);
    }

    @Override
    public Category updateCategory(String cateId, Category cate) {
        categoryRepository.findById(cateId).orElseThrow(()->new NoSuchElementException("Khong ton tain category : "+cate.getCateId()));
        cate.setCateId(cateId);
        return categoryRepository.save(cate);
    }

    @Override
    public void deleteCategory(String cateId) {
        categoryRepository.findById(cateId).orElseThrow(()->new NoSuchElementException("Khong ton tain category : "+cateId));
        categoryRepository.deleteById(cateId);
    }

    @Override
    public List<Category> getCategoriesByName(String cateName) {
        return categoryRepository.findCategoriesByCateNameContains(cateName);
    }
}
