package com.nishintgoyal.project.uber.uberApplication.services.impl;

import com.nishintgoyal.project.uber.uberApplication.dto.DriverDto;
import com.nishintgoyal.project.uber.uberApplication.dto.RiderDto;
import com.nishintgoyal.project.uber.uberApplication.services.DriverService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DriverServiceImpl implements DriverService
{

    @Override
    public RiderDto acceptRide(Long rideId) {
        return null;
    }

    @Override
    public RiderDto cancelRide(Long rideId) {
        return null;
    }

    @Override
    public RiderDto startRide(Long rideId) {
        return null;
    }

    @Override
    public RiderDto endRide(Long rideId) {
        return null;
    }

    @Override
    public RiderDto rateRider(Long rideId, Integer rating) {
        return null;
    }

    @Override
    public DriverDto getMyProfile() {
        return null;
    }

    @Override
    public List<RiderDto> getAllMyRides() {
        return List.of();
    }
}
