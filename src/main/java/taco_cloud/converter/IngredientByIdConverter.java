package taco_cloud.converter;

import org.springframework.beans.factory.annotation.Autowired;
import taco_cloud.entity.Ingredient;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
import taco_cloud.repository.IngredientRepository;

@Component
public class IngredientByIdConverter implements Converter<String, Ingredient> {

    private final IngredientRepository ingredientRepository;

    @Autowired
    public IngredientByIdConverter(IngredientRepository ingredientRepository) {
        this.ingredientRepository = ingredientRepository;
    }

    @Override
    public Ingredient convert(String id) {
        return ingredientRepository.findById(id).orElse(null);
    }
}
