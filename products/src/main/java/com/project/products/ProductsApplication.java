package com.project.products;


import com.project.products.entities.Product;
import com.project.products.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProductsApplication implements CommandLineRunner {
	@Autowired
	private ProductRepository productRepository;

	public static void main(String[] args) {
		SpringApplication.run(ProductsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		productRepository.save(new Product(null,"product1",1300.0,4));
		productRepository.save(new Product(null,"product2",1250.0,4));productRepository.save(new Product(null,"product1",1250.0,4));
		productRepository.save(new Product(null,"product3",1250.0,4));
        productRepository.save(new Product(null,"product4",1250.0,4));
        productRepository.save(new Product(null,"product4",1250.0,4));



    }
}
