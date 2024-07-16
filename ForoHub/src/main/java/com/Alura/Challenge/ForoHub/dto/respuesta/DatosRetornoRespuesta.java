package com.Alura.Challenge.ForoHub.dto.respuesta;

import com.Alura.Challenge.ForoHub.modelo.Respuesta;

public record DatosRetornoRespuesta(String mensaje, String topico, String autor) {

    public DatosRetornoRespuesta(Respuesta respuesta) {
        this(respuesta.getMensaje(), respuesta.getTopico().getTitulo(), respuesta.getAutor().getNombre());
    }
}
