package tar.Movie.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;
import tar.Movie.models.Movie;
import tar.Movie.models.User;
import tar.Movie.repository.UserRepository;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public List<User> getUsers(){
        return userRepository.findAll();
    }

    public User createUser(User user){
        return userRepository.save(user);
    }

    public Optional<User> findById(String id){
        return userRepository.findById(id);
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
