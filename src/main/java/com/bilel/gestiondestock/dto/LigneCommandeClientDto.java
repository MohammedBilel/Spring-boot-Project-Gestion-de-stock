package com.bilel.gestiondestock.dto;

import java.math.BigDecimal;

import com.bilel.gestiondestock.model.Article;
import com.bilel.gestiondestock.model.CommandeClient;

import lombok.Builder;
import lombok.Data;


@Data
@Builder
public class LigneCommandeClientDto {

	private Integer id;
	
	private ArticleDto article;
	
	private CommandeClientDto commandeClient;
	
	private BigDecimal quantite;
	
	private BigDecimal prixUnitaire;
}
