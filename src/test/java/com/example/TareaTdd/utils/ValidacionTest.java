package com.example.TareaTdd.utils;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;



public class ValidacionTest {

    UsuarioUtils usuarioUtils;

    @BeforeEach
    public void inicializador(){
        usuarioUtils = new UsuarioUtils();
    }

    @Test
    @DisplayName("Test Nombre")
    public void testNombre(){
        String nombre= "Nombre";
        Assertions.assertTrue(usuarioUtils.validarNombreOApellido(nombre));
        
    }

    @Test
    @DisplayName("Test Apellido Paterno")
    public void testApellidoP(){
        String apellidoP = "ApellidoP";

        Assertions.assertTrue(usuarioUtils.validarNombreOApellido(apellidoP));

    }

    @Test
    @DisplayName("Test Apellido Materno")
    public void testApellidoM(){
        String apellidoM = "ApellidoM";

        Assertions.assertTrue(usuarioUtils.validarNombreOApellido(apellidoM));

    }


    @Test
    @DisplayName("Test Rut")
    public void testRut(){
        String rut = "25.100.475-7";

         Assertions.assertTrue(usuarioUtils.validarRut(rut));

    }

    @Test
    @DisplayName("Test Numero Telefonico")
    public void testNumero(){
        String numero = "12345678";

           Assertions.assertTrue(usuarioUtils.validarNumero(numero));

    }

    @Test
    @DisplayName("Test Edad")
    public void edad(){
        int edad = 25;

           Assertions.assertTrue(usuarioUtils.validarEdad(edad));

    }

  
}
