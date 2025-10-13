package com.bilel.gestiondestock.dto;

import java.util.List;

import com.bilel.gestiondestock.model.Category;
import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.OneToMany;
import lombok.Builder;
import lombok.Data;


@Builder
@Data
public class CategoryDto {

	private Integer id;
	
	private String code;

	
	private String designation;
	
	@JsonIgnore
	private List<ArticleDto> articles;
	
	public CategoryDto fromEntity(Category category) {
		if (category == null) {
			return null;
			//  TODO THROW an exception
		}
		
		return CategoryDto.builder()
				.id(category.getId())
				.code(category.getCode())
				.designation(category.getDesignation())
				.build();
	}
	
	public Category toEntity(CategoryDto categoryDto) {
		if (categoryDto == null) {
			return null;
			//  TODO THROW an exception
		}
		
		 Category category = new Category();
		 category.setId(categoryDto.getId());
		 category.setCode(categoryDto.getCode());
		 category.setDesignation(categoryDto.getCode());
				
		 return category;
	}	 
}
