package com.projects.parkinglot.controllers;

import com.projects.parkinglot.controllers.dto.NewParkingLotDto;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;


@Configuration(proxyBeanMethods = false)
public class ParkingLotHandler {

    public Mono<ServerResponse> create(ServerRequest request) {

        Flux<NewParkingLotDto> bodyFlux = request.bodyToFlux(NewParkingLotDto.class);

        return ServerResponse.ok().contentType(MediaType.APPLICATION_JSON)
                .body(BodyInserters.fromValue("Hello, Spring!"));
    }

}
