package com.Alura.Challenge.ForoHub.dto.usuario;

import com.Alura.Challenge.ForoHub.modelo.Usuario;

public record DatosListadoUsuario(Long id, String nombre, String email, String tipo) {

    public DatosListadoUsuario(Usuario usuario) {
        this(usuario.getId(), usuario.getNombre(), usuario.getEmail(), usuario.getTipo().toString());
    }
}
