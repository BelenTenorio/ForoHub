package foroHub.api.domain.topicos;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "topicos")
@Entity(name = "Topico")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Topico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;
    private String mensaje;
    private String idUsuario;
    private String nombreCurso;

    public Topico(DatosRegistroTopico datosRegistroTopico) {
         this.titulo = datosRegistroTopico.titulo();
         this.mensaje = datosRegistroTopico.mensaje();
         this.idUsuario = datosRegistroTopico.idUsuario();
         this.nombreCurso = datosRegistroTopico.nombreCurso();

    }

    public void actualizarDatos(DatosActualizarTopico datosActualizarTopico) {
        if (datosActualizarTopico.titulo() != null){
            this.titulo = datosActualizarTopico.titulo();
        }
        if (datosActualizarTopico.mensaje() != null) {
            this.mensaje = datosActualizarTopico.mensaje();
        }
        if (datosActualizarTopico.autor() != null) {
            this.idUsuario = datosActualizarTopico.autor();
        }
        if (datosActualizarTopico.curso() != null) {
            this.nombreCurso = datosActualizarTopico.curso();
        }
    }
}
