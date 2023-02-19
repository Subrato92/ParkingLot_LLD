package com.projects.parkinglot.controllers.routerConfigurations;

import com.projects.parkinglot.controllers.ParkingLotHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

import static org.springframework.web.reactive.function.server.RequestPredicates.POST;
import static org.springframework.web.reactive.function.server.RequestPredicates.accept;

@Configuration
public class ParkingLotRouter {

    @Bean
    public RouterFunction<ServerResponse> route(ParkingLotHandler parkingLotHandler) {

        return RouterFunctions
                .route(POST("/parkingLot/create").and(accept(MediaType.APPLICATION_JSON)), parkingLotHandler::create);
    }

}
