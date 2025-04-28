package com.hopital.breno.medico.converter;

import com.hopital.breno.medico.Medico;
import com.hopital.breno.medico.dto.MedicoDTO;

public class DTOToMedicoConverter {
    public static Medico convertDTOToMedico(MedicoDTO medicoDTO) {
        Medico medico = new Medico();
        medico.setId(medicoDTO.getId());
        medico.setNome(medicoDTO.getNome());

        return medico;
    }
}
