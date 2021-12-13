package com.wael.pays.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Pays {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idPays;
	private String nomPays;
	private String descriptionPays;
	@JsonIgnore
	@OneToMany(mappedBy = "pays")
	private List<Ville> villes;
	
	
	 public Pays() {
		 
	 }
	 
	public Pays(String nomPays, String descriptionPays, List<Ville> villes) {
		super();
		this.nomPays = nomPays;
		this.descriptionPays = descriptionPays;
		this.villes = villes;
	}

	public Long getIdPays() {
		return idPays;
	}

	public void setIdPays(Long idPays) {
		this.idPays = idPays;
	}

	public String getNomPays() {
		return nomPays;
	}

	public void setNomPays(String nomPays) {
		this.nomPays = nomPays;
	}

	public String getDescriptionPays() {
		return descriptionPays;
	}

	public void setDescriptionPays(String descriptionPays) {
		this.descriptionPays = descriptionPays;
	}

	public List<Ville> getVilles() {
		return villes;
	}

	public void setVilles(List<Ville> villes) {
		this.villes = villes;
	}
	
	
	
	 
	
}
