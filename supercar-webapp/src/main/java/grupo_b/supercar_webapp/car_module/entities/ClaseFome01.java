package grupo_b.supercar_webapp.car_module.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "tabla_de_clase_fome01")
public class ClaseFome01 {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;

    @ManyToOne
    @JoinColumn(name = "super_clase_id")
    @JsonBackReference
    private SuperClase01 superClase01;

}
