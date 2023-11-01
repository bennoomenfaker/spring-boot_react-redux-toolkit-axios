package com.project.products.web;

import com.project.products.repositories.ProductRepository;
import com.project.products.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductBusinessController {
    @Autowired
    private ProductService productService;

    @PutMapping("products/product/update")
    public void updateQuantity(Long id, int q){
         q=30;
        productService.addQuantity(id,q);

    }
}
