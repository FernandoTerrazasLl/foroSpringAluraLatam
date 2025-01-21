package Dtos;

import java.time.LocalDateTime;

public record DatosRegistroTopico(
        String título,
        String mensaje,
        LocalDateTime fechaDeCreación,
        Boolean estatus,
        String autor,
        String curso
){}
