package fr.istic.tpjpa.jpa;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Personne {
	private String nom;
	private String prenom;
	private String genre;
	private String mail;
	private Date naissance;
	private String facebook;
	
	public Personne() {
	}
	public Personne(String nom, String prenom, String genre, String mail, String facebook, Date naissance) {
		this.nom = nom;
		this.prenom = prenom;
		this.genre = genre;
		this.mail = mail;
		this.naissance = naissance;
		this.facebook = facebook;
	}
	
	@Id
	@GeneratedValue
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
	
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	
	public String getFacebook() {
		return facebook;
	}
	public void setFacebook(String facebook) {
		this.facebook = facebook;
	}
	
	public Date getNaissance() {
		return naissance;
	}
	public void setNaissance(Date naissance) {
		this.naissance = naissance;
	}
	
	@Override
	public String toString() {
		return "Personne [nom = " + nom + ", prénom = " + prenom + ", Date de naissance = "
				+ naissance + ", Genre = " + genre + ", Facebook = " + facebook + "]";
	}
}