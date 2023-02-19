package com.projects.parkinglot.dao;

import com.projects.parkinglot.models.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface PersonDao extends JpaRepository<Person, UUID> {
}
