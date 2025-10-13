package com.bilel.gestiondestock.dto;

import java.util.List;

import com.bilel.gestiondestock.model.Adresse;

import lombok.Builder;
import lombok.Data;


@Data
@Builder
public class EntrepriseDto {

	private Integer id;
	
	private String nom;
	
	
	private String description;
	

	private AdresseDto adresse;
	
	
	private String codeFiscal;
	
	
	private String photos;
	
	
	private String email;
	
	
	private String numTel;
	
	
	private String steWeb;
	
	
	private List<UtilisateurDto> utilisateurs;
}
