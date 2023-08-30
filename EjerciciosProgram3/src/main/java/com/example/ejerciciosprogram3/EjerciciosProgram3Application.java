package com.example.ejerciciosprogram3;

import com.example.ejerciciosprogram3.Entities.Persona;
import com.example.ejerciciosprogram3.repositorios.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class EjerciciosProgram3Application {

    @Autowired
    PersonaRepository rPersona;

    public static void main(String[] args) {
        SpringApplication.run(EjerciciosProgram3Application.class, args);
    }

    @Bean
    CommandLineRunner init(PersonaRepository rPersona) {
        return args -> {
            Persona personaEj2 = new Persona();
            personaEj2.setNombre("Valentin");
            personaEj2.setApellido("Gonzales");
            personaEj2.setEdad(15);

            rPersona.save(personaEj2);

            Persona personaEj2Recuperada = rPersona.findById(personaEj2.getId()).orElse(null);
            if (personaEj2Recuperada != null) {
                System.out.println("Nombre: " + personaEj2Recuperada.getNombre());
                System.out.println("Apellido: " + personaEj2Recuperada.getApellido());
                System.out.println("Edad: " + personaEj2Recuperada.getEdad());
                System.out.println("Domicilio: " + personaEj2Recuperada.getDomicilio());
            }
        };
    }
}
