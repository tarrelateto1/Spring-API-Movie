package tar.Movie.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tar.Movie.Models.User;
import tar.Movie.Service.UserService;

import java.util.Optional;

@RestController
@RequestMapping("/api/v1/user")
public class UserController {

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
}