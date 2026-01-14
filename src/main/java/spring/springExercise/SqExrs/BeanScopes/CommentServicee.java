package spring.springExercise.SqExrs.BeanScopes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommentServicee {

    @Autowired
    private CommentRepository repository;

    public CommentRepository repository() {
        return repository;
    }
}
