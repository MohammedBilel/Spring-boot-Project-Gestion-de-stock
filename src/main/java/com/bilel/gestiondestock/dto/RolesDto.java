package com.bilel.gestiondestock.dto;

import com.bilel.gestiondestock.model.Utilisateur;

import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

public class RolesDto {

	private Integer id;
	
	private String roleName;
	
	private UtilisateurDto utilisateur;
}
