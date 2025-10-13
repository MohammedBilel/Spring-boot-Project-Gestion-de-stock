package com.bilel.gestiondestock.model;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name ="article")
public class Article extends AbstractEntity {

	@Column(name = "codearticle")
	private String codeArticle;
	
	@Column(name = "designation")
	private String designation;
	
	@Column(name = "prixunitaireHt")
	private BigDecimal prixUnitaireHt;
	
	@Column(name = "tauxtva")
	private BigDecimal tauxTva;
	
	@Column(name = "prixunitairettc")
	private BigDecimal prixUnitaireTtc;
	
	@Column(name = "photo")
	private String photo;
	
	
	@ManyToOne
	@JoinColumn(name = "idcategory")
	private Category category;
}
