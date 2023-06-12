package com.example.TareaTdd.entidades;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Usuario {

    private String nombre;
    private String apellidoP;
    private String apellidoM;
    private String rut;
    private String numero;
    private int edad;
    
}
