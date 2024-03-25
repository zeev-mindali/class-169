package com.ori.thehurt.beans;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "smart_module")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class SmartModule {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String moduleName;
    private SwitchTypes switchTypes;
    private int nodeId;
    private int nodeEpid;
}
