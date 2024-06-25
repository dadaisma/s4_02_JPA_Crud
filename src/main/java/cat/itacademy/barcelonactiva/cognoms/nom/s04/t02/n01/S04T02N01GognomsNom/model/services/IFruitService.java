package cat.itacademy.barcelonactiva.cognoms.nom.s04.t02.n01.S04T02N01GognomsNom.model.services;

import cat.itacademy.barcelonactiva.cognoms.nom.s04.t02.n01.S04T02N01GognomsNom.model.domain.Fruit;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public interface IFruitService {
    Fruit addFruit(Fruit fruit);

    @Transactional
    Fruit updateFruit(int id, Fruit fruit);

    @Transactional
    boolean deleteFruit(int id);

    @Transactional(readOnly = true)
    Iterable<Fruit> getAllFruits();

    @Transactional(readOnly = true)
    Optional<Fruit> getFruitById(int id);
}
