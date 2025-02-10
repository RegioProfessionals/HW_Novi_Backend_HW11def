package nl.regioprofessionals.hwles11techiteasy.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;

@ControllerAdvice
public class ExceptionController {
    @ExceptionHandler (RecordNotFoundException.class) {
        public ResponseEntity<Object> exception(RecordNotFoundException exception) {
            return new ResponseEntity<>(exception.getMessage(), HttpStatus.NOT_FOUND);
        }
    }
    if () {
        throw new RecordNotFoundException('ID cannot be found');
    }
}
