package com.projects.parkinglot.controllers;

import com.projects.parkinglot.controllers.dto.HttpResponseDto;
import com.projects.parkinglot.controllers.dto.PersonDto;
import com.projects.parkinglot.models.Person;
import com.projects.parkinglot.services.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

@Configuration(proxyBeanMethods = false)
public class PersonHandler {

    @Autowired
    private PersonService personService;

    public Mono<ServerResponse> create(ServerRequest request){

        return request
            .bodyToMono(PersonDto.class)
            .flatMap( personDto -> {
                Person p = new Person(personDto);
                return Mono.just(p);
            })
            .flatMap(person -> {
                if(personService.create(person))
                    return ServerResponse.ok()
                            .contentType(MediaType.APPLICATION_JSON)
                            .body(BodyInserters.fromValue(HttpResponseDto.createSuccessResp()));

                return ServerResponse.ok()
                        .contentType(MediaType.APPLICATION_JSON)
                        .body(BodyInserters.fromValue(HttpResponseDto.createFailedResp()));
            });
    }

}
