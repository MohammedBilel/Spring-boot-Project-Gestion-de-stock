 package com.bilel.gestiondestock.dto;

import java.math.BigDecimal;

import com.bilel.gestiondestock.model.Category;

import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Builder;
import lombok.Data;


@Builder
@Data
public class ArticleDto {

	private Integer id;
	
	private String codeArticle;
	
	
	private String designation;
	
	
	private BigDecimal prixUnitaireHt;
	
	
	private BigDecimal tauxTva;
	
	
	private BigDecimal prixUnitaireTtc;
	
	
	private String photo;
	
	
	private CategoryDto category;
}
