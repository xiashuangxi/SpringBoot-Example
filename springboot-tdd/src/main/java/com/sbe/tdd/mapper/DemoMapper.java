package com.sbe.tdd.mapper;

import com.sbe.tdd.dto.DemoDTO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Demo Mapper类
 */
@Component
public interface DemoMapper {
    public List<DemoDTO> findAll();

    public int createDto(DemoDTO dto);
}
