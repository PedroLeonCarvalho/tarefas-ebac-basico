package br.com.ebac.animal_service.controllers;

import br.com.ebac.animal_service.AnimalServiceApplication;
import br.com.ebac.animal_service.entidades.Animal;
import br.com.ebac.animal_service.repositorios.AnimalRepositorio;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping ("/animais")

public class AnimalController {

    private AnimalRepositorio animalRepositorio;

    public AnimalController(AnimalRepositorio animalRepositorio) {
        this.animalRepositorio = animalRepositorio;
    }

    @GetMapping

    public List<Animal> findAll () {
    var listaAnimais = animalRepositorio.findAll();
return listaAnimais;
    }

    @PostMapping
    public Animal create (@RequestBody Animal animal) {
        return animalRepositorio.save(animal);
    }

@GetMapping ("/not-adopted")
    public List<Animal> findNotAdopted (){
      return animalRepositorio.findNotAdopted();
}

}
