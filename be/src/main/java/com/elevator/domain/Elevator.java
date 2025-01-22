package com.elevator.domain;

import com.elevator.domain.enumeration.ElevatorStatus;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Elevator {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "currentFloor")
    private Integer currentFloor;

    @Column(name = "destinationFloor")
    private Integer destinationFloor;

    @Enumerated(EnumType.STRING)
    @Column(name = "status")
    private ElevatorStatus status;

}
