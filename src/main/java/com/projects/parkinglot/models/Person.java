package com.projects.parkinglot.models;

import com.projects.parkinglot.controllers.dto.PersonDto;
import lombok.*;
import lombok.extern.slf4j.Slf4j;

import javax.persistence.*;
import java.util.UUID;

@Setter @Getter @Builder
@Entity @AllArgsConstructor @Slf4j @NoArgsConstructor
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    private String name;
    private String aadharNo;

    public boolean equalsTo(Person person){
        if(person.getId().compareTo(id)==0)
            return true;
        return false;
    }

    public Person(PersonDto personDto){
        name = personDto.getName();
        aadharNo = personDto.getAadharNo();
        id = UUID.randomUUID();
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Person - id:").append(id).append(",");
        sb.append("name:").append(id).append(",");
        sb.append("aadhar:").append(id);
        return sb.toString();
    }

}
