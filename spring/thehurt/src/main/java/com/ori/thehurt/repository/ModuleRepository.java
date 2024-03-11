package com.ori.thehurt.repository;

import com.ori.thehurt.beans.SmartModule;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ModuleRepository extends JpaRepository<SmartModule, Integer> {
}
