package com.Alura.Challenge.ForoHub.dto.usuario;

import com.Alura.Challenge.ForoHub.modelo.Usuario;

public record DatosRespuestaUsuario(String nombre, String email, String tipo) {

    public DatosRespuestaUsuario(Usuario usuario) {
        this(usuario.getNombre(), usuario.getEmail(), usuario.getTipo().toString());
    }
}
