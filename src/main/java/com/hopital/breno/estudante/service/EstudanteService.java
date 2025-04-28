package com.hopital.breno.estudante.service;

import com.hopital.breno.estudante.dto.EstudanteDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface EstudanteService {
    List<EstudanteDTO> listarTodos();
    EstudanteDTO registro(EstudanteDTO estudanteDTO);
    void deletarEstudante(Long id);
}
