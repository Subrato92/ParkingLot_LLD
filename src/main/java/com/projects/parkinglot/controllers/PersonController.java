package com.projects.parkinglot.controllers;

import com.projects.parkinglot.controllers.dto.PersonDto;
import com.projects.parkinglot.models.Person;
import com.projects.parkinglot.services.PersonService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
@Slf4j
@RestController
@RequestMapping("/persons")
public class PersonController {

    @Autowired
    PersonService personService;

    @PostMapping(path = "/create", consumes = "application/json")
    public Person create(@RequestBody PersonDto personDto, @RequestHeader HashMap<String, String> headers){

        log.info("Received Request... @create");
        Person person = new Person(personDto);

        personService.create(person);

        return person;
    }

}
