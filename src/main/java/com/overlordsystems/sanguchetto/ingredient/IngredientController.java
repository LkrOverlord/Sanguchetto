package com.overlordsystems.sanguchetto.ingredient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RestController
public class IngredientController {

    @Autowired
    private IngredientService ingredientService;

    @RequestMapping("/sanguchetto/admin/products/ingredients")
    public List<Ingredient> getAllIngredients(){
        return ingredientService.getAllIngredients();
    }

    @RequestMapping(method = RequestMethod.POST, value = "/sanguchetto/admin/products/ingredients")
    public void addIngredient(@RequestBody Ingredient ingredient){
        ingredientService.addIngredient(ingredient);
    }
}
