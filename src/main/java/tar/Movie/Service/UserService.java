package tar.Movie.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tar.Movie.Models.User;
import tar.Movie.Repository.UserRepository;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public User createUser(User user){

        return userRepository.save(user);
    }
}
