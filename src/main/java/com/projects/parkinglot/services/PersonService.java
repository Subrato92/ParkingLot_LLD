package com.projects.parkinglot.services;


import com.projects.parkinglot.dao.PersonDao;
import com.projects.parkinglot.models.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;
@Service
public class PersonService {

    @Autowired
    private PersonDao personDao;

    public boolean create(Person person){
        Person respPerson = personDao.save(person);
        return respPerson.equalsTo(person);
    }

    public Person getById(String id){
        return personDao.getReferenceById(UUID.fromString(id));
    }
}
