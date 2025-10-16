package com.product.vishwa.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.product.vishwa.Dto.Categorydto;
import com.product.vishwa.service.CategoryService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api/categories")
@AllArgsConstructor
public class CategoriesController {
	private CategoryService categoryservice;
	//create categories(post method)
	@PostMapping
//	public Categorydto createCategory(@RequestBody Categorydto categorydto) {
//		return categoryservice.createCategory(categorydto);
//	}
	  public ResponseEntity<?> createCategory(@RequestBody Categorydto categoryDTO){
        Categorydto savedCategory = categoryservice.createCategory(categoryDTO);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedCategory);

}
	

}
