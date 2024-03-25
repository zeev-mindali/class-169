package com.tamir.cattoy.beans;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="toys")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Toy {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(length = 40, nullable = false)
    private String name;

    public Toy(String name) {
        this.name = name;
    }
}
