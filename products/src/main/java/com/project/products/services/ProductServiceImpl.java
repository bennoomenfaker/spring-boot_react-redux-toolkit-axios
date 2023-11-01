package com.project.products.services;


import com.project.products.entities.Product;
import com.project.products.repositories.ProductRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;
    @Override
    public void addQuantity(Long id, int newQuantity) {
        Product product = productRepository.getReferenceById(id);
        product.setQuantity(product.getQuantity()+newQuantity);
        productRepository.save(product);

    }
}
