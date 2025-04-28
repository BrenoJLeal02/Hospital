package com.hopital.breno.hopital.converter;

import com.hopital.breno.hopital.Hospital;
import com.hopital.breno.hopital.dto.HospitalDTO;

public class HospitalToDTOConverter {
    public static HospitalDTO convertHospitalToDTO(Hospital hospital) {
        HospitalDTO dto= new HospitalDTO();
        dto.setId(hospital.getId());
        dto.setNome(hospital.getNome());
        dto.setEndereco(hospital.getEndereco());
        return dto;
    }
}
