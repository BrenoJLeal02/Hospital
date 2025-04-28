package com.hopital.breno.medico.service.impl;

import com.hopital.breno.exceptions.EntityNotFoundException;
import com.hopital.breno.medico.Medico;
import com.hopital.breno.medico.converter.DTOToMedicoConverter;
import com.hopital.breno.medico.converter.MedicoToDTOConverter;
import com.hopital.breno.medico.dto.MedicoDTO;
import com.hopital.breno.medico.repository.MedicoRespository;
import com.hopital.breno.medico.service.MedicoService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class MedicoServiceImpl implements MedicoService {

    private final MedicoRespository medicoRespository;

    @Override
    public MedicoDTO cadastrar(MedicoDTO medicoDTO) {
        Medico medico = DTOToMedicoConverter.convertDTOToMedico(medicoDTO);
        return MedicoToDTOConverter.convertToDTO(medicoRespository.save(medico));
    }
    @Override
    public void deletarMedico(Long id){
        if (!medicoRespository.existsById(id)){
            throw new EntityNotFoundException("Não existe um médico com o Id " + id );
        }
        medicoRespository.deleteById(id);
    }
}
