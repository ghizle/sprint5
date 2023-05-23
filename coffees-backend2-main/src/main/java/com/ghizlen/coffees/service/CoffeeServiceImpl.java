package com.ghizlen.coffees.service;

import java.util.List;

import com.ghizlen.coffees.entities.Coffee;
import com.ghizlen.coffees.entities.Type;
import com.ghizlen.coffees.repos.ImageRepository;
import com.ghizlen.coffees.repos.CoffeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CoffeeServiceImpl implements CoffeeService {

	@Autowired
	CoffeeRepository coffeeRepository;
	
	@Autowired
    ImageRepository imageRepository;
	
	@Override
	public Coffee saveCoffee(Coffee s) {
		return coffeeRepository.save(s);
	}

//	@Override
//	public Coffee updateCoffee(Coffee s) {
//		return CoffeeRepository.save(s);
//	}

	@Override
	public Coffee updateCoffee(Coffee c) {
		Long oldProdImageId = this.getCoffee(c.getIdCoffee()).getImage().getIdImage();
		Long newProdImageId = c.getImage().getIdImage();
		Coffee prodUpdated = coffeeRepository.save(c);
		if (oldProdImageId != newProdImageId) // si l'image a été modifiée
			imageRepository.deleteById(oldProdImageId);
		return prodUpdated;
	}

	@Override
	public void deleteCoffee(Coffee c) {
		coffeeRepository.delete(c);
	}

	@Override
	public void deleteCoffeeById(Long id) {
		coffeeRepository.deleteById(id);
	}

	@Override
	public Coffee getCoffee(Long id) {
		return coffeeRepository.findById(id).get();
	}

	@Override
	public List<Coffee> getAllCoffees() {
		return coffeeRepository.findAll();
	}

	@Override
	public List<Coffee> findByNomCoffee(String nom) {
		return coffeeRepository.findByNomCoffee(nom);
	}

	@Override
	public List<Coffee> findByNomCoffeeContains(String nom) {
		return coffeeRepository.findByNomCoffeeContains(nom);
	}



	@Override
	public List<Coffee> findByType(Type type) {
		return coffeeRepository.findByType(type);

	}

	@Override
	public List<Coffee> findByTypeIdType(Long id) {
		return coffeeRepository.findByTypeIdType(id);
	}

	@Override
	public List<Coffee> findByOrderByNomCoffeeAsc() {
		return coffeeRepository.findByOrderByNomCoffeeAsc();

	}

	@Override
	public List<Coffee> trierCoffeesprix() {
		return coffeeRepository.trierCoffeesprix();
	}

}
