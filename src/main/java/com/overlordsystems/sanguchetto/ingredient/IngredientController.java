package com.overlordsystems.sanguchetto.ingredient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class IngredientController {

    @Autowired
    private IngredientService ingredientService;

    @GetMapping("/sanguchetto/admin/product/ingredient")
    public String goToIngredient(Model model) {
        List<Ingredient> allIngredients = ingredientService.getAllIngredients();
        model.addAttribute("ingredients", allIngredients);
        return "/admin/ingredientView";
    }

    @GetMapping("/sanguchetto/admin/product/addIngredient")
    public String goToAddIngredient(Model model) {
        Ingredient emptyIngredient = new Ingredient();
        model.addAttribute("ingredient", emptyIngredient);
        return "/admin/addIngredientView";
    }

    @GetMapping("/sanguchetto/admin/product/ingredients")
    public List<Ingredient> getAllIngredients() {
        List<Ingredient> allIngredients = ingredientService.getAllIngredients();
        return allIngredients;
    }

    @GetMapping("/sanguchetto/admin/product/getIngredient")
    public String getIngredient(){
        return null;
    }
    @PostMapping(value = "/sanguchetto/admin/product/ingredients")
    public String addIngredient(@ModelAttribute Ingredient newIngredient, Model model){
        ingredientService.addIngredient(newIngredient);
        return "redirect:/sanguchetto/admin/product/ingredient";
    }
}
