package cat.itacademy.barcelonactiva.cognoms.nom.s04.t02.n01.S04T02N01GognomsNom.model.repository;

import cat.itacademy.barcelonactiva.cognoms.nom.s04.t02.n01.S04T02N01GognomsNom.model.domain.Fruit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FruitRepository extends JpaRepository<Fruit, Integer> {

}
