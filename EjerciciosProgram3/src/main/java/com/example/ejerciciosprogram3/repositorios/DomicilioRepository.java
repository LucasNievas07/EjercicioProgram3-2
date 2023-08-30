package com.example.ejerciciosprogram3.repositorios;

import com.example.ejerciciosprogram3.Entities.Domicilio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DomicilioRepository extends JpaRepository<Domicilio, Long> {
}
