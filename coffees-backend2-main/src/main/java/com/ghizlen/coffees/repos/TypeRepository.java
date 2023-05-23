package com.ghizlen.coffees.repos;

import com.ghizlen.coffees.entities.Type;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;


@RepositoryRestResource(path="typ")
@CrossOrigin(origins="http://localhost:4200")//pour autoriser angular
public interface TypeRepository extends JpaRepository<Type, Long>{

	

}
