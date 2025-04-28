package com.hopital.breno.estudante.converter;

import com.hopital.breno.estudante.Estudante;
import com.hopital.breno.estudante.dto.EstudanteDTO;

public class DTOToEstudanteConverter {
    public static Estudante convertDTOToEstudante(EstudanteDTO estudanteDTO){
        Estudante estudante = new Estudante();
        estudante.setId(estudanteDTO.getId());
        estudante.setNome(estudanteDTO.getNome());
        return estudante;
    }
}
