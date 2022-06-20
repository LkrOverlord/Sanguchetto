package com.overlordsystems.sanguchetto.ingredient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
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
}
