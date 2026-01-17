package spring.springExercise.SqExrs.WebScopes.SessionScopedBean.LoginSimulation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@org.springframework.stereotype.Controller
public class Controller {

    @Autowired
    public SessionService service;

    @GetMapping("/")
    public String getHome(){
        return "loginSession.html";
    }

    @PostMapping("/")
    public String set(@RequestParam String email){
        if(email != null && !email.isEmpty()){
            service.set(email);
        }

        return "loginSession.html";
    }

    @GetMapping("/profile")
    public String profile(Model model){
            model.addAttribute("msg", service.show());
        return "profile.html";
    }

    @PostMapping("/reset")
    public String reset(Model model){
        service.reset();
       model.addAttribute( "msg",service.show());
       return "loginSession.html";
    }
}
