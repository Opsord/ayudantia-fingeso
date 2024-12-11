package grupo_b.supercar_webapp.module_animals.repositories;

import grupo_b.supercar_webapp.module_animals.entities.AnimalEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnimalRepository extends JpaRepository<AnimalEntity, Integer> {
}
