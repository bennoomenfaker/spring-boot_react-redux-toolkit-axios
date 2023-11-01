package com.project.products.web;


import com.project.products.entities.Product;
import com.project.products.repositories.ProductRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController

@AllArgsConstructor
public class ProductRestController {
    @Autowired
    private ProductRepository productRepository;

    @GetMapping("/products")
    public List<Product> findAllProducts() {
        return productRepository.findAll();
    }

    @GetMapping("/products/{id}")
    public ResponseEntity<Product> affichePatient(@PathVariable Long id) {
        Optional<Product> patient = productRepository.findById(id);

        if (patient.isPresent()) {
            return ResponseEntity.ok(patient.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping("/products")
    public Product save(@RequestBody Product product) {
        System.out.println("********** Save ***************");
        System.out.println(product.getName());
        System.out.println(product.getQuantity());
        return productRepository.save(product);

    }

    /*@PutMapping("/products/{name}")
    public Product upadte(@PathVariable String name, @RequestBody Product product) {
        product.setName(name);
        return productRepository.save(product);

    }*/


    @PutMapping("/products/{id}")
    public ResponseEntity<Product> updateProduct(@PathVariable Long id, @RequestBody Product updatedProduct) {
        Optional<Product> existingProduct = productRepository.findById(id);

        if (existingProduct.isPresent()) {
            Product product = existingProduct.get();
            product.setName(updatedProduct.getName());
            product.setPrice(updatedProduct.getPrice());
            product.setQuantity(updatedProduct.getQuantity());
            productRepository.save(product); // Sauvegardez le produit mis à jour
            return ResponseEntity.ok(product);
        } else {
            return ResponseEntity.notFound().build();
        }
    }


    @DeleteMapping(path = "/products/{id}")
    public void delete(@PathVariable Long id) {
        productRepository.deleteById(id);

    }
}