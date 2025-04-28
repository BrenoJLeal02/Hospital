package com.hopital.breno.medico.repository;

import com.hopital.breno.medico.Medico;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MedicoRespository extends JpaRepository<Medico, Long> {
}
