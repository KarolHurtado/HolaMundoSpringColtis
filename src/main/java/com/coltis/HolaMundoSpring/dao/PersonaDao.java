
package com.coltis.HolaMundoSpring.dao;

import com.coltis.HolaMundoSpring.domain.Persona;
import org.springframework.data.repository.CrudRepository;


//Extendemos de interfaz CRUD Repository que nos da proceso de CRUD incluidos si necesidad de sentencias SQL
public interface PersonaDao extends CrudRepository<Persona,Long>{  
     
}
