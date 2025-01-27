package com.nishintgoyal.project.uber.uberApplication.strategies.impl;

import com.nishintgoyal.project.uber.uberApplication.entities.Driver;
import com.nishintgoyal.project.uber.uberApplication.entities.RideRequest;
import com.nishintgoyal.project.uber.uberApplication.repositories.DriverRepository;
import com.nishintgoyal.project.uber.uberApplication.strategies.DriverMatchingStrategy;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DriverMatchingNearestDriverStrategy implements DriverMatchingStrategy
{
    private final DriverRepository driverRepository;

    public DriverMatchingNearestDriverStrategy(DriverRepository driverRepository)
    {
        this.driverRepository = driverRepository;
    }

    @Override
    public List<Driver> findMatchingDriver(RideRequest rideRequest)
    {
        return driverRepository.findTENNearestDrivers(rideRequest.getPickUpLocation());
    }
}
