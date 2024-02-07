package com.johnbryce.cats.beans;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="cats")
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Cat {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false, length = 40)
    private String name;

    private double weight;

    @Enumerated(EnumType.STRING)
    private Color color;
}
