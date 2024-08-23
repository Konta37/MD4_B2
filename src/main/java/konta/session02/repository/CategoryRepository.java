package konta.session02.repository;

import konta.session02.model.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CategoryRepository extends JpaRepository<Category, String> {
    List<Category> findCategoriesByCateNameContains(String cateName);
}
