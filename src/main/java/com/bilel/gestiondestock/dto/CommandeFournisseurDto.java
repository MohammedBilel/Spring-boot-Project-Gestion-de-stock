package com.bilel.gestiondestock.dto;

import java.time.Instant;
import java.util.List;

import com.bilel.gestiondestock.model.Fournisseur;

import lombok.Builder;
import lombok.Data;


@Data
@Builder
public class CommandeFournisseurDto {

	private Integer id;
	
	private String code;
	
	private Instant dateCommande;
	
	private Fournisseur fournisseur;
	
	private List<LigneCommandeFournisseurDto> ligneCommandeFournisseurs;
}
