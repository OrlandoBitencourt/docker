package com.grupo5.api.model;


import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Data
@Table(name = "pessoas")
public class PessoaModel{

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name="pessoa_id")
	private Integer idPessoa;
	
	@Column(name="pessoa_nome")
	private String nomePessoa;
	
	@Column(name="pessoa_sobrenome")
	private String sobrenomePessoa;
	
	@ManyToMany(mappedBy = "pessoa")
	private List<EventoModel> evento = new ArrayList<>();
	
	public PessoaModel() {}

	public PessoaModel(Integer idPessoa, String nomePessoa, String sobrenomePessoa, List<EventoModel> evento) {
		super();
		this.idPessoa = idPessoa;
		this.nomePessoa = nomePessoa;
		this.sobrenomePessoa = sobrenomePessoa;
		this.evento = evento;
	}
	
	
}


