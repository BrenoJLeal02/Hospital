package com.hopital.breno.medico.service;

import com.hopital.breno.medico.Medico;
import com.hopital.breno.medico.dto.MedicoDTO;

import java.util.List;

public interface MedicoService {
//    List<MedicoDTO> listarTodos();
//    MedicoDTO buscarPorNome(String nome);
    void deletarMedico(Long id);
    MedicoDTO cadastrar(MedicoDTO medicoDTO);

}
