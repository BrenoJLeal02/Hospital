package com.hopital.breno.medico;

import com.hopital.breno.estudante.Estudante;
import com.hopital.breno.hopital.Hospital;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class Medico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;

//    @ManyToOne
//    @JoinColumn(name = "hospital_id")
//    private Hospital hospital;
//
//    @OneToMany(mappedBy = "medicoResponsavel")
//    private List<Estudante> estudantes;

}
