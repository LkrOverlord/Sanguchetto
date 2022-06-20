package com.overlordsystems.sanguchetto.home;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeAdminController {

    /*
    Debería ser un Controller pero de momento solo como sabemos que va a crecer, se deja con RestController.
     */
    @RequestMapping("/sanguchetto/admin/home")
    public ModelAndView goToHome(){
        ModelAndView model = new ModelAndView("/admin/homeView");
        return model;
    }
}
