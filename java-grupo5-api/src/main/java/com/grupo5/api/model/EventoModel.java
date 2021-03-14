package com.grupo5.api.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;


@Data
@Entity
@Table(name = "evento")
public class EventoModel implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name="evento_id")
	private Integer idEvento;
	
	@Column(name="evento_nome")
	private String nomeEvento;
	
	@Column(name="evento_inscricoes")
	private int inscricoesEvento;
	
	
	@ManyToMany(cascade = {
	        CascadeType.PERSIST,
	        CascadeType.MERGE})
	@JoinTable(name = "pessoas_evento", 
			joinColumns = @JoinColumn(name = "evento_id"),
			inverseJoinColumns = @JoinColumn(name = "pessoa_id"))
	private List<PessoaModel> pessoa = new ArrayList<>();;

	public EventoModel() {}

	public EventoModel(Integer idEvento, String nomeEvento, int inscricoesEvento, List<PessoaModel> pessoa) {
		super();
		this.idEvento = idEvento;
		this.nomeEvento = nomeEvento;
		this.inscricoesEvento = inscricoesEvento;
		this.pessoa = pessoa;
	}
	
	
}
