package com.hopital.breno.hopital.repository;

import com.hopital.breno.hopital.Hospital;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HospitalRepository extends JpaRepository<Hospital, Long> {
    boolean existsByNome(String nome);
}
