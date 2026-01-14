package spring.springExercise.SqExrs.SpringBoot;

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

    @RequestMapping("/")
    public String getMain(Model model){
        model.addAttribute("msg",new Comment("Hello Mahmudkhon").getText());
        return "main.html";
    }
}
