package taco_cloud.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import taco_cloud.entity.Ingredient;

@Repository
public interface IngredientRepository extends CrudRepository<Ingredient, String> {

}
