package com.bilel.gestiondestock.model;

import java.math.BigDecimal;
import java.time.Instant;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
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
@Table(name = "mvtstk")
public class MvtStk extends AbstractEntity {

	@Column(name= "dateMvt")
	private Instant dateMvt;
	
	@Column(name= "quantite")
	private BigDecimal quantite;
	
	@ManyToOne
	@JoinColumn(name= "idarticle")
	private Article article;
	
	@Column(name= "typeMvt")
	@Enumerated(EnumType.STRING)
	private TypeMvtStk typeMvt;
	
	@Column(name = "sourcemvt")
	@Enumerated(EnumType.STRING)
	private SourceMvtStk sourceMvt;
	
	@Column(name = "identreprise")
	private Integer idEntreprise;
}
