package spring.springExercise.SqExrs.WebScopes.RequestScopedBean.FeedbackForm.Service;

import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.RequestScope;
import spring.springExercise.SqExrs.WebScopes.RequestScopedBean.FeedbackForm.Model.Form;


@Service
@RequestScope
public class FormService {

    private final Form form;

    public FormService(Form form) {
        this.form = form;
    }

    public Form process(){
        String name = form.getName();
        String email = form.getEmail();
        String text = form.getText();

        boolean hasEmptyField =
                name == null || name.isBlank() ||
                email == null || email.isBlank() ||
                text == null || text.isBlank();

        if (hasEmptyField) {
            form.setName("Failed to submit");
            form.setEmail(null);
            form.setText(null);
        }

        return form;
    }

    public Form getForm() {
        return form;
    }
}
