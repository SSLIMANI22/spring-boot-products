package com.shop.shop.Service;

import com.shop.shop.Model.Produit;
import com.shop.shop.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public List<Produit> getProducts(){
        List<Produit> products = new ArrayList<>();
        productRepository.findAll().forEach(product -> {
            products.add(product);
        });
        return products;
    }


    public Produit getProduct(String id) {

        return productRepository.findById(id).orElse(null);
    }

    public void deleteProduct(String id) {
        productRepository.deleteById(id);
    }

    public void addProduct(Produit produit){
        productRepository.save(produit);
    }

    public void updateProduct(Produit produit, String id){
        productRepository.save(produit);
    }
}
