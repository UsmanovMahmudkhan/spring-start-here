package spring.springExercise.SqExrs.WebScopes.RequestScopedBean.Calculator;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CalculatorController {

    private final CalculatorService service;
    private final CalculatorRequest request;

    public CalculatorController(CalculatorService service, CalculatorRequest request) {
        this.service = service;
        this.request = request;
    }

    @GetMapping("/")
    public String home() {
        return "math.html";
    }

    @PostMapping("/")
    public String calculate(Model model,
                            @RequestParam double x,
                            @RequestParam double y,
                            @RequestParam String operator) {

        request.setX(x);
        request.setY(y);
        request.setOperator(operator);

        service.calculate();
        service.join(request.getResult());

        model.addAttribute("msg", request.getResult());
        model.addAttribute("show",service.show());
        return "math.html";
    }
}