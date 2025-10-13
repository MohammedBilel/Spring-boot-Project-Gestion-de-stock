package com.bilel.gestiondestock.model;

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
@Table(name = "lignecommandefournisseur")
public class LigneCommandeFournisseur extends AbstractEntity {

	@ManyToOne
	@JoinColumn(name ="idarticle")
	private Article article;
	
	@ManyToOne
	@JoinColumn(name = "idcommandefournisseur")
	private CommandeFournisseur commandeFournisseur;
}
