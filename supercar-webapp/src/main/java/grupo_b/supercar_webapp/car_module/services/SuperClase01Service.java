package grupo_b.supercar_webapp.car_module.services;

import grupo_b.supercar_webapp.car_module.entities.ClaseFome01;
import grupo_b.supercar_webapp.car_module.entities.SuperClase01;
import grupo_b.supercar_webapp.car_module.repositories.ClaseFome01Repository;
import grupo_b.supercar_webapp.car_module.repositories.SuperClase01Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SuperClase01Service {

    private final SuperClase01Repository superClase01Repository;
    private final ClaseFome01Repository claseFome01Repository;

    @Autowired
    public SuperClase01Service(SuperClase01Repository superClase01Repository, ClaseFome01Repository claseFome01Repository) {
        this.superClase01Repository = superClase01Repository;
        this.claseFome01Repository = claseFome01Repository;
    }

    // CRUD de SuperClase01
    public SuperClase01 save(SuperClase01 superClase01) {
        // Configurar la relación bidireccional
        if (superClase01.getClaseFome01List() != null) {
            for (ClaseFome01 claseFome01 : superClase01.getClaseFome01List()) {
                claseFome01.setSuperClase01(superClase01);
            }
        }
        return superClase01Repository.save(superClase01);
    }

    public SuperClase01 findById(Long id) {
        return superClase01Repository.findById(id).orElse(null);
    }

    public List<SuperClase01> findAll() {
        return superClase01Repository.findAll();
    }

    public void update(SuperClase01 superClase01) {
        superClase01Repository.save(superClase01);
    }

    public void deleteById(Long id) {
        superClase01Repository.deleteById(id);
    }

    // Metodo para agregar ClaseFome01 a SuperClase01
    public SuperClase01 addClaseFomeToSuperClase(Long superClaseId, List<ClaseFome01> claseFome01List) {
        SuperClase01 superClase01 = findById(superClaseId);
        if (superClase01 != null) {
            for (ClaseFome01 claseFome01 : claseFome01List) {
                claseFome01.setSuperClase01(superClase01);
                claseFome01Repository.save(claseFome01);
            }
            superClase01.getClaseFome01List().addAll(claseFome01List);
            return superClase01Repository.save(superClase01);
        }
        return null;
    }
}