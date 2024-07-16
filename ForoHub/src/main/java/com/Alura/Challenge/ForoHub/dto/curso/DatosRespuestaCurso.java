package com.Alura.Challenge.ForoHub.dto.curso;

import com.Alura.Challenge.ForoHub.modelo.Curso;

public record DatosRespuestaCurso(String nombre, String categoria) {

    public DatosRespuestaCurso(Curso curso) {
        this(curso.getNombre(), curso.getCategoria());
    }
}
