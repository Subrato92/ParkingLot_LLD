package com.projects.parkinglot.controllers.dto;

import java.util.HashMap;

public class HttpResponseDto {
    private HashMap<String, String> map = new HashMap<>();

    public static HttpResponseDto createSuccessResp(){
        HttpResponseDto httpResponseDto = new HttpResponseDto();
        httpResponseDto.put("status", "success");
        return httpResponseDto;
    }

    public static HttpResponseDto createFailedResp(){
        HttpResponseDto httpResponseDto = new HttpResponseDto();
        httpResponseDto.put("status", "failed");
        return httpResponseDto;
    }

    public void put(String k, String v){
        map.put(k, v);
    }

    @Override
    public String toString(){
        return map.toString();
    }
}
