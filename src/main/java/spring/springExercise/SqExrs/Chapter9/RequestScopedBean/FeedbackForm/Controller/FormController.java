package spring.springExercise.SqExrs.Chapter9.RequestScopedBean.FeedbackForm.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import spring.springExercise.SqExrs.Chapter9.RequestScopedBean.FeedbackForm.Model.Form;
import spring.springExercise.SqExrs.Chapter9.RequestScopedBean.FeedbackForm.Service.FormService;

@Controller
public class FormController {

    @Autowired
    public FormService service;

    @GetMapping("/")
    public String getHomePage(){
        return "form.html";
    }

    @PostMapping("/result")
    public String post(@RequestParam String name,
                       @RequestParam String email,
                       @RequestParam String text, Model model){
        Form form=service.getForm();
        form.setName(name);
        form.setEmail(email);
        form.setText(text);
        model.addAttribute("service",service.process());
       return "formResult.html";
    }
}
