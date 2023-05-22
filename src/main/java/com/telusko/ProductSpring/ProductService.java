package com.telusko.ProductSpring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
@Component
public class ProductService {
    @Autowired
    ProductDB db;
    public List<Product> getAllProducts(){
    return db.findAll();
    }

    public List<Product> getProductByText(String t){
    return db.findAllByNameContainingIgnoreCase(t);
    }

    public List<Product> getProductByPlace(String pl){
    return db.findAllByPlaceContainingIgnoreCase(pl);
    }

    public List<Product> getProductOutOfWarranty(int w){
    return db.findAllProductsOutOfWarranty(w);
    }

    public List<Product> getProductByWarranty(int w){
    return db.findAllProductsByWarranty(w);
    }
}

