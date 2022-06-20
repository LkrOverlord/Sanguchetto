package com.overlordsystems.sanguchetto.ingredient;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class IngredientController {

    @RequestMapping("/sanguchetto/admin/products/ingredient")
    public ModelAndView getAllIngredients(){
        return null;
    }
}
