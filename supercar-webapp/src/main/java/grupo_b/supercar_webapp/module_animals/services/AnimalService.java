package grupo_b.supercar_webapp.module_animals.services;

import grupo_b.supercar_webapp.module_animals.entities.AnimalEntity;
import grupo_b.supercar_webapp.module_animals.repositories.AnimalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnimalService {

    private final AnimalRepository animalRepository;

    @Autowired
    public AnimalService(AnimalRepository animalRepository) {
        this.animalRepository = animalRepository;
    }

    // CRUD

    // Create
    public AnimalEntity createAnimal(AnimalEntity animal) {
        return animalRepository.save(animal);
    }

    // Read
    public AnimalEntity getAnimalById(int id) {
        return animalRepository.findById(id).orElse(null);
    }

    public List<AnimalEntity> getAllAnimals() {
        return animalRepository.findAll();
    }

    // Update
    public AnimalEntity updateAnimal(AnimalEntity animal) {
        return animalRepository.save(animal);
    }

    // Delete
    public void deleteAnimal(int id) {
        animalRepository.deleteById(id);
    }

}