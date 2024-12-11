package grupo_b.supercar_webapp.module_animals.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@Table(name = "animal")
@NoArgsConstructor
@AllArgsConstructor
public class AnimalEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "super_nombre")
    private String name;

    private String species;

    private String breed;

    @Column(name = "super_color")
    private String color;

    private int age;

    private int patas;

}
