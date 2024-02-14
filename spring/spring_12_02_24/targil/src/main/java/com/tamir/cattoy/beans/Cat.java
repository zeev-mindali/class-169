package com.tamir.cattoy.beans;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="cat")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Cat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(length = 40, nullable = false)
    private String name;
    private float weight;
    @ManyToMany(cascade = CascadeType.ALL)
    @Singular
    private List<Toy> toys = new ArrayList<>();
}
