package tar.Movie.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;
import tar.Movie.Models.User;
import tar.Movie.Repository.UserRepository;

import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public User createUser(User user){
        return userRepository.save(user);
    }

    public User findName(String name){
        return userRepository.findByName(name);
    }

    public Optional<User> updateUser(String id,User user){
        Optional<User> userOpt = userRepository.findById(id);
        if(!userOpt.isPresent()) {
            return userOpt;
        }
        user.setId(id);
        return Optional.of(userRepository.save(user));
    }

    public boolean deleteUser(String id) {
        try {
            userRepository.deleteById(id);
            return true;
        } catch (EmptyResultDataAccessException e) {
            return false;
        }
    }
}
