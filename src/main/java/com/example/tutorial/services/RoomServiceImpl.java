package com.example.tutorial.services;

import com.example.tutorial.mapper.ResponseMapper;
import com.example.tutorial.models.Room;
import com.example.tutorial.models.RoomResponse;
import com.example.tutorial.respository.RoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class RoomServiceImpl {

@Autowired
private RoomRepository roomRepository;

@Autowired
ResponseMapper responseMapper;

    public RoomResponse getRoom(int id){

        RoomResponse roomResponse = new RoomResponse();

        Optional<Room> room = roomRepository.findById(id);

        if(room.isPresent()){
            roomResponse = responseMapper.map(room.get());
        }
        return roomResponse;



    }
}
