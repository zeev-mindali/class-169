package com.johnbryce.cats.beans;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="dogs")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Dogs {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String nickName;
    private boolean isCute;

    public Dogs(String nickName, boolean isCute) {
        this.nickName = nickName;
        this.isCute = isCute;
    }
}
