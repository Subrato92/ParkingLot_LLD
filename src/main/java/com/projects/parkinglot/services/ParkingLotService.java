package com.projects.parkinglot.services;

import com.projects.parkinglot.dao.ParkingLotDao;
import com.projects.parkinglot.models.ParkingLot;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ParkingLotService {

    @Autowired
    ParkingLotDao parkingLotDao;

    public void createNewParkingLot(ParkingLot newParkingLot){
        parkingLotDao.save(newParkingLot);
    }


}
