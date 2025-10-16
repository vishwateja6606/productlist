package com.product.vishwa.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//import java.util.Locale.Category;

import com.product.vishwa.Dto.Categorydto;
import com.product.vishwa.mapper.CategoryMapper;
import com.product.vishwa.repository.CategoryRepository;

import lombok.AllArgsConstructor;

import com.product.vishwa.entity.*;

//business logic
@Service
@AllArgsConstructor
public class CategoryService {
	@Autowired
      private CategoryRepository categoryRepository;
	//create category
	public Categorydto createCategory(Categorydto categorydto) {
		Category category = CategoryMapper.toCategoryEntity(categorydto);
		category=categoryRepository.save(category);
		categorydto =CategoryMapper.toCategorydto(category);
		return categorydto;
	//get category by id
	//delete category
	}
}


