package com.example.TareaTdd.utils;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ValidacionTest {

    UsuarioUtils usuarioUtils;

    @BeforeEach
    public void inicializador() {
        usuarioUtils = new UsuarioUtils();
    }

    @Test
    @DisplayName("Test Nombre")
    public void testNombre() {
        String nombre = "Nombre";
        String nombre1 = "Nombre1234";
        String nombre2 = "";

        Assertions.assertTrue(usuarioUtils.validarNombreOApellido(nombre));

        Assertions.assertFalse(usuarioUtils.validarNombreOApellido(nombre1));
        Assertions.assertFalse(usuarioUtils.validarNombreOApellido(nombre2));

    }

    @Test
    @DisplayName("Test Apellido Paterno")
    public void testApellidoP() {
        String apellidoP = "ApellidoP";
        String apellidoP1 = "ApellidoP1324";

        Assertions.assertTrue(usuarioUtils.validarNombreOApellido(apellidoP));

        Assertions.assertFalse(usuarioUtils.validarNombreOApellido(apellidoP1));
    }

    @Test
    @DisplayName("Test Apellido Materno")
    public void testApellidoM() {
        String apellidoM = "ApellidoM";
        String apellidoM1 = "ApellidoM143";

        Assertions.assertTrue(usuarioUtils.validarNombreOApellido(apellidoM));

        Assertions.assertFalse(usuarioUtils.validarNombreOApellido(apellidoM1));

    }

    @Test
    @DisplayName("Test Rut")
    public void testRut() {
        String rut = "25.100.475-7";
        String rut1 = "25.100.475-8";
        String rut2 = "25.100.4755-7";

        Assertions.assertTrue(usuarioUtils.validarRut(rut));

        Assertions.assertFalse(usuarioUtils.validarRut(rut1));
        Assertions.assertFalse(usuarioUtils.validarRut(rut2));

    }

    @Test
    @DisplayName("Test Numero Telefonico")
    public void testNumero() {
        // Se escribe el numero sin del +569
        String numero = "56912345678";
        String numero1 = "12345679";
        String numero2 = "12345abc";

        Assertions.assertTrue(usuarioUtils.validarNumero(numero));

        Assertions.assertFalse(usuarioUtils.validarNumero(numero1));
        Assertions.assertFalse(usuarioUtils.validarNumero(numero2));

    }

    @Test
    @DisplayName("Test Edad")
    public void edad() {
        int edad = 25;
        int edad1 = -1;

        Assertions.assertTrue(usuarioUtils.validarEdad(edad));
        Assertions.assertFalse(usuarioUtils.validarEdad(edad1));

    }

}
