package com.example.TareaTdd.utils;

public class UsuarioUtils {

    public boolean validarNombreOApellido(String nombreOApellidos) {
        boolean esCorrecto = true;

        if (nombreOApellidos.length() < 2) {
            return esCorrecto = false;
        }
        for (int i = 0; i < nombreOApellidos.length(); i++) {
            if (!Character.isLetter(nombreOApellidos.charAt(i))&&
             !Character.isWhitespace(nombreOApellidos.charAt(i)) ) {
                esCorrecto = false;
            }
        }
        return esCorrecto;
    }

    public boolean validarRut(String rut) {

        rut = rut.replace(".", "").replace("-", ""); // Eliminar puntos y guiones
        if (rut.length() < 2) {
            return false;
        }

        String cuerpo = rut.substring(0, rut.length() - 1);
        char dv = rut.charAt(rut.length() - 1);

        // Verificar que el cuerpo del RUT sea un número válido
        if (!cuerpo.matches("[0-9]+")) {
            return false;
        }

        int suma = 0;
        int factor = 2;
        for (int i = cuerpo.length() - 1; i >= 0; i--) {
            suma += Integer.parseInt(String.valueOf(cuerpo.charAt(i))) * factor;
            factor = factor == 7 ? 2 : factor + 1;
        }

        int dvCalculado = 11 - (suma % 11);
        char dvChar = dvCalculado == 11 ? '0' : dvCalculado == 10 ? 'K' : (char) (dvCalculado + '0');

        return dv == dvChar;
    }

    public boolean validarNumero(String numero) {
        boolean esCorrecto = true;

       if(!numero.matches("^+569\\d{8}$")){
        esCorrecto=false;
       }
      
        
        return esCorrecto;
    }

    public boolean validarEdad(int edad) {
        boolean esCorrecto = true;
        try {

            if (edad < 0 || edad > 123) {
                esCorrecto = false;
            }
        } catch (Exception e) {
            esCorrecto = false;
        }
        return esCorrecto;
    }

}
