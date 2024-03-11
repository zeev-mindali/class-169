package com.ori.thehurt.beans;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name="rooms")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Rooms {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String roomName;
    private int floorNumber;

    @OneToMany (cascade = CascadeType.ALL)
    @Singular
    private List<SmartModule> modules;
}
