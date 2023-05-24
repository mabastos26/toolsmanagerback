package com.eletrodev.domain.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.eletrodev.domain.model.Tool;

public interface ToolRepository extends JpaRepository<Tool, Long>{

}
