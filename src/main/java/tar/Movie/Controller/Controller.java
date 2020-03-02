package tar.Movie.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import tar.Movie.Models.Movie;
import tar.Movie.Repository.MovieRepository;

import java.util.List;

@RestController
public class Controller {
    @Autowired
    private MovieRepository movieRepository;

    @GetMapping("/")
    public List<Movie> getData(){
        return    movieRepository.findAll();
    }


}
