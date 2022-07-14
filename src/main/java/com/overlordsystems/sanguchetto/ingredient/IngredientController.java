package com.overlordsystems.sanguchetto.ingredient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class IngredientController {

    @Autowired
    private IngredientService ingredientService;

    @GetMapping("/sanguchetto/admin/product/ingredient")
    public String goToIngredient(Model model) {
        List<Ingredient> allIngredients = ingredientService.getAllIngredients();
        model.addAttribute("ingredients", allIngredients);
        Ingredient emptyIngredient = new Ingredient();
        model.addAttribute("ingredient", emptyIngredient);
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

    @PostMapping("/sanguchetto/admin/product/getIngredient")
    public String getIngredients(@ModelAttribute Ingredient wantedIngredient, Model model){
        List<Ingredient> ingredients = ingredientService.getIngredients(wantedIngredient);
        model.addAttribute("ingredients", ingredients);
        return "/admin/ingredientView";
    }

    @PostMapping(value = "/sanguchetto/admin/product/ingredients")
    public String addIngredient(@ModelAttribute Ingredient newIngredient, Model model){
        ingredientService.addIngredient(newIngredient);
        return "redirect:/sanguchetto/admin/product/ingredient";
    }

    @GetMapping("/sanguchetto/admin/product/editIngredient/{id}")
    public String goToEditIngredient(@PathVariable int id, Model model){
        Ingredient editIngredient = ingredientService.getIngredientById(id);
        model.addAttribute("ingredient", editIngredient);
        return "/admin/editIngredientView";
    }

    @PutMapping(value = "/sanguchetto/admin/product/editIngredient")
    public String updateIngredient(@ModelAttribute Ingredient updateIngredient){
        ingredientService.updateIngredient(updateIngredient);
        return "redirect:/sanguchetto/admin/product/ingredient";
    }

    @DeleteMapping(value = "/sanguchetto/admin/product/deleteIngredient/{id}")
    public String deleteIngredient(@PathVariable int id){
        ingredientService.deleteIngredient(id);
        return "redirect:/sanguchetto/admin/product/ingredient";
    }
}
