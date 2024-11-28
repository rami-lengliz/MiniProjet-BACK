package com.rami.chanteurs.entities;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Chanteur {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idChanteur;
	private String nomChanteur;
	private double prixconcert;
	private Date prochconcert;
	
	@ManyToOne
	private Categorie 	categorie;
	
	
	
	public Chanteur(String nomChanteur, double prixconcert, Date prochconcert) {
		super();
		this.nomChanteur = nomChanteur;
		this.prixconcert = prixconcert;
		this.prochconcert = prochconcert;
	}
	public Chanteur() {
		super();
		// TODO Auto-generated constructor stub
	}
	public long getIdChanteur() {
		return idChanteur;
	}
	public void setIdChanteur(long idChanteur) {
		this.idChanteur = idChanteur;
	}
	public String getNomChanteur() {
		return nomChanteur;
	}
	public void setNomChanteur(String nomChanteur) {
		this.nomChanteur = nomChanteur;
	}
	public double getPrixconcert() {
		return prixconcert;
	}
	public void setPrixconcert(double prixconcert) {
		this.prixconcert = prixconcert;
	}
	public Date getProchconcert() {
		return prochconcert;
	}
	public void setProchconcert(Date prochconcert) {
		this.prochconcert = prochconcert;
	}
	@Override
	public String toString() {
		return "Chanteur [idChanteur=" + idChanteur + ", nomChanteur=" + nomChanteur + ", prixconcert=" + prixconcert
				+ ", prochconcert=" + prochconcert + "]";
	}
	public Categorie getCategorie() {
		return categorie;
	}
	public void setCategorie(Categorie categorie) {
		this.categorie = categorie;
	} 
	
	
}
