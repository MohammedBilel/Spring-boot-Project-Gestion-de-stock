package com.bilel.gestiondestock.dto;

import java.math.BigDecimal;

import com.bilel.gestiondestock.model.CommandeFournisseur;

import lombok.Builder;
import lombok.Data;



@Data
@Builder
public class LigneCommandeFournisseurDto {

	private Integer id;
	
	private ArticleDto article;
	
	private CommandeFournisseur commandeFournisseur;
	
	private BigDecimal quantite;
	
	private BigDecimal prixUnitaire;
}
