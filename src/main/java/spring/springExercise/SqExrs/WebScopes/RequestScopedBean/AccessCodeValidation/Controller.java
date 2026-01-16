package spring.springExercise.SqExrs.WebScopes.RequestScopedBean.AccessCodeValidation;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.context.annotation.RequestScope;

import java.util.logging.Logger;

@org.springframework.stereotype.Controller
public class Controller {
    private final AccessCodeService service;
    private Logger log=Logger.getLogger(Controller.class.getName());

    public Controller(AccessCodeService service) {
        this.service = service;
    }

    @GetMapping("/")
    public String getHome() {
        return "access.html";
    }

    @PostMapping("/")
    public String valid(Model model, @RequestParam String accessCode) {
        service.setAccessCode(accessCode);
        log.info(String.valueOf(service.getCode().getAccessCode().hashCode()));
        model.addAttribute("msg", service.validate());
        return "access.html";
    }
}
