package br.com.meu.pet.controller.model;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class SingUpController {
    private Logger logger = LoggerFactory.getLogger(SingUpController.class);

    @GetMapping("/singUp")
    public String showSingUpPage(){
        return "singUp";
    }

    @PostMapping("/singUp")
    public String singUpUser(SingUpForm form){
        logger.info(form.toString());
        if(form.validatePassword() == true && form.validateEmail() == true){
            return "redirect:/home";
        } else {
            throw new RuntimeException("Erro ao cadastrar usuário!");
        }
    }
}
