package com.projects.parkinglot.controllers.exceptions;

public class FailedToCreatePerson extends Exception{

    public FailedToCreatePerson(){
        super("Failed to create new person..");
    }
}
