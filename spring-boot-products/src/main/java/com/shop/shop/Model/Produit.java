package com.shop.shop.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Produit {
   public Long getId() {
      return id;
   }

   public void setId(Long id) {
      this.id = id;
   }
   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   private Long id;
   private String code;
   private String name;
   private String description ;
   private Number price;
   private Number quantity;
   private String inventoryStatus;
   private String image;
   private String category;
   private Number rating;

   public Produit(){

   }
   public Produit(Long id, String code, String name, Number price, Number quantity, String inventoryStatus, String image, String category, Number rating) {
      super();
      this.id = id;
       this.code = code;
      this.name = name;
      this.price = price;
      this.description = description;
      this.quantity = quantity;
      this.inventoryStatus = inventoryStatus;
      this.image = image;
      this.category = category;
      this.rating = rating;
   }



   public String getDescription() {
      return description;
   }

   public void setDescription(String description) {
      this.description = description;
   }

      public String getCode () {
         return code;
      }

      public void setCode (String code){
         this.code = code;
      }

      public String getName () {
         return name;
      }

      public void setName (String name){
         this.name = name;
      }

   public Number getPrice() {
      return price;
   }

   public void setPrice(Number price) {
      this.price = price;
   }

   public Number getQuantity() {
      return quantity;
   }

   public void setQuantity(Number quantity) {
      this.quantity = quantity;
   }

   public String getImage() {
      return image;
   }

   public void setImage(String image) {
      this.image = image;
   }

   public String getInventoryStatus() {
      return inventoryStatus;
   }

   public void setInventoryStatus(String inventoryStatus) {
      this.inventoryStatus = inventoryStatus;
   }

   public String getCategory() {
      return category;
   }

   public void setCategory(String category) {
      this.category = category;
   }

   public Number getRating() {
      return rating;
   }

   public void setRating(Number rating) {
      this.rating = rating;
   }

   }


