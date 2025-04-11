package com.hopital.breno.hopital.controller;

import com.hopital.breno.hopital.dto.HospitalDTO;
import com.hopital.breno.hopital.service.HospitalService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/hospital")
@AllArgsConstructor
public class HospitalController {

    private final HospitalService hospitalService;

    @PostMapping
    public HospitalDTO cadastrar(@RequestBody HospitalDTO dto){
        return hospitalService.cadastrar(dto);
    }
    @GetMapping
    public List<HospitalDTO> listarTodos(){
        return hospitalService.listarTodos();
    }
    @GetMapping("/{id}")
    public HospitalDTO buscarPorId(@PathVariable Long id){
        return hospitalService.buscarPorId(id);
    }
    @DeleteMapping("/{id}")
    public void deletarPorId(@PathVariable Long id){
        hospitalService.deletarPorId(id);
    }
}
