package com.project.products.web;

import com.project.products.entities.Product;
import com.project.products.repositories.ProductRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
@AllArgsConstructor
public class ProductController {
    @Autowired
    private ProductRepository productRepository;

    @GetMapping("/index")
    public String index(Model model){
        List<Product>  productList=productRepository.findAll();
        model.addAttribute("listeProduits",productList);

        return "produits";
    }
}
