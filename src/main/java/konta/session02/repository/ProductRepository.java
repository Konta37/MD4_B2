package konta.session02.repository;

import konta.session02.model.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Integer> {
    List<Product> findProductsByProNameContains(String proName);
}
