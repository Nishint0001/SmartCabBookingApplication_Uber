package com.nishintgoyal.project.uber.uberApplication.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DriverDto
{
    private  UserDto userDto;

    private Double rating;


}
