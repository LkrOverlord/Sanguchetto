package com.overlordsystems.sanguchetto.ingredient;

import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;

/*
Mediante la anotación service indicamos que esta clase va ser un singleton y por lo tanto cuando se crea la
instancia, el objeto se mantiene vivo hasta que se cierra la aplicación y es por esa razón que es un
service y siempre esta disponible. Además es por esta razón que el lista de ingredientes solo lo creamos una
vez ya que sino fuera singleton tengo que crear la lista cada que vez que quiero usar el IngredientService y no
es muy conveniente.
 */
@Service
public class IngredientService {

    /*
    Se agrega new ArrayList para que pueda ser una mutable, anteriormente era una lista y por lo tanto
    no era mutable, es decir no se podia agregar o eliminar elementos.
     */
    /*
    Dejamos esto porque no sabemos si funciona bien
    private List<Ingredient> ingredients = new ArrayList<>(Arrays.asList(
            new Ingredient(1,"Tomate", 2.5, 25),
            new Ingredient(2,"Papa", 1.5, 25),
            new Ingredient(3,"Lechuga", 0.5, 25)
    ));

     */

    private Map<Integer, Ingredient> ingredientsMaped = new HashMap<>(
            Map.of( 1, new Ingredient(1,"Tomate",23,45),
                    2, new Ingredient(2,"Papas fritas",23,45),
                    3, new Ingredient(3,"Lechuga",23,45)
            )
    );

    public List<Ingredient> getAllIngredients() {
        List<Ingredient> ingredients = new ArrayList<>(ingredientsMaped.values());
        return ingredients;
    }

    public void addIngredient(Ingredient newIngredient) {
        ingredientsMaped.put(newIngredient.getId(), newIngredient);
    }

    public List<Ingredient> getIngredients(Ingredient wantedIngredient) {
        List<Ingredient> wantedIngredients =ingredientsMaped.values().stream()
                .filter(ingredient -> ingredient
                        .getName().toLowerCase(Locale.ROOT)
                        .contains(wantedIngredient.getName())
                )
                .collect(Collectors.toList());
        return wantedIngredients;
    }

    public Ingredient getIngredientById(int idIngredient) {
        return this.ingredientsMaped.get(idIngredient);
    }

    public Ingredient getIngredientByName(String name){
        Ingredient wantedIngredient= ingredientsMaped.values().stream()
                .filter(ingredient -> ingredient
                        .getName().toLowerCase(Locale.ROOT)
                        .contains(name.toLowerCase(Locale.ROOT)))
                .findFirst()
                .get();
        return wantedIngredient;
    }

    public void updateIngredient(Ingredient updateIngredient){
        this.ingredientsMaped.put(updateIngredient.getId(), updateIngredient);
    }
}
