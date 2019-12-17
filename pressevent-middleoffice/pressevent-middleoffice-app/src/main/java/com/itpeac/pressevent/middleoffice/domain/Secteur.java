package com.itpeac.pressevent.middleoffice.domain;

import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import org.hibernate.annotations.Cascade;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
public class Secteur {   
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id_secteur;
	private String nom;
	private String type;
	
	@JsonIgnore
	public Collection<Evenement> getEvenement() {
		return evenement;
	}

	public void setEvenement(Collection<Evenement> evenement) {
		this.evenement = evenement;
	}

	@OneToMany(mappedBy = "secteur", fetch = FetchType.EAGER, cascade= { CascadeType.MERGE})
	//@JoinColumn(name="id_en") 
	private Collection<Evenement> evenement;
	


	public Secteur(String nom, String type, Collection<Evenement> evenement) {
		super();
		this.nom = nom;
		this.type = type;
		this.evenement = evenement;
	}

	public Secteur() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getId() {
		return id_secteur;
	}

	public void setId(Long id) {
		this.id_secteur = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Categories [id=" + id_secteur + ", nom=" + nom + ", type=" + type + "]";
	}

	public Secteur(Long id_secteur) {
		super();
		this.id_secteur = id_secteur;
	}

	

	
	

}
