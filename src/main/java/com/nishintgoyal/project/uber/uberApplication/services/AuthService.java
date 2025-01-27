package com.nishintgoyal.project.uber.uberApplication.services;

import com.nishintgoyal.project.uber.uberApplication.dto.DriverDto;
import com.nishintgoyal.project.uber.uberApplication.dto.SignupDto;
import com.nishintgoyal.project.uber.uberApplication.dto.UserDto;
import com.nishintgoyal.project.uber.uberApplication.entities.Driver;

public interface AuthService
{
    String login(String email,String password);

    UserDto signup(SignupDto signupDTO);

    DriverDto onboardNewDriver(Long userId);
}
