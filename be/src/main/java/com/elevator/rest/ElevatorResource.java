package com.elevator.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.elevator.domain.Elevator;
import com.elevator.service.ElevatorService;

@RestController
@RequestMapping("/api/v1/elevators")
public class ElevatorResource {
    @Autowired
    private ElevatorService elevatorService;

    @GetMapping
    public ResponseEntity<List<Elevator>> getElevators() {
        return ResponseEntity.ok().body(elevatorService.getElevators());
    }

}
