package com.johnbryce.cattoys.beans;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name ="cat")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Cat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private double weight;
    @Enumerated(EnumType.STRING)
    private Color color;

    @ManyToMany(cascade = CascadeType.ALL)
    @Singular
    private List<Toy> toys = new ArrayList<>();
}
