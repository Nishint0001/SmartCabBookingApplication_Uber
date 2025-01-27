package com.nishintgoyal.project.uber.uberApplication.services;

import com.nishintgoyal.project.uber.uberApplication.dto.RideRequestDto;
import com.nishintgoyal.project.uber.uberApplication.entities.Driver;
import com.nishintgoyal.project.uber.uberApplication.entities.Ride;
import com.nishintgoyal.project.uber.uberApplication.entities.RideRequest;
import com.nishintgoyal.project.uber.uberApplication.entities.enums.RideStatus;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

public interface RideService
{
    Ride getRideById();

    void matchWithDrivers(RideRequestDto rideRequestDto);

    Ride createNewRide(RideRequestDto rideRequestDto, Driver driver);

    Ride updateRideStatus(Long rideId, RideStatus rideStatus);

    Page<Ride> getAllRidesOfRider(Long riderId, PageRequest pageRequest);

    Page<Ride> getALlRidersOfDriver(Long driverId,PageRequest pageRequest);

}
