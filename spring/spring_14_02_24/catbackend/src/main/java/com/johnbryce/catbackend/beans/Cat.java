package com.johnbryce.catbackend.beans;

import jakarta.persistence.*;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import lombok.*;
import org.hibernate.validator.constraints.Length;

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
    @Column(nullable = false, length = 20)
    @Length(max = 5)
    private String name;
    @Max(20)
    private Integer age;
    @Min(0)
    private Float weight;
    @ManyToMany (cascade = CascadeType.ALL)
    @Singular
    private List<Toy> toys;
}
