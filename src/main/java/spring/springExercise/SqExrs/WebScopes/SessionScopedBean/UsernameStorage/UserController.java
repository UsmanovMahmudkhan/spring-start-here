package spring.springExercise.SqExrs.WebScopes.SessionScopedBean.UsernameStorage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UserController {


    @Autowired
    public UserNameService userNameService;

    @GetMapping("/")
    public String getHome(){
        return "username.html";
    }

    @PostMapping("/")
    public String saveUsername(@RequestParam String userName,Model model){
        userNameService.getUsername().setUsername(userName);
        model.addAttribute("userName",userNameService.getUser());
        return "username.html";
    }

    @GetMapping("/read")
    public String readName(Model model){
        model.addAttribute("name",userNameService.getUser());
        return "readName.html";
    }
}
