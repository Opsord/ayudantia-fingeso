package grupo_b.supercar_webapp.car_module.services;

import grupo_b.supercar_webapp.car_module.entities.ClaseFome01;
import grupo_b.supercar_webapp.car_module.repositories.ClaseFome01Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClaseFome01Service {

    private final ClaseFome01Repository claseFome01Repository;

    @Autowired
    public ClaseFome01Service(ClaseFome01Repository claseFome01Repository) {
        this.claseFome01Repository = claseFome01Repository;
    }

    // CRUD

    // Create
    public ClaseFome01 save(ClaseFome01 claseFome01) {
        return claseFome01Repository.save(claseFome01);
    }

    // Read
    public ClaseFome01 findById(Long id) {
        return claseFome01Repository.findById(id).orElse(null);
    }

    public Iterable<ClaseFome01> findAll() {
        return claseFome01Repository.findAll();
    }

    // Update
    public ClaseFome01 update(ClaseFome01 claseFome01) {
        return claseFome01Repository.save(claseFome01);
    }

    // Delete
    public void deleteById(Long id) {
        claseFome01Repository.deleteById(id);
    }

}
