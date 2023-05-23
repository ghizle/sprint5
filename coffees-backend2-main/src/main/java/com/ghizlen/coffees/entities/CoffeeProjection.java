package com.ghizlen.coffees.entities;

import org.springframework.data.rest.core.config.Projection;

@Projection(name = "nomCof", types = { Coffee.class })
public interface CoffeeProjection {
	public String getNomCoffee();
}
