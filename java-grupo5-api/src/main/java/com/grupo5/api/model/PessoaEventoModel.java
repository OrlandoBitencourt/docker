package com.grupo5.api.model;



import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;


@Entity
@Data
@Table(name = "pessoas_evento")
public class PessoaEventoModel {
	

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="pessoa_evento_id")
	private Integer idPessoaEvento;
	
	@ManyToOne
	@JoinColumn(name = "idPessoa")
	private PessoaModel pessoa;

	@ManyToOne
	@JoinColumn(name = "idEvento")
	private EventoModel evento;


}
