package spring.springExercise.SqExrs.BeanScopes.Protorype;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Comment {
}
