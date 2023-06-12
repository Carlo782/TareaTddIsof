package com.example.TareaTdd.controlador;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.TareaTdd.entidades.Usuario;
import com.example.TareaTdd.utils.UsuarioUtils;

@RestController
public class ControladorUsuario {

    private final UsuarioUtils usuarioUtils = new UsuarioUtils();

    @PostMapping("/crear")
    @ResponseBody
    public StringBuilder generar(@RequestBody Usuario usuario) {
        StringBuilder mensaje = new StringBuilder();
        boolean resultadoNombre = usuarioUtils.validarNombreOApellido(usuario.getNombre());
        boolean resultadoAP = usuarioUtils.validarNombreOApellido(usuario.getApellidoP());
        boolean resultadoAM = usuarioUtils.validarNombreOApellido(usuario.getApellidoM());
        boolean resultadoRut = usuarioUtils.validarRut(usuario.getRut());
        boolean resultadoNumero = usuarioUtils.validarNumero(usuario.getNumero());
        boolean resultadoEdad = usuarioUtils.validarEdad(usuario.getEdad());

        if (!resultadoNombre) {
            mensaje.append("Nombre no valido\n");
        }
        if (!resultadoAP) {
            mensaje.append("Apellido Paterno no valido\n");
        }
        if (!resultadoAM) {
            mensaje.append("Apellido Materno no valido\n");
        }
        if (!resultadoRut) {
            mensaje.append("Rut no valido\n");
        }
        if (!resultadoNumero) {
            mensaje.append("Numero no valido\n");
        }
        if (!resultadoEdad) {
            mensaje.append("Edad no valida\n");
        }
        if (mensaje.isEmpty()) {
            mensaje.append("Se ha creado el usuario exitosamente!");
        }
        return mensaje;
    }

}
