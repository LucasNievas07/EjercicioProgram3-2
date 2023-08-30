package com.example.ejerciciosprogram3.repositorios;

import com.example.ejerciciosprogram3.Entities.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonaRepository extends JpaRepository<Persona, Long> {
}
