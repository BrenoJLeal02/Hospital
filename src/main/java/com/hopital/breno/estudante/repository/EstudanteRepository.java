package com.hopital.breno.estudante.repository;

import com.hopital.breno.estudante.Estudante;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EstudanteRepository extends JpaRepository<Estudante, Long> {
}
