package com.wael.pays.entities;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
@Entity
public class Ville {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long idVille;
private String nomVille;
private Double surfaceVille;
private int populationVille;
@ManyToOne
private Pays pays;


public Ville() {
	super();
	// TODO Auto-generated constructor stub
}


public Ville( String nomVille, Double surfaceVille, int populationVille) {
	super();
	
	this.nomVille = nomVille;
	this.surfaceVille = surfaceVille;
	this.populationVille = populationVille;
}


public Long getIdVille() {
	return idVille;
}


public void setIdVille(Long idVille) {
	this.idVille = idVille;
}


public String getNomVille() {
	return nomVille;
}


public void setNomVille(String nomVille) {
	this.nomVille = nomVille;
}


public Double getSurfaceVille() {
	return surfaceVille;
}


public void setSurfaceVille(Double surfaceVille) {
	this.surfaceVille = surfaceVille;
}


public int getPopulationVille() {
	return populationVille;
}


public void setPopulationVille(int populationVille) {
	this.populationVille = populationVille;
}




public Pays getPays() {
	return pays;
}


public void setPays(Pays pays) {
	this.pays = pays;
}


@Override
public String toString() {
	return "Ville [idVille=" + idVille + ", nomVille=" + nomVille + ", surfaceVille=" + surfaceVille
			+ ", populationVille=" + populationVille + ", pays=" + pays + "]";
}










}
