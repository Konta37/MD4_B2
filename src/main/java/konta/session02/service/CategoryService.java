package konta.session02.service;

import konta.session02.model.entity.Category;

import java.util.List;

public interface CategoryService {
    List<Category> getCategories();
    Category getCategoryById(String cateId);
    Category insertCategory(Category cate);
    Category updateCategory(String cateId, Category cate);
    void deleteCategory(String cateId);
    List<Category> getCategoriesByName(String cateName);
}
