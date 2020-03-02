package tar.Movie.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tar.Movie.Models.Movie;
import tar.Movie.Repository.MovieRepository;

import java.util.List;

@Service
public class MovieService {
    @Autowired
    private MovieRepository movieRepository;

    @Autowired
    public List<Movie> getMovies(){
        return movieRepository.findAll();
    }
}
