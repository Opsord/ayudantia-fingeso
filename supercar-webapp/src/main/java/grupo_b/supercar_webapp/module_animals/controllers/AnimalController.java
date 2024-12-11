package grupo_b.supercar_webapp.module_animals.controllers;

import grupo_b.supercar_webapp.module_animals.entities.AnimalEntity;
import grupo_b.supercar_webapp.module_animals.services.AnimalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Logger;

@RestController
@RequestMapping("/animals")
public class AnimalController {

    private final AnimalService animalService;
    private static final Logger logger = Logger.getLogger(AnimalController.class.getName());

    @Autowired
    public AnimalController(AnimalService animalService) {
        this.animalService = animalService;
    }

    // CRUD

    // Create
    @PostMapping("/create")
    public String createAnimal(@RequestBody AnimalEntity animal) {
        animalService.createAnimal(animal);
        logger.info("Animal created: " + animal.getId());
        return "Animal created: " + animal.getId();
    }

}
