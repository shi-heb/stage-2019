package com.itpeac.pressevent.middleoffice.domain;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class Societe {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_societe;
	private String nom ;
	private Adresse adresse;
	private String contact ;
	
	@OneToMany(mappedBy = "societe", fetch = FetchType.LAZY)
	private Collection<Utilisateur> utilisateur;


	public Collection<Utilisateur> getUtilisateur() {
		return utilisateur;
	}

public void setUtilisateur(Collection<Utilisateur> utilisateur) {
		this.utilisateur = utilisateur;
	}

	public Long getId() {
		return id_societe;
	}

	public void setId(Long id) {
		this.id_societe = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public Societe() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Adresse getAdresse() {
		return adresse;
	}

	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}

	public Societe(String nom, Adresse adresse, String contact, Collection<Utilisateur> utilisateur) {
		super();
		this.nom = nom;
		this.adresse = adresse;
		this.contact = contact;
		this.utilisateur = utilisateur;
	}

	

}
