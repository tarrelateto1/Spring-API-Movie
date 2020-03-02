package tar.Movie.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import tar.Movie.Models.Movie;


public interface MovieRepository extends MongoRepository<Movie,String> {


}
