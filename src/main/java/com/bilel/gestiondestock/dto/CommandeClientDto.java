package com.bilel.gestiondestock.dto;

import java.time.Instant;
import java.util.List;

import com.bilel.gestiondestock.model.Client;
import com.bilel.gestiondestock.model.LigneCommandeClient;

import lombok.Builder;
import lombok.Data;


@Data
@Builder
public class CommandeClientDto {
	
	private Integer id;

	private String code;
	
	private Instant dateCommande;
	
	private Client client;
	
	private List<LigneCommandeClientDto> ligneCommandeClients;
}
