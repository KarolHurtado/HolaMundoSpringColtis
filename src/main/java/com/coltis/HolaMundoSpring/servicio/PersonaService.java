package com.coltis.HolaMundoSpring.servicio;

import com.coltis.HolaMundoSpring.domain.Persona;
import java.util.List;


//nuestra interfaz en el cual haremos todas las peticiones que vamos a usar
//Aca declaramos todos los metodos CRUD pero solo lo mencionamos
public interface PersonaService {

    public List<Persona> listarPersonas();

    public void guardar(Persona persona);

    public void eliminar(Persona persona);

    public Persona encontrarPersona(Persona persona);
}
