package spring.springExercise.SqExrs.WebScopes.SessionScopedBean.SessionCounter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@org.springframework.stereotype.Controller
public class Controller {

    @Autowired
    public CounterService service;

    @GetMapping("/")
    public String getHome() {
        return "counter.html";
    }

    @PostMapping("/post")
    public String increase(Model model, @RequestParam String name) {
        service.getCounter().setName(name);
        model.addAttribute("counter", service.increase());
        model.addAttribute("name", service.getCounter().getName());
        return "counter.html";
    }

    @GetMapping("/show")
    public String show(Model model) {
        model.addAttribute("counter", service.getCounter().getCount());
        model.addAttribute("name", service.getCounter().getName());
        return "show.html";
    }

}
