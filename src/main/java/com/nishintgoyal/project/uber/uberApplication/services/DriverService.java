package com.nishintgoyal.project.uber.uberApplication.services;

import com.nishintgoyal.project.uber.uberApplication.dto.DriverDto;
import com.nishintgoyal.project.uber.uberApplication.dto.RiderDto;

import java.util.List;

public interface DriverService
{
    RiderDto acceptRide(Long rideId);

    RiderDto cancelRide(Long rideId);

    RiderDto startRide(Long rideId);

    RiderDto endRide(Long rideId);

    RiderDto rateRider(Long rideId,Integer rating);

    DriverDto getMyProfile();

    List<RiderDto> getAllMyRides();
}
