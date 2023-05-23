package com.ghizlen.coffees.restcontrollers;

import java.util.List;

import com.ghizlen.coffees.entities.Coffee;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


//import repos.com.ghizlen.coffees.CoffeeRepository;
import com.ghizlen.coffees.service.CoffeeService;


@RestController
@RequestMapping("/api")
@CrossOrigin(origins="*")
public class CoffeeRESTController {
	@Autowired
	CoffeeService coffeeService;
	
	
	@RequestMapping(path="all", method = RequestMethod.GET)
	public List<Coffee> getAllCoffees() {
	return coffeeService.getAllCoffees();
		
	}
	@RequestMapping(value="/getbyid/{id}",method = RequestMethod.GET)
	public Coffee getCoffeetById(@PathVariable("id") Long id) {
	return coffeeService.getCoffee(id);}
	
	@RequestMapping(value="/addcof",method = RequestMethod.POST)
	//@PostMapping("/addser")
	public Coffee createProduit(@RequestBody Coffee coffee) {
	return coffeeService.saveCoffee(coffee);
	}
		    		  
		    		  
	@RequestMapping(value="/updatecof",method = RequestMethod.PUT)
	public Coffee updateCoffee(@RequestBody Coffee coffee) {
	return coffeeService.updateCoffee(coffee);
	}
	@RequestMapping(value="/delcof/{id}",method = RequestMethod.DELETE)
	public void deleteCoffee(@PathVariable("id") Long id)
	{
	coffeeService.deleteCoffeeById(id);
	}
	@RequestMapping(value="/cofstyp/{idType}",method = RequestMethod.GET)
	public List<Coffee> getCoffeesByTypeId(@PathVariable("idType") Long idType) {
	return coffeeService.findByTypeIdType(idType);
	}
	@RequestMapping(value="/cofsByName/{nom}",method = RequestMethod.GET)
	public List<Coffee> findByNomCoffeeContains(@PathVariable("nom") String nom) {
	return coffeeService.findByNomCoffeeContains(nom);
	}

	
}
