package com.utn.ejer02.repositorios;

import com.utn.ejer02.entidades.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonaRepository extends JpaRepository<Persona, Long> {


}
