package service;

import dto.Users;
import entity.UserEntity;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;
import repository.UserRepository;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService{
    private final UserRepository userRepository;

    private final AuthenticationManager authenticationManager;

    private final JWTService jwtService;

    @Override
    public void register(Users user) {
        userRepository.save(new ModelMapper().map(user, UserEntity.class));
    }

    @Override
    public String varify(Users users) {
        Authentication authenticate = authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(users.getUserName(),users.getPassword()));
        if(authenticate.isAuthenticated()){
            return jwtService.generateToken(users.getUserName());
        }
        return "failed";
    }
}

