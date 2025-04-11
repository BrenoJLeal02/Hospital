package com.hopital.breno.hopital.converter;

import com.hopital.breno.hopital.Hospital;
import com.hopital.breno.hopital.dto.HospitalDTO;

public class DTOToHospitalConverter {
    public static Hospital convert(HospitalDTO dto){
        Hospital hospital= new Hospital();
        hospital.setId(dto.getId());
        hospital.setNome(dto.getNome());
        hospital.setEndereco((dto.getEndereco()));
        return hospital;
    }
}
