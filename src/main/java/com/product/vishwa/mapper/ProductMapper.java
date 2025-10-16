package com.product.vishwa.mapper;

import com.product.vishwa.Dto.Productdto;

import com.product.vishwa.entity.Product;
import com.product.vishwa.entity.Category;

public class ProductMapper {

	
	 public static Productdto toProductdto(Product product){
	        return new Productdto(
	                product.getId(),
	                product.getName(),
	                product.getDescription(),
	                product.getPrice(),
	                product.getCategory().getId()
	        );
	    }
   
	 public static Product toProductEntity(Productdto productDTO, Category category){
	        Product product = new Product();
	        product.setName(productDTO.getName());
	        product.setDescription(productDTO.getDescription());
	        product.setPrice(productDTO.getPrice());
	        product.setCategory(category);

	        return product;
	    } 
    	

  
}
