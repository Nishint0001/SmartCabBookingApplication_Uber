package com.nishintgoyal.project.uber.uberApplication.controllers;

import com.nishintgoyal.project.uber.uberApplication.dto.RideRequestDto;
import com.nishintgoyal.project.uber.uberApplication.services.RiderService;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/rider")
public class RiderController
{

    private final RiderService riderService;

    public RiderController(RiderService riderService)
    {
        this.riderService = riderService;
    }


    @PostMapping(path="/requestRide")
    public ResponseEntity<RideRequestDto> requestRide(@RequestBody RideRequestDto rideRequestDto)
    {
        return ResponseEntity.ok(riderService.requestRide(rideRequestDto));
    }
}
