package com.ghizlen.coffees;

import java.util.Date;
import java.util.List;

import com.ghizlen.coffees.entities.Coffee;
import com.ghizlen.coffees.repos.CoffeeRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.ghizlen.coffees.entities.Type;

@SpringBootTest
class CoffeesApplicationTests {
	@Autowired
  private CoffeeRepository coffeeRepository;
	@Test
	public void testCreateCoffee() {
		Type typ=new Type(1L,"Coffee");
		Coffee cof = new Coffee("Legend of the blue sea","Coréen",new Date(),typ);
	    coffeeRepository.save(cof);
   }
	
	 @Test
	  public void testFindCoffee() {
		  Coffee c= coffeeRepository.findById(3L).get();
		  System.out.println(c);
	  }
	 @Test
	 public void testUpdateCoffee() {
		 Coffee c= coffeeRepository.findById(3L).get();
		 c.setNomCoffee("annabelleeee");
		 coffeeRepository.save(c);
	 }
	 @Test
	 public void testDeleteCoffee() {
		 coffeeRepository.deleteById(31L);
	 }
	 @Test
	 public void testListerTousCoffees() {
		 List<Coffee> cofs= coffeeRepository.findAll();
		 for (Coffee c:cofs)
		 {
			 System.out.println(c);
		 }
	 }
	 
	 @Test
	  public void testFindCoffeeByNom() {
		 List <Coffee> cofs= coffeeRepository.findByNomCoffee("niscafee");
		 for (Coffee c:cofs)
		 {
			 System.out.println(c);
		 }
	  }
	 @Test
	  public void testFindCoffeeByNomContains() {
		 List <Coffee> cofs= coffeeRepository.findByNomCoffeeContains("sea");
		 for (Coffee c:cofs)
		 {
			 System.out.println(c);
		 }
	  }
	 @Test
	 public void testfindByNomCoffee()
	 {
	 List<Coffee> cofs = coffeeRepository.findByNomCoffee("niscaffee");
	 for (Coffee c : cofs)
	 {
	 System.out.println(c);
	 }
	 }

	 @Test
	 public void testfindByType()
	 {
	 Type type = new Type();
	 type.setIdType(2L);
	 List<Coffee> cofs = coffeeRepository.findByType(type);
	 for (Coffee c : cofs)
	 {
	 System.out.println(c);
	 }
	 }
	 @Test
	 public void findByTypeIdType()
	 {
	 List<Coffee> cofs = coffeeRepository.findByTypeIdType(1L);
	 for (Coffee c : cofs)
	 {
	 System.out.println(c);
	 }
	  }
	 @Test
	 public void testfindByOrderByNomCoffeeAsc()
	 {
	 List<Coffee> cofs =
	 coffeeRepository.findByOrderByNomCoffeeAsc();
	 for (Coffee c : cofs)
	 {
	 System.out.println(c);
	 }

	 }

	
	
	}

