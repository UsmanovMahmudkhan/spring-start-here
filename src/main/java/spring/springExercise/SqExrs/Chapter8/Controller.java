package spring.springExercise.SqExrs.Chapter8;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.stereotype.Controller
public class Controller {

    @RequestMapping("/home")
    public String getHome(Model model){
        model.addAttribute("username","Usmonov");
        model.addAttribute("name","Mahmudkhhon");
        return "home";
    }
}
