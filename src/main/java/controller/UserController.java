package controller;

import dto.Users;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import service.UserService;

@RestController
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @PostMapping("/register")
    public void addUser(@RequestBody Users user){
        userService.register(user);
    }

    @PostMapping("login")
    public String login(@RequestBody Users users){
        return userService.varify(users);
    }

}
