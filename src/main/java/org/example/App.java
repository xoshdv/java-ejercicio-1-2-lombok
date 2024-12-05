package org.example;

import com.models.Persona; // Importa la clase Persona

public class App
{
    public static void main( String[] args ) {
        // Crear una instancia de Persona
        Persona persona = new Persona();

        // Usar setters
        persona.setNombre("Mark");
        persona.setEdad(33);

        // Usar getters
        System.out.println( "Nombre: " + persona.getNombre());
        System.out.println("Edad: " + persona.getEdad());
    }
}
