package br.com.meu.pet.controller;

import br.com.meu.pet.controller.model.SignUpForm;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class SignUpController {
    private Logger logger = LoggerFactory.getLogger(SignUpController.class);

    @GetMapping("/signup")
    public String showSingUpPage(){
        return "signup";
    }

    @PostMapping("/signup")
    public String singUpUser(SignUpForm form){
        logger.info(form.toString());
        if(form.validatePassword() == true && form.validateEmail() == true){
            return "redirect:/home";
        } else {
            throw new RuntimeException("Erro ao cadastrar usuário!");
        }
    }
}
