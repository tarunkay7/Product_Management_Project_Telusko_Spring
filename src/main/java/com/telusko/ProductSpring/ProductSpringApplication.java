package com.telusko.ProductSpring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.sql.SQLException;
import java.util.List;

@SpringBootApplication
public class ProductSpringApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(ProductSpringApplication.class, args);

		ProductService ps = context.getBean(ProductService.class);

		List<Product> products = ps.getAllProducts();
		System.out.println("All Products: ");
		for (Product p : products) {
			System.out.println(p);
		}

		System.out.println("Products with Text: ");
		List<Product> productsWithText = ps.getProductByText("a");
		for (Product p : productsWithText) {
			System.out.println(p);
		}

		System.out.println("Products with Place: ");
		List<Product> productsWithPlace = ps.getProductByPlace("a");
		for (Product p : productsWithPlace) {
			System.out.println(p);
		}

		System.out.println("Products with Warranty: ");
		List<Product> productsWithWarranty = ps.getProductByWarranty(2);
		for (Product p : productsWithWarranty) {
			System.out.println(p);
		}

		System.out.println("Products out of Warranty: ");
		List<Product> productsOutOfWarranty = ps.getProductOutOfWarranty(1);
		for (Product p : productsOutOfWarranty) {
			System.out.println(p);
		}


	}

}
