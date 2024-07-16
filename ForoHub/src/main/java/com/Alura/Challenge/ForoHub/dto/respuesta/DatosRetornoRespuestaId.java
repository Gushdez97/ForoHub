package com.Alura.Challenge.ForoHub.dto.respuesta;

import com.Alura.Challenge.ForoHub.dto.topico.DatosRespuestaTopico;
import com.Alura.Challenge.ForoHub.dto.usuario.DatosRespuestaUsuario;
import com.Alura.Challenge.ForoHub.modelo.Respuesta;

public record DatosRetornoRespuestaId(String mensaje, DatosRespuestaTopico topico, String fechaCreacion, DatosRespuestaUsuario autor, String solucion) {

    public DatosRetornoRespuestaId(Respuesta respuesta) {
        this(respuesta.getMensaje(), new DatosRespuestaTopico(respuesta.getTopico()), respuesta.getFechaCreacion().toString(),
                new DatosRespuestaUsuario(respuesta.getAutor()), respuesta.getSolucion().toString());
    }
}
