package edu.lingnan.service.impl;

import edu.lingnan.dto.RoomDto;
import edu.lingnan.entity.ClassRoom;
import edu.lingnan.mapper.RoomMapper;
import edu.lingnan.service.RoomService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Log4j2
@Service
@Transactional
public class RoomServiceImpl implements RoomService {

    @Autowired
    private RoomMapper roomMapper;

    @Override
    public List<ClassRoom> queryRoomList() {
        ArrayList<ClassRoom> classRooms = new ArrayList<>();
        for (ClassRoom classRoom : roomMapper.queryRoomList()) {
            if (classRoom.getRStatus().equals("1")&&classRoom.getRCanables()>0){
                classRooms.add(classRoom);
            }
        }
        return classRooms;
    }

    @Override
    public int addRoom(RoomDto room) {
        int i = roomMapper.addRoom(room);
        return i;
    }

    @Override
    public List<ClassRoom> findAllRoom() {
        return roomMapper.queryRoomList();
    }


}
