package tar.Movie.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import tar.Movie.models.User;

public interface UserRepository extends MongoRepository<User,String> {
    public User findByName(String name);
}
