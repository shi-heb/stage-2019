package com.itpeac.pressevent.middleoffice.domain;

import java.util.Collection;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import org.hibernate.annotations.Cascade;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Utilisateur {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable=false)
	private Long id_user;
	private String nom;
	private String prenom;
	private Date DateNaiss;
	private String Domain;
	private String telephone;
	private String email;
	@Embedded
	private Adresse local;
	@Enumerated(EnumType.STRING)
	private Fonction profession;
	private String linkImage;
	private String situationF;
	private String genre;

	@ManyToOne(optional=false)
	@JoinColumn(name = "ID_SOC",referencedColumnName="id_societe",insertable=false, updatable=false)
	private Societe societe;

	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "USERS_ROLES", joinColumns = { @JoinColumn(name = "USER_ID") }, inverseJoinColumns = {
			@JoinColumn(name = "ROLE_ID") })
	private List<Role> roles;

	@OneToMany(mappedBy = "utilisateur", fetch = FetchType.LAZY,cascade =  CascadeType.MERGE)
	//@Cascade(org.hibernate.annotations.CascadeType.DELETE_ORPHAN)
	private Collection<Evenement> evenement;

	public Long getId() {
		return id_user;
	}

	public void setId(Long id) {
		this.id_user = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public Date getDateNaiss() {
		return DateNaiss;
	}

	public void setDateNaiss(Date dateNaiss) {
		DateNaiss = dateNaiss;
	}

	public String getDomain() {
		return Domain;
	}

	public void setDomain(String domain) {
		Domain = domain;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Adresse getLocal() {
		return local;
	}

	public void setLocal(Adresse local) {
		this.local = local;
	}

	@Enumerated(EnumType.STRING)
	public Fonction getProfession() {
		return profession;
	}

	public void setProfession(Fonction profession) {
		this.profession = profession;
	}

	public String getLinkImage() {
		return linkImage;
	}

	public void setLinkImage(String linkImage) {
		this.linkImage = linkImage;
	}

	public String getSituationF() {
		return situationF;
	}

	public void setSituationF(String situationF) {
		this.situationF = situationF;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public List<Role> getRoles() {
		return roles;
	}

	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}

	public Utilisateur() {
		super();
		// TODO Auto-generated constructor stub
	}
@JsonIgnore
	public Collection<Evenement> getEvenement() {
		return evenement;
	}

	public void setEvenement(Collection<Evenement> evenement) {
		this.evenement = evenement;
	}

	public Utilisateur(String nom, String prenom, Date dateNaiss, String domain, String telephone, String email,
			Adresse local, Fonction profession,String linkImage,String situationF,String genre, Societe societe,
			List<Role> roles, Collection<Evenement> evenement) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		DateNaiss = dateNaiss;
		Domain = domain;
		this.telephone = telephone;
		this.email = email;
		this.local = local;
		this.profession = profession;
		this.linkImage = linkImage;
		this.situationF = situationF;
		this.genre = genre;
		this.societe = societe;
		this.roles = roles;
	this.evenement = evenement;
	}

	public Utilisateur(Long id_user) {
		super();
		this.id_user = id_user;
	}
	


}
