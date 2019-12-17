package com.itpeac.pressevent.middleoffice.domain;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
public class Evenement implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable=false)
	private Long id_even;
	private String nom;
	private String description;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
	private Date DatePub;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
	private Date DateExpiration;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
	private Date dateDebut;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
	private Date dateFin;
	@Embedded
	private Adresse location;
	private String contact;	
	@ManyToOne(optional=false,cascade= {CascadeType.MERGE})  
	@JoinColumn(name = "ID_USER",referencedColumnName="id_user"/*, insertable=false, updatable=false*/)
	private Utilisateur utilisateur;
	private Float lat;
	private Float lg;
	private String email ;
	private String lien;

	
	@ManyToOne(optional=false,cascade= { CascadeType.MERGE})
	@JoinColumn(name = "ID_SECTEUR",referencedColumnName="id_secteur")
	private Secteur secteur;

	
	@ManyToOne(cascade= { CascadeType.MERGE}, fetch=FetchType.EAGER,optional=false)/*(optional=false)*/
	@JoinColumn(name = "ID_TYP",referencedColumnName="id_type"/*, insertable=false, updatable=false*/)
	private Type type;

	//@OneToOne(mappedBy = "evenement", fetch = FetchType.EAGER)
	//@JoinColumn(name = "ID",referencedColumnName="id")
	private String image;

	public String getImage() {
		return image;
		
	}

	public void setImage(String image) {
		this.image = image;
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

	public Long getId() {
		return id_even;
	}

	public void setId(Long id) {
		this.id_even = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getDatePub() {
		return DatePub;
	}

	public void setDatePub(Date datePub) {
		DatePub = datePub;
	}

	public Date getDateExpiration() {
		return DateExpiration;
	}

	public void setDateExpiration(Date dateExpiration) {
		DateExpiration = dateExpiration;
	}

	public Date getDateDebut() {
		return dateDebut;
	}

	public void setDateDebut(Date dateDebut) {
		this.dateDebut = dateDebut;
	}

	public Date getDateFin() {
		return dateFin;
	}

	public void setDateFin(Date dateFin) {
		this.dateFin = dateFin;
	}

	public Adresse getLocation() {
		return location;
	}

	public void setLocation(Adresse location) {
		this.location = location;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public Utilisateur getUtilisateur() {
		return utilisateur;
	}

	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
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

	public Evenement() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Evenement(String nom, String description, Date datePub, Date dateExpiration, Date dateDebut, Date dateFin,
			Adresse location, String contact, Utilisateur utilisateur, Secteur secteur, Type type,
			String image) {
		super();
		this.nom = nom;
		this.description = description;
		this.DatePub = datePub;
		this.DateExpiration = dateExpiration;
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
		this.location = location;
		this.contact = contact;
		this.utilisateur = utilisateur;
		this.secteur = secteur;
		this.type = type;
		this.image = image;
	}

	public Evenement( String nom, String description) {
		this.nom = nom;
		this.description = description;
	}
	public void setLocation(String pays, String ville) { 
		if (location == null) {
			location = new Adresse(ville, pays);
		}
		

	}

	public Evenement(Long id_even, String nom, String description, Date datePub, Date dateExpiration, Date dateDebut,
			Date dateFin, Adresse location, String contact, Utilisateur utilisateur, Float lat, Float lg, String email,
			String lien, Secteur secteur, Type type, String image) {
		super();
		this.id_even = id_even;
		this.nom = nom;
		this.description = description;
		this.DatePub = datePub;  
		this.DateExpiration = dateExpiration;
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
		this.location = location;
		this.contact = contact;
		this.utilisateur = utilisateur;
		this.lat = lat;
		this.lg = lg;
		this.email = email;
		this.lien = lien;
		this.secteur = secteur;
		this.type = type;
		this.image = image;
	}

	

	
	

}
