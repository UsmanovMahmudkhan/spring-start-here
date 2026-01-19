package spring.springExercise.SqExrs.RestServices.Exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;

@org.springframework.web.bind.annotation.RestControllerAdvice
public class RestControllerAdvice {

    @ExceptionHandler(NotEnoughMoney.class)
    public ResponseEntity<ErrorDetails>getError(){
        ErrorDetails errorDetails=new ErrorDetails();
        errorDetails.setMessage("Must have enough moneeey");
        return ResponseEntity
                .status(HttpStatus.BAD_REQUEST)
                .body(errorDetails);
    }
}
