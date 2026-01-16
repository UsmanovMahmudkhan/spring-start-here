package spring.springExercise.SqExrs.Chapter9.RequesScopedBean.Login;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@org.springframework.stereotype.Controller
public class Controller {

    private final LoginProcessor processor;
    public Controller(LoginProcessor processor){
        this.processor=processor;
    }


    @GetMapping("/")
    public String getHome(){
        return "login.html";
    }

    @PostMapping("/")
    public String getHome(Model model, @RequestParam String name, @RequestParam String password){
        processor.setName(name);
        processor.setPassword(password);
        boolean logIn=processor.login();

        if(logIn){
            model.addAttribute("msg","you are loogin in ");
        }

        else {
            model.addAttribute("msg","Failed");
        }
        return "login.html";
    }
}
