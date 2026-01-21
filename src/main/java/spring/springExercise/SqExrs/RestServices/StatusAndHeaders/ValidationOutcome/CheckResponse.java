package spring.springExercise.SqExrs.RestServices.StatusAndHeaders.ValidationOutcome;

public class CheckResponse {
    private boolean allowed;

    public CheckResponse(boolean allowed) {

        this.allowed = allowed;
    }

    public boolean isAllowed() {

        return allowed;
    }

    public void setAllowed(boolean allowed) {

        this.allowed = allowed;
    }
}
