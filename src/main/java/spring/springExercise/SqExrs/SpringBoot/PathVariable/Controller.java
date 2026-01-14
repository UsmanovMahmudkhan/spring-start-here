package spring.springExercise.SqExrs.SpringBoot.PathVariable;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.stereotype.Controller
public class Controller {

    @RequestMapping("/{color}")
    public String getColors(Model model, @PathVariable String color){
        model.addAttribute("colors","color:"+ color);
        return "color.html";
    }
}
