package ModeloBaseDatos;

import Dtos.DatosRegistroTopico;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity(name = "Topicos")
@Table(name = "topicos")
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Topicos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String título;
    private String mensaje;
    private LocalDateTime fechaDeCreación;
    private Boolean estatus;
    private String autor;
    private String curso;

    public Topicos(DatosRegistroTopico datosRegistroTopico) {
        this.título=datosRegistroTopico.título();
        this.mensaje=datosRegistroTopico.mensaje();
        this.fechaDeCreación=datosRegistroTopico.fechaDeCreación();
        this.estatus=datosRegistroTopico.estatus();
        this.autor=datosRegistroTopico.autor();
        this.curso=datosRegistroTopico.curso();
    }

    public Long getId() {
        return id;
    }

    public String getTítulo() {
        return título;
    }

    public String getMensaje() {
        return mensaje;
    }

    public LocalDateTime getFechaDeCreación() {
        return fechaDeCreación;
    }

    public Boolean getEstatus() {
        return estatus;
    }

    public String getAutor() {
        return autor;
    }

    public String getCurso() {
        return curso;
    }
}
