package com.ghizlen.coffees.repos;

import java.util.List;

import com.ghizlen.coffees.entities.Coffee;
import com.ghizlen.coffees.entities.Type;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "rest")
public interface CoffeeRepository extends JpaRepository<Coffee, Long> {
	List<Coffee> findByNomCoffee(String nom);
	 List<Coffee> findByNomCoffeeContains(String nom);
	 

	 
	 @Query("select c from Coffee c where c.nomCoffee like %:nom and c.prix > :prix ")
	 List<Coffee> findByNomCoffee (@Param("nom") String nom, @Param("prix") String prix);

	 @Query("select c from Coffee c where c.type = ?1")
	 List<Coffee> findByType (Type type);

	 List<Coffee> findByTypeIdType(Long id);
	 List<Coffee> findByOrderByNomCoffeeAsc();
	 
	 @Query("select c from Coffee c order by c.nomCoffee ASC ,  c.prix DESC")
	 List<Coffee> trierCoffeesprix ();

}
