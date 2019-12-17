package com.itpeac.pressevent.middleoffice.domain;

import java.util.Collection;
import java.util.Date;

import javax.persistence.Embedded;
import javax.tools.DocumentationTool.Location;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;


//@Entity
public class EvenementDTO {
	private long id;
	@Embedded
	private Adresse location;
	private String nom;
	private String Contact;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
	private Date dateDebut;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
	private Date DatePub;
	private String description;
	private String image;
	//private String rue;
	private String ville;
	private String pays;
	private Type type;
	private Secteur secteur;
	private Utilisateur utilisateur;
	private Float lat;
	private Float lg;
	private String email ;
	private String lien;
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getContact() {
		return Contact;
	}
	public void setContact(String contact) {
		Contact = contact;
	}
	public Date getDateDebut() {
		return dateDebut;
	}
	public void setDateDebut(Date dateDebut) {
		this.dateDebut = dateDebut;
	}
	public Date getDatePub() {
		return DatePub;
	}
	public void setDatePub(Date datePub) {
		DatePub = datePub;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {  
		this.image = image;
	}
//	public String getRue() {
//		return rue;
//	}
//	public void setRue(String rue) {
//		this.rue = rue;
//	}
	public String getVille() {
		return ville;
	}
	public void setVille(String ville) {
		this.ville = ville;
	}
	public String getPays() {
		return pays;
	}
	public void setPays(String pays) {
		this.pays = pays;
	}
	public Type getType() {
		return type;
	}
	public void setType(Type type) {
		this.type = type;
	}
	public Secteur getSecteur() {
		return secteur;
	}
	public void setSecteur(Secteur secteur) {
		this.secteur = secteur;
	}
	public Utilisateur getUtilisateur() {
		return utilisateur;
	}
	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}
	public EvenementDTO(String nom, String contact, Date dateDebut, Date datePub, String description,
			String image,/* String rue, */String ville, String pays, Type type, Secteur secteur,
			Utilisateur utilisateur) {
		super();
		this.nom = nom;
		this.Contact = contact;
		this.dateDebut = dateDebut;
		this.DatePub = datePub;
		this.description = description;
		this.image = image;
		//this.rue = rue;
		this.ville = ville;
		this.pays = pays;
		this.type = type;
		this.secteur = secteur;
		this.utilisateur = utilisateur;
	}
	public float getLat() {
		return lat;
	}
	public void setLat(Float lat) {
		this.lat = lat;
	}
	public float getLg() {
		return lg;
	}
	public void setLg(Float lg) {
		this.lg = lg;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getLien() {
		return lien;
	}
	public void setLien(String lien) {
		this.lien = lien;
	}
	//@JsonCreator
	public EvenementDTO(String nom, String contact, Date dateDebut, Date datePub, String description,
			String image, /*String rue,*/ String ville, String pays, Type type, Secteur secteur,
			Utilisateur utilisateur, Float lat, Float lg, String email, String lien) {
		super();
		this.nom = nom;
		this.Contact = contact;
		this.dateDebut = dateDebut;
		this.DatePub = datePub;
		this.description = description;
		this.image = image;
		//this.rue = rue;
		this.ville = ville;
		this.pays = pays;
		this.type = type;
		this.secteur = secteur;
		this.utilisateur = utilisateur;
		this.lat = lat;
		this.lg = lg;
		this.email = email;
		this.lien = lien;
	}
	public EvenementDTO() {
		super();
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public Adresse getLocation() {
		return location;
	}
	public void setLocation(Adresse location) {
		this.location = location;
	}
	
	
	
	public void setLocation(String pays, String ville) { 
		if (location == null) {
			location = new Adresse(ville, pays);
		}
	
		

	}
	
	
	
	
	
	
	
	
	
	
	

	
}
