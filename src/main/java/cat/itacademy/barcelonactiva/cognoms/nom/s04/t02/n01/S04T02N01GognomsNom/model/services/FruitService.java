package cat.itacademy.barcelonactiva.cognoms.nom.s04.t02.n01.S04T02N01GognomsNom.model.services;

import cat.itacademy.barcelonactiva.cognoms.nom.s04.t02.n01.S04T02N01GognomsNom.model.domain.Fruit;
import cat.itacademy.barcelonactiva.cognoms.nom.s04.t02.n01.S04T02N01GognomsNom.model.repository.FruitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FruitService {
    @Autowired
    private FruitRepository fruitRepository;

    public Fruit addFruit(Fruit fruit) {
        return fruitRepository.save(fruit);
    }

    public Fruit updateFruit(Fruit fruit){
        return fruitRepository.save(fruit);
    }

    public void deleteFruit(int id){
         fruitRepository.deleteById(id);
    }

    public List<Fruit> getAllFruits(){
        return fruitRepository.findAll();
    }

    public Optional<Fruit> getFruitById(int id){
        return fruitRepository.findById(id);
    }
}
