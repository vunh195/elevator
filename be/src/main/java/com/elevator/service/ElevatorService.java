package com.elevator.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.elevator.domain.Elevator;
import com.elevator.domain.enumeration.ElevatorStatus;

@Service
public class ElevatorService {

    private final List<Elevator> elevators = new ArrayList<>();

    public ElevatorService() {
        for (int i = 0; i < 5; i++) {
            Elevator elevator = Elevator.builder().id((long) i).currentFloor(0).destinationFloor(0)
                    .status(ElevatorStatus.IDLE)
                    .build();
            elevators.add(elevator);
        }
    }

    public List<Elevator> getElevators() {
        return elevators;
    }

    public Elevator getElevatorById(Long id) {
        return elevators.stream().filter(elevator -> elevator.getId().equals(id)).findFirst().orElse(null);
    }

}
