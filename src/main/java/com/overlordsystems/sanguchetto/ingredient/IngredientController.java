package com.overlordsystems.sanguchetto.ingredient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RestController
public class IngredientController {

    @Autowired
    private IngredientService ingredientService;

    @RequestMapping("/sanguchetto/admin/product/ingredient")
    public ModelAndView goToIngredient(){
        ModelAndView model = new ModelAndView("/admin/ingredientView");
        model.addObject("ingredient", new Ingredient());
        return model;
    }

    @RequestMapping("/sanguchetto/admin/product/ingredients")
    public List<Ingredient> getAllIngredients(){
        return ingredientService.getAllIngredients();
    }

    @RequestMapping(value = "/sanguchetto/admin/product/ingredients", method = RequestMethod.POST)
    public void addIngredient(@ModelAttribute Ingredient ingredient, Ingredient newIngredient){
        newIngredient = ingredient;
        ingredientService.addIngredient(newIngredient);
    }
}
