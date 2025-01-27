package com.nishintgoyal.project.uber.uberApplication.dto;

import lombok.Data;

@Data
public class PointDto
{
    public PointDto()
    {

    }

    public PointDto(double[] coordinates, String type) {
        this.coordinates = coordinates;
        this.type = type;
    }

    public PointDto(double[] coordinates) {
        this.coordinates = coordinates;
    }

    private double[] coordinates;

    public double[] getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(double[] coordinates) {
        this.coordinates = coordinates;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    private String type="Point";
}

