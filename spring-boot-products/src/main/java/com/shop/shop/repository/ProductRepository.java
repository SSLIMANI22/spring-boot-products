package com.shop.shop.repository;

import com.shop.shop.Model.Produit;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Produit,String> {
}
