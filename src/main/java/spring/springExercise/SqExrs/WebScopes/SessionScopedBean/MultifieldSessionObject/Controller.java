package spring.springExercise.SqExrs.WebScopes.SessionScopedBean.MultifieldSessionObject;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@org.springframework.stereotype.Controller
public class Controller {

    private final StudentSessionService service;

    public Controller(StudentSessionService service) {
        this.service = service;
    }

    @GetMapping("/")
    public String getHome(){
        return "studentSession.html";
    }

    @PostMapping("/set")
    public String setSession( @RequestParam String name,
                             @RequestParam String major,
                             @RequestParam int year){
       service.setSession(name,major,year);
       return "studentSession.html";
    }

    @GetMapping("/show")
    public String show(Model model){
        if(service.getAllInfo().getName()==null){
            model.addAttribute("msg","Failed");
        }
        else {
            model.addAttribute("msg","done");
        }
        model.addAttribute("studentSession",service.getAllInfo());
        return "showStudentSession.html";
    }


}
