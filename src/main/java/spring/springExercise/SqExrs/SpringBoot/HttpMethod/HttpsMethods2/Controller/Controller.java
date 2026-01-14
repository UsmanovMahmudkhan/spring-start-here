package spring.springExercise.SqExrs.SpringBoot.HttpMethod.HttpsMethods2.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import spring.springExercise.SqExrs.SpringBoot.HttpMethod.HttpsMethods2.Model.Comment;
import spring.springExercise.SqExrs.SpringBoot.HttpMethod.HttpsMethods2.Model.User;
import spring.springExercise.SqExrs.SpringBoot.HttpMethod.HttpsMethods2.Service.UserService;

@org.springframework.stereotype.Controller
public class Controller {

    @Autowired
    private UserService service;

    @GetMapping("/")
    public String getHome(Model model){
        model.addAttribute("user",service.getAllUser());
        model.addAttribute("comment",service.getAllComment());
        return "userComment.html";
    }

    @PostMapping("/")
    public String post(@RequestParam String name,
                       @RequestParam Integer age,
                       @RequestParam String text,
                       Model model){
        var comment=new Comment(text);
        var user=new User(name,age,comment);
        service.add(user);
        model.addAttribute("user",service.getAllUser());
        model.addAttribute("comment",service.getAllComment());
        return "userComment.html";
    }

    @GetMapping("/{name}")
    public String getByName(@PathVariable String name, Model model){
        model.addAttribute("user",service.fingByName(name));
        return "names.html";
    }
}
