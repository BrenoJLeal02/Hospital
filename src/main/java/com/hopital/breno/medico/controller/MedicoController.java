package com.hopital.breno.medico.controller;

import com.hopital.breno.medico.Medico;
import com.hopital.breno.medico.dto.MedicoDTO;
import com.hopital.breno.medico.service.MedicoService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/medico")
@AllArgsConstructor
public class MedicoController {
    private final MedicoService medicoService;
    @PostMapping
    public MedicoDTO cadastrar(@RequestBody MedicoDTO medicoDTO) {
        return medicoService.cadastrar(medicoDTO);
    }
    @DeleteMapping("/{id}")
    public void deletarMedico(@PathVariable Long id) {
        medicoService.deletarMedico(id);
    }
}
