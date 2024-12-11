package grupo_b.supercar_webapp.car_module.controllers;

import grupo_b.supercar_webapp.car_module.entities.ClaseFome01;
import grupo_b.supercar_webapp.car_module.entities.SuperClase01;
import grupo_b.supercar_webapp.car_module.services.SuperClase01Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.logging.Logger;

@RestController
@RequestMapping("/api")
public class SuperClase01Controller {

    private final SuperClase01Service superClase01Service;
    private static final Logger logger = Logger.getLogger(SuperClase01Controller.class.getName());

    @Autowired
    public SuperClase01Controller(SuperClase01Service superClase01Service) {
        this.superClase01Service = superClase01Service;
    }

    // CRUD de SuperClase01
    @PostMapping("/save")
    public SuperClase01 save(@RequestBody SuperClase01 superClase01) {
        logger.info("Guardando SuperClase01");
        return superClase01Service.save(superClase01);
    }

    @GetMapping("/findById/{id}")
    public SuperClase01 findById(@PathVariable Long id) {
        logger.info("Buscando SuperClase01 por id");
        return superClase01Service.findById(id);
    }

    @GetMapping("/findAll")
    public List<SuperClase01> findAll() {
        logger.info("Buscando todas las SuperClase01");
        return superClase01Service.findAll();
    }

    @PutMapping("/update")
    public void update(@RequestBody SuperClase01 superClase01) {
        logger.info("Actualizando SuperClase01");
        superClase01Service.update(superClase01);
    }

    @PostMapping("/deleteById/{id}")
    public void deleteById(@PathVariable Long id) {
        logger.info("Eliminando SuperClase01 por id");
        superClase01Service.deleteById(id);
    }

    // Endpoint para agregar ClaseFome01 a SuperClase01
    @PostMapping("/addClaseFome/{superClaseId}")
    public SuperClase01 addClaseFomeToSuperClase(@PathVariable Long superClaseId, @RequestBody List<ClaseFome01> claseFome01List) {
        logger.info("Agregando ClaseFome01 a SuperClase01");
        return superClase01Service.addClaseFomeToSuperClase(superClaseId, claseFome01List);
    }
}