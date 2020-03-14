package tar.Movie.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tar.Movie.models.ResultModel;
import tar.Movie.service.MovieService;

@RestController
@RequestMapping("/api/v1/movie")
public class MovieController extends BaseController{
    @Autowired
    private MovieService movieService;



    @GetMapping("/getAllData")
    public ResponseEntity<ResultModel> getData(){
        return getResultSuccess(movieService.getMovies());
    }


}
