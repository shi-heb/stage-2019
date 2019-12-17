package com.itpeac.pressevent.middleoffice.domain;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
@Entity
public class Image {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String link;
	//@OneToOne(cascade = {CascadeType.PERSIST})
	//@JoinColumn(name="id_even")
	//private Evenement  evenement ;

	public Image(String link) {
		super();
		this.link = link;
	}

	public Image() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	@Override
	public String toString() {
		return "image [id=" + id + ", link=" + link + "]";
	}

	public Image(Long id) {
		super();
		this.id = id;
	}
	
	

}
