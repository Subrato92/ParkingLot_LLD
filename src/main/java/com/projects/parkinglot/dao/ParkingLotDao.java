package com.projects.parkinglot.dao;

import com.projects.parkinglot.models.ParkingLot;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ParkingLotDao extends JpaRepository<ParkingLot, String> {
}
