package spring.springExercise.SqExrs.WebScopes.SessionScopedBean.SessionCounter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CounterService {

    @Autowired
    public Counter counter;

    public Counter getCounter() {
        return counter;
    }

    public void setCounter(Counter counter) {
        this.counter = counter;
    }

    public Integer increase(){
        int i= counter.getCount();
        counter.setCount(i+1);
        return counter.getCount();
    }
}