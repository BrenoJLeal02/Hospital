package com.hopital.breno.hopital.service.impl;

import com.hopital.breno.exceptions.CadastroInvalidoException;
import com.hopital.breno.exceptions.EntityNotFoundException;
import com.hopital.breno.hopital.Hospital;
import com.hopital.breno.hopital.converter.HospitalToDTOConverter;
import com.hopital.breno.hopital.dto.HospitalDTO;
import com.hopital.breno.hopital.repository.HospitalRepository;
import com.hopital.breno.hopital.service.HospitalService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

import static com.hopital.breno.hopital.converter.DTOToHospitalConverter.convertDTOToHospital;

@Service
@AllArgsConstructor
public class HospitalServiceImpl implements HospitalService {
    private final HospitalRepository hospitalRepository;

    @Override
    public HospitalDTO cadastrar(HospitalDTO dto) {
        validarCadastro(dto);
        Hospital hospital = convertDTOToHospital(dto);
        return HospitalToDTOConverter.convertHospitalToDTO(hospitalRepository.save(hospital));
    }

    private void validarCadastro(HospitalDTO dto) {
        if (dto.getNome() == null || dto.getNome().trim().isEmpty()) {
            throw new CadastroInvalidoException("O nome do hospital é obrigatório.");
        }
        boolean existe = hospitalRepository.existsByNome(dto.getNome());
        if (existe) {
            throw new CadastroInvalidoException("Já existe um hospital com o nome informado.");
        }
    }

    @Override
    public List<HospitalDTO> listarTodos(){
        List<Hospital> hospitais = hospitalRepository.findAll();

        if(hospitais.isEmpty()) {
            throw new EntityNotFoundException("Não existe nenhum hospital cadastrado");
        }

        return hospitais.stream()
                .map(HospitalToDTOConverter::convertHospitalToDTO)
                .collect(Collectors.toList());
    }

    @Override
    public HospitalDTO buscarPorId(Long id){
        Hospital hospital = hospitalRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Não foi encontrado um Hospital com o ID: " + id));
        return HospitalToDTOConverter.convertHospitalToDTO(hospital);

    }

    @Override
    public void deletarPorId(Long id){
        if(!hospitalRepository.existsById(id)){
            throw new EntityNotFoundException("Não existe um Hospital com o ID " + id);
        }
        hospitalRepository.deleteById(id);
    }
}
