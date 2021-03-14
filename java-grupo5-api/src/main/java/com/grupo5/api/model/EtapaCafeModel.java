package com.grupo5.api.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "etapa_cafe")
public class EtapaCafeModel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="etapa_cafe_id")
	private int idEtapaCafe;
	
	@JoinColumn(name = "idEtapa", referencedColumnName = "etapa_id")
	@ManyToOne
	private EtapaModel etapaModelEtapa_id;
	
	
	@JoinColumn(name = "idSalaCafe", referencedColumnName = "sala_cafe_id")
	@ManyToOne
	private SalaCafeModel salaCafeModelCafe_id;

}
