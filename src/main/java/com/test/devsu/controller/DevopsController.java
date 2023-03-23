package com.test.devsu.controller;

import com.test.devsu.dto.MessageDto;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class DevopsController {

    private static String apiKeyVal = "2f5ae96c-b558-4c7b-a590-a501ae1c3f6c";

    @PostMapping("/DevOps")
    public ResponseEntity<String> sendMessage(@RequestHeader("X-Parse-REST-API-Key") String apiKey, @RequestBody MessageDto messageDto) {
        if (!apiKeyVal.equals(apiKey)) {
            return new ResponseEntity<>("ERROR", HttpStatus.UNAUTHORIZED);
        }
        String response = "Hello " + messageDto.getTo() + " your message will be send'";
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
