package Dtos;

import ModeloBaseDatos.Topicos;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDateTime;

@AllArgsConstructor
@Getter
public record DatosDevolucionTopico(
        Long id,
        String título,
        String mensaje,
        LocalDateTime fechaDeCreación,
        Boolean estatus,
        String autor,
        String curso
) {

    public DatosDevolucionTopico(Topicos topic) {
        this(
                topic.getId(),
                topic.getTítulo(),
                topic.getMensaje(),
                topic.getFechaDeCreación(),
                topic.getEstatus(),
                topic.getAutor(),
                topic.getCurso()
        );
    }
}
