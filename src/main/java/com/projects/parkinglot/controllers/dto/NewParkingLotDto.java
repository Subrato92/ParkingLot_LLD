package com.projects.parkinglot.controllers.dto;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class NewParkingLotDto {
    private String name;
    private long ownerContact;
    private long adminContact;
}
