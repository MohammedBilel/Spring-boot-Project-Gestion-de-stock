package com.bilel.gestiondestock.model;

import java.math.BigDecimal;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
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
@Table(name ="category")
public class Category extends AbstractEntity{

	@Column(name = "code")
	private String code;
	
	
	@Column(name = "designation")
	private String designation;
	
	@Column(name = "identreprise")
	private Integer idEntreprise;
	
	@OneToMany(mappedBy = "category")
	private List<Article> articles;
}
