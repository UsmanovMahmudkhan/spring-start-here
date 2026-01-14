package spring.springExercise.SqExrs.WebScopes.RequestScopedBean.Calculator;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

@Component
@RequestScope
public class CalculatorRequest {

    private double x;
    private double y;
    private String operator;
    private double result;

    public double getX() { return x; }
    public void setX(double x) { this.x = x; }

    public double getY() { return y; }
    public void setY(double y) { this.y = y; }

    public String getOperator() { return operator; }
    public void setOperator(String operator) { this.operator = operator; }

    public double getResult() { return result; }
    public void setResult(double result) { this.result = result; }
}