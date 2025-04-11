package com.hopital.breno.hopital.service;

import com.hopital.breno.hopital.dto.HospitalDTO;

import java.util.List;
import java.util.Optional;

public interface HospitalService {
    HospitalDTO cadastrar(HospitalDTO dto);
    List<HospitalDTO> listarTodos();
    HospitalDTO buscarPorId(Long id);
    void deletarPorId(Long id);
}
