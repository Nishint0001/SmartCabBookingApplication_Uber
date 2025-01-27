package com.nishintgoyal.project.uber.uberApplication.strategies;

import com.nishintgoyal.project.uber.uberApplication.dto.RideRequestDto;
import com.nishintgoyal.project.uber.uberApplication.entities.RideRequest;

public interface RideFareCalculationStrategy
{
    double Ride_per_km_price=10;
    double calculateFare(RideRequest rideRequest);
}
