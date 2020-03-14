package tar.Movie.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tar.Movie.models.Movie;
import tar.Movie.repository.MovieRepository;

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
