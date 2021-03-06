package tar.Movie.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import tar.Movie.constant.StatusMessage;
import tar.Movie.models.ResultModel;

@CrossOrigin(origins = "*", allowedHeaders = "*")
public class BaseController {
    public ResponseEntity<ResultModel> getResultSuccess(){
        ResultModel resultModel = ResultModel.builder().build();

        resultModel.setMessage(StatusMessage.MESSAGE_SUCCESS);

        return new ResponseEntity<ResultModel>(resultModel, HttpStatus.OK);
    }

    public ResponseEntity<ResultModel> getResultSuccess(Object result){
        ResultModel resultModel = ResultModel.builder().build();

        resultModel.setMessage(StatusMessage.MESSAGE_SUCCESS);
        resultModel.setResult(result);

        return new ResponseEntity<ResultModel>(resultModel,HttpStatus.OK);
    }
    public ResponseEntity<ResultModel> getResultSuccess(Object result,HttpStatus httpStatus){
        ResultModel resultModel = ResultModel.builder().build();

        resultModel.setMessage(StatusMessage.MESSAGE_SUCCESS);
        resultModel.setResult(result);

        return new ResponseEntity<ResultModel>(resultModel,httpStatus);
    }
}
