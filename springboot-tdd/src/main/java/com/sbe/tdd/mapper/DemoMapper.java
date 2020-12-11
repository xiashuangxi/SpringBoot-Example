package com.sbe.tdd.mapper;

import com.sbe.tdd.dto.DemoDTO;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface DemoMapper {
    public List<DemoDTO> findAll();
}
