package spring.springExercise.SqExrs.WebScopes.RequestScopedBean.Calculator;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;

@Service
public class CalculatorService {

    private final CalculatorRequest request;
    private final ArrayList<Double>requestArrayList;

    public CalculatorService(CalculatorRequest request, ArrayList<Double> requestArrayList) {
        this.request = request;
        this.requestArrayList=requestArrayList;
    }

    public void calculate() {
        double x = request.getX();
        double y = request.getY();
        String op = request.getOperator();

        if (op.equals("+")) request.setResult(x + y);
        else if (op.equals("-")) request.setResult(x - y);
        else if (op.equals("*")) request.setResult(x * y);
        else if (op.equals("/")) request.setResult(y == 0 ? 0 : x / y);
        else request.setResult(0);
    }

    public void join(double request){
        requestArrayList.add(request);
    }

    public ArrayList<Double> show(){
        return requestArrayList;
    }
}