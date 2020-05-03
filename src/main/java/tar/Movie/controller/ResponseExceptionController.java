package tar.Movie.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.NoHandlerFoundException;
import tar.Movie.models.ResultModel;

import javax.servlet.http.HttpServletRequest;

@ControllerAdvice
public class ResponseExceptionController {

    @ResponseStatus(HttpStatus.NOT_FOUND)
    @ExceptionHandler(NoHandlerFoundException.class)
    @ResponseBody
    public ResponseEntity handleException(Exception e, HttpServletRequest request) {
        ResultModel entity = ResultModel.builder().build();
        return new ResponseEntity(entity, HttpStatus.NOT_FOUND);
    }


}
