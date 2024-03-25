package com.johnbryce.cattoys.beans;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "toys")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Toy {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(length = 50,nullable = false)
    private String name;

    public Toy(String name) {
        this.name = name;
    }
}
