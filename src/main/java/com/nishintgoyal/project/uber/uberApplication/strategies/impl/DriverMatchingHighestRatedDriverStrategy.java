package com.nishintgoyal.project.uber.uberApplication.strategies.impl;

import com.nishintgoyal.project.uber.uberApplication.dto.RideRequestDto;
import com.nishintgoyal.project.uber.uberApplication.entities.Driver;
import com.nishintgoyal.project.uber.uberApplication.entities.RideRequest;
import com.nishintgoyal.project.uber.uberApplication.strategies.DriverMatchingStrategy;

import java.util.List;

public class DriverMatchingHighestRatedDriverStrategy implements DriverMatchingStrategy
{
    @Override
    public List<Driver> findMatchingDriver(RideRequest rideRequest)
    {
        return List.of();
    }
}
