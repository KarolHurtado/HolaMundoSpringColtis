package com.coltis.HolaMundoSpring.domain;

import java.io.Serializable;
import javax.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "persona")
public class Persona implements Serializable {

    // Atributos de instancia de Persona
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    /*Esta anotacion se utiliza para especificar cómo se generará el valor de la clave primaria. 
    En este caso, se está utilizando la estrategia de identidad de la base de datos para generar 
    automáticamente un valor único para la clave primaria*/
    private Long idPersona;
    private String nombre; 
    private String apellido; 
    private String email; 
    private String telefono; 

}
