package com.johnbryce.catbackend.beans;

import jakarta.persistence.*;
import lombok.*;
import java.util.List;

@Entity
@Table(name = "cats")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Cat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(nullable = false, length = 40)
    private String name;
    private Float weight;
    @ManyToMany (cascade = CascadeType.ALL)
    @Singular
    private List<Toy> toys;
}
