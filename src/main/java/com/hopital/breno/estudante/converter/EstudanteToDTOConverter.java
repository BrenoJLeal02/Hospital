package com.hopital.breno.estudante.converter;

import com.hopital.breno.estudante.Estudante;
import com.hopital.breno.estudante.dto.EstudanteDTO;

public class EstudanteToDTOConverter {
    public static EstudanteDTO convertEstudanteToDTO(Estudante estudante) {
        EstudanteDTO estudanteDTO = new EstudanteDTO();
        estudanteDTO.setId(estudante.getId());
        estudanteDTO.setNome(estudante.getNome());
        return estudanteDTO;
    }
}
