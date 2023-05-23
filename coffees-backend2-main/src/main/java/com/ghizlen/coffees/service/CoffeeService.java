package com.ghizlen.coffees.service;

import java.util.List;

import com.ghizlen.coffees.entities.Coffee;
import com.ghizlen.coffees.entities.Type;

public interface CoffeeService {

	Coffee saveCoffee(Coffee s);
	Coffee updateCoffee(Coffee s);
	void deleteCoffee(Coffee s);
	void deleteCoffeeById(Long id);
	Coffee getCoffee(Long id);
	List<Coffee> getAllCoffees();
	
	List<Coffee> findByNomCoffee(String nom);
	List<Coffee> findByNomCoffeeContains(String nom);

	List<Coffee> findByType (Type type);
	List<Coffee> findByTypeIdType(Long id);
	List<Coffee> findByOrderByNomCoffeeAsc();
	List<Coffee> trierCoffeesprix();
	
}
