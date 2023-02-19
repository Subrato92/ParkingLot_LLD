package com.projects.parkinglot.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.UUID;

@Getter @Setter @Entity
public class ParkingLot {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    private String name;
    @OneToOne @MapsId
    private Person ownerId;
    @OneToOne @MapsId
    private Person adminId;
}
