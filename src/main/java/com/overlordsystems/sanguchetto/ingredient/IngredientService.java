package com.overlordsystems.sanguchetto.ingredient;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

/*
Mediante la anotación service indicamos que esta clase va ser un singleton y por lo tanto cuando se crea la
instancia, el objeto se mantiene vivo hasta que se cierra la aplicación y es por esa razón que es un
service y siempre esta disponible. Además es por esta razón que el lista de ingredientes solo lo creamos una
vez ya que sino fuera singleton tengo que crear la lista cada que vez que quiero usar el IngredientService y no
es muy conveniente.
 */
@Service
public class IngredientService {

    private List<Ingredient> ingredients = Arrays.asList(
            new Ingredient("Tomate",2.5,25),
            new Ingredient("Papa",1.5,25),
            new Ingredient("Lechuga",0.5,25)
    );

    public List<Ingredient> getAllIngredients(){
        return ingredients;
    }


}
