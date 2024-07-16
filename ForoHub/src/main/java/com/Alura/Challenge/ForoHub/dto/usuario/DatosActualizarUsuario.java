package com.Alura.Challenge.ForoHub.dto.usuario;

import com.Alura.Challenge.ForoHub.modelo.Tipo;

public record DatosActualizarUsuario(Long id, String nombre, String email, String contrasena, Tipo tipo) {
}
