package tar.Movie.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tar.Movie.models.User;
import tar.Movie.service.UserService;

import java.util.Optional;

@RestController
@RequestMapping("/api/v1/user")
public class UserController extends BaseController{

    @Autowired
    UserService userService;

    @PostMapping("/createuser")
    public ResponseEntity<User> postUser(@RequestBody User body){
        User user = userService.createUser(body);
        return ResponseEntity.status(HttpStatus.CREATED).body(user);
    }

    @GetMapping("/getName/{name}")
    public ResponseEntity<User> getName(@PathVariable String name){
        User user = userService.findName(name);
        return ResponseEntity.status(HttpStatus.OK).body(user);
    }

    @PutMapping("/updateUser/{id}")
    public ResponseEntity<?> updateUser(@PathVariable String id,@RequestBody User body){
        Optional<?> user = userService.updateUser(id,body);
        return ResponseEntity.ok(user);
    }

    @DeleteMapping("/deleteUser/{id}")
    public ResponseEntity<?> deleteCustomer(@PathVariable String id) {
        if(!userService.deleteUser(id)) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok().build();
    }
}
