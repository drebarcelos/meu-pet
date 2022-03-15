package br.com.meu.pet.controller;

import br.com.meu.pet.controller.model.PetRegisterForm;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class PetRegisterController {
    private Logger logger = LoggerFactory.getLogger(PetRegisterController.class);

    @GetMapping("/petregister")
    public String showPetRegisterPage(){
        return "petregister";
    }

    @PostMapping("/petregister")
    public String petRegister(PetRegisterForm form){
        logger.info(form.toString());
        return "redirect:/home";
    }


}
