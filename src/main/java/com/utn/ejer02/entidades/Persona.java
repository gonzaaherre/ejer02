package com.utn.ejer02.entidades;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Persona implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;

    private String apellido;

    private int edad;
    @OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "domicilio_id")//asi se llama el campo en la tabla, se puede sacar y seria el nomrne de la variable
    private Domicilio domicilio;

}
