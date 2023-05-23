package com.ghizlen.coffees.entities;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

//import entities.com.ghizlen.coffees.Type;

@Entity
public class Coffee {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long idCoffee;
private String nomCoffee;
private String prix;
private Date dateDiffusion;

@ManyToOne
private Type type;

@OneToOne
private Image image;

public Coffee() {
	super();
}


public Coffee(String nomCoffee, String prix, Date dateDiffusion, Type typs) {
	super();
	this.nomCoffee = nomCoffee;
	this.prix = prix;
	this.dateDiffusion = dateDiffusion;
	this.type=typs;
	
}


public Long getIdCoffee() {
	return idCoffee;
}
public void setIdCoffee(Long idCoffee) {
	this.idCoffee = idCoffee;
}
public String getNomCoffee() {
	return nomCoffee;
}
public void setNomCoffee(String nomCoffee) {
	this.nomCoffee = nomCoffee;
}
public String getprix() {
	return prix;
}
public void setprix(String prix) {
	this.prix = prix;
}
public Date getDateDiffusion() {
	return dateDiffusion;
}
public void setDateDiffusion(Date dateDiffusion) {
	this.dateDiffusion = dateDiffusion;
}


@Override
public String toString() {
	return "Coffee [idCoffee=" + idCoffee + ", nomCoffee=" + nomCoffee + ", prix=" + prix + ", dateDiffusion="
			+ dateDiffusion + "]";
}
public Type getType() {
	return type;
}
public void setType(Type type) {
	this.type=type;
}


public Image getImage() {
	return image;
}


public void setImage(Image image) {
	this.image = image;
}


	
}
