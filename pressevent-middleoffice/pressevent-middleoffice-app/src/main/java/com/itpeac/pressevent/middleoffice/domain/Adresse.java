package com.itpeac.pressevent.middleoffice.domain;
import javax.persistence.Embeddable;

@Embeddable
public class Adresse     {
	
	private Long id_adresse;
	private String rue;
	private String ville;
	private String pays;

	public Adresse(String rue, String ville, String pays) {
		super();
		this.rue = rue;
		this.ville = ville;
		this.pays = pays;
	}

	public Adresse() {
		super();
	}

	public Long getId() {
		return id_adresse;
	}

	public void setId(Long id) {
		this.id_adresse = id;
	}

	public String getRue() {
		return rue;
	}

	public void setRue(String rue) {
		this.rue = rue;
	}

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

	@Override
	public String toString() {
		return "Adresse [id=" + id_adresse + ", rue=" + rue + ", ville=" + ville + ", pays=" + pays + "]";
	}

	public Adresse(String ville) {
		super();
		this.ville = ville;
	}

	public Adresse(String ville, String pays) {
		super();
		this.ville = ville;
		this.pays = pays;
	}

	
	
	

}
