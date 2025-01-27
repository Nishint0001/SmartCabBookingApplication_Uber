package com.nishintgoyal.project.uber.uberApplication.strategies.impl;
import com.nishintgoyal.project.uber.uberApplication.dto.RideRequestDto;
import com.nishintgoyal.project.uber.uberApplication.entities.RideRequest;
import com.nishintgoyal.project.uber.uberApplication.services.DistanceService;
import com.nishintgoyal.project.uber.uberApplication.strategies.RideFareCalculationStrategy;
import org.springframework.stereotype.Service;

@Service
public class RiderFareDefaultFareCalculationStrategy implements RideFareCalculationStrategy
{
    private final DistanceService distanceService;

    public RiderFareDefaultFareCalculationStrategy(DistanceService distanceService) {
        this.distanceService = distanceService;
    }

    @Override
    public double calculateFare(RideRequest rideRequest)
    {
    Double distance=distanceService.calculateDistance(rideRequest.getPickUpLocation(),rideRequest.getDropOffLocation());
    return distance*Ride_per_km_price;
    }
}
