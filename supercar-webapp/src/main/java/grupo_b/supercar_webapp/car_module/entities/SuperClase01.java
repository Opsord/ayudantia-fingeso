package grupo_b.supercar_webapp.car_module.entities;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@ToString// Lombok annotation to generate getters and setters
@Entity      // JPA annotation to indicate that this class is an entity
@AllArgsConstructor // Lombok annotation to generate all args constructors
@NoArgsConstructor  // Lombok annotation to generate no args constructor
@Table(name = "super_tabla_de_clase01") // JPA annotation to indicate the table name
public class SuperClase01 {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nombre_de_super_clase")
    private String nombre;

    private String apellido;

    @OneToMany(mappedBy = "superClase01", cascade = CascadeType.ALL, orphanRemoval = true)
    @JsonManagedReference
    private List<ClaseFome01> claseFome01List;

}
