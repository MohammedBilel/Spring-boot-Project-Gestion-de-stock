package com.bilel.gestiondestock.dto;

import java.math.BigDecimal;
import java.time.Instant;

import com.bilel.gestiondestock.model.TypeMvtStk;

import lombok.Builder;
import lombok.Data;


@Data
@Builder
public class MvtStkDto {

	private Integer id;
	
	private Instant dateMvt;
	
	private BigDecimal quantite;
	
	private ArticleDto article;
	
	private TypeMvtStk typeMvt;
}
