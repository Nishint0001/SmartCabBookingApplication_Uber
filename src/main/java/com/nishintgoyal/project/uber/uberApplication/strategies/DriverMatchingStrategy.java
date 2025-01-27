package com.nishintgoyal.project.uber.uberApplication.strategies;

import com.nishintgoyal.project.uber.uberApplication.dto.RideRequestDto;
import com.nishintgoyal.project.uber.uberApplication.entities.Driver;
import com.nishintgoyal.project.uber.uberApplication.entities.RideRequest;
import com.nishintgoyal.project.uber.uberApplication.repositories.DriverRepository;

import java.util.List;

public interface DriverMatchingStrategy
{
    List<Driver> findMatchingDriver(RideRequest rideRequest);

}
