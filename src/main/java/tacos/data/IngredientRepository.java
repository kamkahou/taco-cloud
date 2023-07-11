package tacos.data;

import java.util.Optional;

import tacos.Ingredient;

public interface IngredientRepository {    //interface才能被implements
    Iterable<Ingredient> findAll();    //为集合类提供for-each循环（遍历）的支持

    Optional<Ingredient> findById(String id);

    Ingredient save(Ingredient ingredient);
}
