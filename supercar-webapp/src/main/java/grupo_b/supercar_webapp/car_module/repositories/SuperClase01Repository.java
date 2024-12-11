package grupo_b.supercar_webapp.car_module.repositories;

import grupo_b.supercar_webapp.car_module.entities.SuperClase01;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SuperClase01Repository extends JpaRepository <SuperClase01,Long> {

}
