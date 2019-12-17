package com.itpeac.pressevent.middleoffice.domain;

import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.hibernate.annotations.Cascade;

import com.fasterxml.jackson.annotation.JsonIgnore;
@Entity
public class Type {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_type;
	private String titre;
	
	@OneToMany(mappedBy = "type", fetch = FetchType.LAZY,cascade = CascadeType.MERGE)
	//@Cascade(org.hibernate.annotations.CascadeType.DELETE_ORPHAN)
	private Collection<Evenement> evenement;


	public Type(String titre, Collection<Evenement> evenement) {
		super();
		this.titre = titre;
		this.evenement = evenement;
	}
	@JsonIgnore
	public Collection<Evenement> getEvenement() {
		return evenement;
	}

	public void setEvenement(Collection<Evenement> evenement) {
		this.evenement = evenement;
	}

	public Type() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getId() {
		return id_type;
	}

	public void setId(Long id) {
		this.id_type = id;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	@Override
	public String toString() {
		return "Type [id=" + id_type + ", titre=" + titre + "]";
	}
	public Type(Long id_type) {
		super();
		this.id_type = id_type;
	}
	
	
	
	

}
