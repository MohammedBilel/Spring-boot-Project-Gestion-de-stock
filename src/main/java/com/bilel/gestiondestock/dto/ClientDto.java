package com.bilel.gestiondestock.dto;

import java.util.List;

import com.bilel.gestiondestock.model.Adresse;
import com.bilel.gestiondestock.model.Client;
import com.bilel.gestiondestock.model.CommandeClient;

import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.OneToMany;
import lombok.Builder;
import lombok.Data;


@Builder
@Data
public class ClientDto {

	private Integer id;
	
	private String nom;
	
	
	private String prenom;
	
	
	private AdresseDto adresse;
	
	
	private String photo;
	
	
	private String mail;
	
	
	private String numTel;
	
	
	private List<CommandeClientDto> commandeClients;
	
	public static ClientDto fromEntity(Client client) {
		if (client == null) {
		      return null;
		    }
		
		return ClientDto.builder()
		        .id(client.getId())
		        .nom(client.getNom())
		        .prenom(client.getPrenom())
		        .adresse(AdresseDto.fromEntity(client.getAdresse()))
		        .photo(client.getPhoto())
		        .mail(client.getMail())
		        .numTel(client.getNumTel())
		        .idEntreprise(client.getIdEntreprise())
		        .build();
		  }
	
	public static Client toEntity(ClientDto dto) {
	    if (dto == null) {
	      return null;
	    }
	    Client client = new Client();
	    client.setId(dto.getId());
	    client.setNom(dto.getNom());
	    client.setPrenom(dto.getPrenom());
	    client.setAdresse(AdresseDto.toEntity(dto.getAdresse()));
	    client.setPhoto(dto.getPhoto());
	    client.setMail(dto.getMail());
	    client.setNumTel(dto.getNumTel());
	    client.setIdEntreprise(dto.getIdEntreprise());
	    return client;
	  }
	}


