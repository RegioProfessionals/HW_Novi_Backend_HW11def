package nl.regioprofessionals.hwles11techiteasy.controllers;

import nl.regioprofessionals.hwles11techiteasy.exceptions.RecordNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;

@ControllerAdvice
public class ExceptionController {
    @ExceptionHandler(RecordNotFoundException.class) {
        public ResponseEntity<Object> exception (RecordNotFoundException exception){
            if () {
                throw new RecordNotFoundException('ID cannot be found');
                return new ResponseEntity<>(exception.getMessage(), HttpStatus.NOT_FOUND);

            }
        }
    }

    @ExceptionHandler(IndexOutOfBoundsException.class) {
        public ResponseEntity<Object> exception (IndexOutOfBoundsException exception){
            if (id > TelevisionController.televisionDataBase.length) {
                throw new IndexOutOfBoundsException("Unknown id exception", HttpStatus.RESET_CONTENT);
            }
        }
    }
}

