package fr.istic.tpjpa.jpa;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Home {
	private String adresse;
	private int superficie;
	private String ip;
		
	public Home() {
	}
	public Home(String adresse, int superficie, String ip) {
		this.adresse = adresse;
		this.superficie = superficie;
		this.ip = ip;
		}
	
	@Id
	@GeneratedValue
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	
	public int getSuperficie() {
		return superficie;
	}
	public void setSuperficie(int superficie) {
		this.superficie = superficie;
	}
	
	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}
	
	@Override
	public String toString() {
		return "Home [Adresse = " + adresse + ", Superficie = " + superficie + ", IP = "
				 + ip + "]";
	}
}