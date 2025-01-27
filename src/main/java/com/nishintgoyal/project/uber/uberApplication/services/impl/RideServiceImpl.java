package com.nishintgoyal.project.uber.uberApplication.services.impl;

import com.nishintgoyal.project.uber.uberApplication.dto.RideRequestDto;
import com.nishintgoyal.project.uber.uberApplication.entities.Driver;
import com.nishintgoyal.project.uber.uberApplication.entities.Ride;
import com.nishintgoyal.project.uber.uberApplication.entities.enums.RideStatus;
import com.nishintgoyal.project.uber.uberApplication.services.RideService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

@Service
public class RideServiceImpl implements RideService
{
    @Override
    public Ride getRideById() {
        return null;
    }

    @Override
    public void matchWithDrivers(RideRequestDto rideRequestDto) {

    }

    @Override
    public Ride createNewRide(RideRequestDto rideRequestDto, Driver driver) {
        return null;
    }

    @Override
    public Ride updateRideStatus(Long rideId, RideStatus rideStatus) {
        return null;
    }

    @Override
    public Page<Ride> getAllRidesOfRider(Long riderId, PageRequest pageRequest) {
        return null;
    }

    @Override
    public Page<Ride> getALlRidersOfDriver(Long driverId, PageRequest pageRequest) {
        return null;
    }
}
