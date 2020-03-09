package tar.Movie.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.CrudRepository;
import tar.Movie.Models.User;

public interface UserRepository extends MongoRepository<User,String> {
    public User findByName(String name);
}
