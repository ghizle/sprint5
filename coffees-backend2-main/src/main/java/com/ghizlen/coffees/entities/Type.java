package com.ghizlen.coffees.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Type {
   

	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idType;
    
	private String nomType;
	
	
	@JsonIgnore
	@OneToMany(mappedBy="type")
	private List<Coffee> Coffees;
	
	 public Type(long l, String nomType) {
			this.idType=l;
			this.nomType=nomType;
			
		}
}
