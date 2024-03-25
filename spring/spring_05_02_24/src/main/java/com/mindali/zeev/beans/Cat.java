package com.mindali.zeev.beans;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Cat {
    @Value("bumper")
    private String name;

    @Value("0")
    private int age;

    private String chip = UUID.randomUUID().toString();

}
