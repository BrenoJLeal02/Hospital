package com.hopital.breno.hopital;

import com.hopital.breno.medico.Medico;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class Hospital {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String endereco;

//    @OneToMany(mappedBy = "hospital")
//    private List<Medico> medicos;
}
