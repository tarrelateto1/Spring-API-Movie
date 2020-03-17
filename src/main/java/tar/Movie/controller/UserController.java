package tar.Movie.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tar.Movie.models.ResultModel;
import tar.Movie.models.User;
import tar.Movie.service.UserService;

import java.util.Optional;

@RestController
@RequestMapping("/api/v1")
public class UserController extends BaseController{

    @Autowired
    UserService userService;

    @GetMapping("/user")
    public ResponseEntity<ResultModel> getAllData(){
        return getResultSuccess(userService.getUsers());
    }

    @PostMapping("/user")
    public ResponseEntity<ResultModel> postUser(@RequestBody User body){
        User user = userService.createUser(body);
        return getResultSuccess(user,HttpStatus.CREATED);
    }

    @GetMapping("/user/{id}")
    public ResponseEntity<ResultModel> getName(@PathVariable String id){
        Optional<User> user = userService.findById(id);
        return getResultSuccess(user);
    }

    @PutMapping("/user/{id}")
    public ResponseEntity<ResultModel> updateUser(@PathVariable String id,@RequestBody User body){
        Optional<?> user = userService.updateUser(id,body);
        return getResultSuccess(user,HttpStatus.OK);
    }

    @DeleteMapping("/user/{id}")
    public ResponseEntity<?> deleteCustomer(@PathVariable String id) {
        if(!userService.deleteUser(id)) {
            return ResponseEntity.notFound().build();
        }
        return getResultSuccess();
    }
}
