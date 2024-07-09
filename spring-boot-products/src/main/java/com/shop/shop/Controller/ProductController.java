package com.shop.shop.Controller;

import com.shop.shop.Model.Produit;
import com.shop.shop.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {
    @Autowired
    private ProductService productService;

    @RequestMapping (method = RequestMethod.GET, value ="/Products")
    public List<Produit> getProducts (){
      return productService.getProducts();
    }
    @RequestMapping("/Product/{id}")
    public Produit getProduct(@PathVariable String id){
        return productService.getProduct(id);
    }
    @RequestMapping(method = RequestMethod.DELETE, value = "/Product/{id}")
    public void deleteProduct(@PathVariable String id){
        productService.deleteProduct(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/Products")
    public void addProduct(@RequestBody Produit produit){
        productService.addProduct(produit);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/Product/{id}")
    public  void updateProduct (@RequestBody Produit produit,@PathVariable String id){
    productService.updateProduct(produit,id);
    }
}
