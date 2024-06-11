package cat.itacademy.barcelonactiva.cognoms.nom.s04.t02.n01.S04T02N01GognomsNom.controllers;

import cat.itacademy.barcelonactiva.cognoms.nom.s04.t02.n01.S04T02N01GognomsNom.model.domain.Fruit;
import cat.itacademy.barcelonactiva.cognoms.nom.s04.t02.n01.S04T02N01GognomsNom.model.services.FruitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/fruit")
public class FruitController {

   @Autowired
   private FruitService fruitService;

    @PostMapping("/add")
    public ResponseEntity<Fruit> addFruit(@RequestBody Fruit fruit) {
        try {
            Fruit addedFruit = fruitService.addFruit(fruit);
            return new ResponseEntity<>(addedFruit, HttpStatus.CREATED);
        } catch (Exception e) {
            // Handle the exception
            e.printStackTrace(); // Log the exception for debugging purposes (optional)
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
   @PutMapping("/update")
    public Fruit updateFruit(@RequestBody Fruit fruit){
       return fruitService.updateFruit(fruit);
   }

   @DeleteMapping("/delete/{id}")
    public void deleteFruit(@PathVariable int id){
       fruitService.deleteFruit(id);
   }

   @GetMapping("/getAll")
    public List<Fruit> getAllFruits(){
       return fruitService.getAllFruits();
   }

   @GetMapping("/getOne/{id}")
    public Optional<Fruit> getFruitById(@PathVariable int id){
       return fruitService.getFruitById(id);
   }

}
