package com.nishintgoyal.project.uber.uberApplication.services.impl;

import com.nishintgoyal.project.uber.uberApplication.dto.DriverDto;
import com.nishintgoyal.project.uber.uberApplication.dto.RideRequestDto;
import com.nishintgoyal.project.uber.uberApplication.dto.RiderDto;
import com.nishintgoyal.project.uber.uberApplication.entities.Driver;
import com.nishintgoyal.project.uber.uberApplication.entities.RideRequest;
import com.nishintgoyal.project.uber.uberApplication.entities.enums.RideRequestStatus;
import com.nishintgoyal.project.uber.uberApplication.repositories.RideRequestRepository;
import com.nishintgoyal.project.uber.uberApplication.services.RiderService;
import com.nishintgoyal.project.uber.uberApplication.strategies.DriverMatchingStrategy;
import com.nishintgoyal.project.uber.uberApplication.strategies.RideFareCalculationStrategy;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j// for logging
public class RiderServiceImpl implements RiderService
{
    private final ModelMapper modelMapper;
    private final RideFareCalculationStrategy rideFareCalculationStrategy;
    private final DriverMatchingStrategy driverMatchingStrategy;
    private final RideRequestRepository rideRequestRepository;

    public RiderServiceImpl(ModelMapper modelMapper, RideFareCalculationStrategy rideFareCalculationStrategy, DriverMatchingStrategy driverMatchingStrategy, RideRequestRepository rideRequestRepository)
    {
        this.modelMapper = modelMapper;
        this.rideFareCalculationStrategy = rideFareCalculationStrategy;
        this.driverMatchingStrategy = driverMatchingStrategy;
        this.rideRequestRepository = rideRequestRepository;
    }

    @Override
    public RideRequestDto requestRide(RideRequestDto rideRequestDto)
    {
        RideRequest rideRequest=modelMapper.map(rideRequestDto, RideRequest.class);
        rideRequest.setRideRequestStatus(RideRequestStatus.PENDING);

        Double fare=rideFareCalculationStrategy.calculateFare(rideRequest);
        rideRequest.setFare(fare);

        RideRequest savedRideRequest=rideRequestRepository.save(rideRequest);

        driverMatchingStrategy.findMatchingDriver(rideRequest);

        return modelMapper.map(savedRideRequest, RideRequestDto.class);
    }

    @Override
    public RiderDto requestRide(Long rideId) {
        return null;
    }

    @Override
    public RiderDto cancelRide(Long rideId) {
        return null;
    }

    @Override
    public RiderDto rateRider(Long rideId, Integer rating) {
        return null;
    }

    @Override
    public DriverDto getMyProfile()
    {
        return null;
    }

    @Override
    public List<RiderDto> getAllMyRides()
    {
        return List.of();
    }

}
