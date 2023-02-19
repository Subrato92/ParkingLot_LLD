package com.projects.parkinglot.models;

import javax.persistence.*;
import java.util.UUID;

@Entity
public class Contact {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @ManyToOne(fetch = FetchType.LAZY)
    private Person person;

    private long contactNo;
}
