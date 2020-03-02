package tar.Movie.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import tar.Movie.Models.Movie;
import tar.Movie.Repository.MovieRepository;
import tar.Movie.Service.MovieService;

import java.util.List;

@RestController
public class Controller {
    @Autowired
    private MovieService movieService;



    @GetMapping("/")
    public ResponseEntity<?> getData(){
        return ResponseEntity.ok(movieService.getMovies());
    }


}
