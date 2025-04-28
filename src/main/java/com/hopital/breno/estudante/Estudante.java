package com.hopital.breno.estudante;

import com.hopital.breno.hopital.Hospital;
import com.hopital.breno.medico.Medico;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Estudante {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;

//    @ManyToOne
//    @JoinColumn(name = "hospital_id")
//    private Hospital hospital;
//
//    @ManyToOne
//    @JoinColumn(name = "medico_id")
//    private Medico medico;
}
