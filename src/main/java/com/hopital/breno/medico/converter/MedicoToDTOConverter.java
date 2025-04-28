package com.hopital.breno.medico.converter;

import com.hopital.breno.medico.Medico;
import com.hopital.breno.medico.dto.MedicoDTO;

public class MedicoToDTOConverter {
    public static MedicoDTO convertToDTO(Medico medico){
        MedicoDTO medicoDTO = new MedicoDTO();
        medicoDTO.setId(medico.getId());
        medicoDTO.setNome(medico.getNome());
        return medicoDTO;

    }
}
