package tar.Movie.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import tar.Movie.models.Movie;


public interface MovieRepository extends MongoRepository<Movie,String> {


}
