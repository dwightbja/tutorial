package com.example.tutorial.mapper;

import com.example.tutorial.models.Room;
import com.example.tutorial.models.RoomResponse;
import org.springframework.stereotype.Component;

@Component
public class ResponseMapper {

    public RoomResponse map (Room room){
        RoomResponse roomResponse = new RoomResponse();
        roomResponse.setRoomName(room.getRoomName());
        roomResponse.setCapacity(room.getCapacity());

        return roomResponse;
    }
}
