package tar.Movie.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import tar.Movie.models.ResultModel;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;

@Controller
public class ResponseErrorController implements org.springframework.boot.web.servlet.error.ErrorController {

    @Override
    public String getErrorPath() {
        return "/error";
    }

    @RequestMapping("/error")
    public Object handleError(HttpServletRequest request) {
        // get error status
        Object status = request.getAttribute(RequestDispatcher.ERROR_STATUS_CODE);

        // TODO: log error details here
        ResultModel resultModel = ResultModel.builder().build();

        if (status != null) {
            int statusCode = Integer.parseInt(status.toString());

            // display specific error page
            if (statusCode == HttpStatus.NOT_FOUND.value()) {
                return new ResponseEntity<ResultModel>(resultModel, HttpStatus.NOT_FOUND);
            } else if (statusCode == HttpStatus.INTERNAL_SERVER_ERROR.value()) {
                return new ResponseEntity<ResultModel>(resultModel, HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        // display generic error
        return "error";
    }
}
