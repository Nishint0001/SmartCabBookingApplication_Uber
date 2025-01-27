package com.nishintgoyal.project.uber.uberApplication.dto;

import com.nishintgoyal.project.uber.uberApplication.entities.Driver;
import com.nishintgoyal.project.uber.uberApplication.entities.enums.PaymentMethod;
import com.nishintgoyal.project.uber.uberApplication.entities.enums.RideStatus;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.locationtech.jts.geom.Point;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RideDto
{
    private Long id;

    private Point pickUpLocation;

    private Point dropOffLocation;

    private LocalDateTime createdTime;

    private DriverDto driverDto;

    private RiderDto riderDto;

    private PaymentMethod paymentMethod;

    private RideStatus rideStatus;

    private Double fare;

    private LocalDateTime startedAt;

    private LocalDateTime endedAt;

    private String otp;

}
