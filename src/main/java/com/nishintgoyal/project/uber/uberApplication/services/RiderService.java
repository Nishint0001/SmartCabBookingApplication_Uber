package com.nishintgoyal.project.uber.uberApplication.services;

import com.nishintgoyal.project.uber.uberApplication.dto.DriverDto;
import com.nishintgoyal.project.uber.uberApplication.dto.RideRequestDto;
import com.nishintgoyal.project.uber.uberApplication.dto.RiderDto;

import java.util.List;

public interface RiderService
{
    RideRequestDto requestRide(RideRequestDto rideRequestDto);

    RiderDto requestRide(Long rideId);

    RiderDto cancelRide(Long rideId);

    RiderDto rateRider(Long rideId,Integer rating);

    DriverDto getMyProfile();

    List<RiderDto> getAllMyRides();
}
