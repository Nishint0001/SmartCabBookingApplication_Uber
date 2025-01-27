package com.nishintgoyal.project.uber.uberApplication.services.impl;

import com.nishintgoyal.project.uber.uberApplication.dto.DriverDto;
import com.nishintgoyal.project.uber.uberApplication.dto.SignupDto;
import com.nishintgoyal.project.uber.uberApplication.dto.UserDto;
import com.nishintgoyal.project.uber.uberApplication.entities.User;
import com.nishintgoyal.project.uber.uberApplication.entities.enums.Role;
import com.nishintgoyal.project.uber.uberApplication.repositories.UserRepository;
import com.nishintgoyal.project.uber.uberApplication.services.AuthService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class AuthServiceImpl implements AuthService
{
    private final UserRepository userRepository;
    private final ModelMapper modelMapper;

    public AuthServiceImpl(UserRepository userRepository, ModelMapper modelMapper) {
        this.userRepository = userRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public String login(String email, String password) {
        return "";
    }

    @Override
    public UserDto signup(SignupDto signupDTO)
    {
        User user=userRepository.findByEmail(signupDTO.getEmail());

        if(user!=null)
        {
            throw new RuntimeException("Cannot signup ,User already exits in database"+signupDTO.getEmail());
        }

        User mappedUser=modelMapper.map(signupDTO, User.class);
        mappedUser.setRoles(Set.of(Role.RIDER));
        User savedUser=userRepository.save(mappedUser);

        return null;
    }

    @Override
    public DriverDto onboardNewDriver(Long userId) {
        return null;
    }
}
