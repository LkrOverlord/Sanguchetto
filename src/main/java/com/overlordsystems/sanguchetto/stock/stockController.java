package com.overlordsystems.sanguchetto.stock;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class stockController {

    @RequestMapping("sanguchetto/admin/products")
    public ModelAndView getAllProducts(){
        return null;
    }

    public ModelAndView getAllIngredients(){
        return null;
    }
}
