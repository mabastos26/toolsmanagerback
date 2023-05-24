package com.eletrodev.domain.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Military {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String identidade;
	private String nome;
	private String NomeDeGuerra;
	private String assinatura;
	private MitaryType tipoMilitar;
}
