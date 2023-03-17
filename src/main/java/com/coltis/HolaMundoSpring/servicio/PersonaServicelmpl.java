package com.coltis.HolaMundoSpring.servicio;

import com.coltis.HolaMundoSpring.dao.PersonaDao;
import com.coltis.HolaMundoSpring.domain.Persona;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service   //Anotacion para decirt que la clase como un SERVICIO de Spring

public class PersonaServicelmpl implements PersonaService {

    @Autowired //Inyeccion  de dependencias de la interfazPersona DAO
    private PersonaDao PersonaDao;

    @Override
    @Transactional(readOnly = true)   //Anotacion para declarar la transaccionalidad del metodo
    public List<Persona> listarPersonas() {   
        //Llamada al metodo FIND ALLde personaDao para listar las personas
        return (List<Persona>) PersonaDao.findAll(); 
    }
    //Con save,delte, 3 nos ahorramos las setencias SQL

    @Override
    @Transactional
    public void guardar(Persona persona) {
        PersonaDao.save(persona);
    }
    
    

    @Override
    @Transactional
    public void eliminar(Persona persona) {
        PersonaDao.delete(persona);
    }

    @Override
    @Transactional(readOnly = true)
    public Persona encontrarPersona(Persona persona) {
        return PersonaDao.findById(persona.getIdPersona()).orElse(null);
    }

}