package com.telusko.ProductSpring;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductDB extends JpaRepository<Product, Integer> {
    List<Product> findAllByNameContainingIgnoreCase(String searchText);
    List<Product> findAllByPlaceContainingIgnoreCase(String place);

    List<Product> findAllProductsOutOfWarranty(int w);

    List<Product> findAllProductsByWarranty(int w);
}
