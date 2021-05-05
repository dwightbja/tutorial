package com.example.tutorial.controller;

import com.example.tutorial.models.RoomResponse;
import com.example.tutorial.services.RoomServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RoomServiceController {

    @Autowired
    private RoomServiceImpl roomService;

    @GetMapping(value = "/room/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<RoomResponse> get(@PathVariable Integer id){

        RoomResponse response = roomService.getRoom(id);

        return ResponseEntity.ok(response);

    }



}
