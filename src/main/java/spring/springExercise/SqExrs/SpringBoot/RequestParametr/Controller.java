package spring.springExercise.SqExrs.SpringBoot.RequestParametr;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@org.springframework.stereotype.Controller
public class Controller {

    @RequestMapping("/")
    public String getName(Model model, @RequestParam String name, @RequestParam(required = false) Integer age){
        model.addAttribute("name",name);
        model.addAttribute("age",age);
        return "name.html";
    }
}
