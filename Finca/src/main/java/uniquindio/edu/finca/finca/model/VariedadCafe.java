package uniquindio.edu.finca.finca.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "variedad_cafe")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class VariedadCafe {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;

    private String origen;

    @Column(name = "altitud_optima")
    private Integer altitudOptima;

}
