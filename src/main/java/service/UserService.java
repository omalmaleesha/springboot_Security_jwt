package service;

import dto.Users;

public interface UserService {
    void register(Users user);

    String varify(Users users);
}
