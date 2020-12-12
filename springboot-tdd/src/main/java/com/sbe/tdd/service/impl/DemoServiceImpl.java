package com.sbe.tdd.service.impl;

import com.sbe.tdd.dto.DemoDTO;
import com.sbe.tdd.mapper.DemoMapper;
import com.sbe.tdd.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Demo 服务类
 */
@Service
public class DemoServiceImpl implements DemoService {

    @Autowired
    private DemoMapper demoMapper;

    @Override
    public List<DemoDTO> findAll() {
        return demoMapper.findAll();
    }

    @Override
    public int createDto(DemoDTO dto){
        return demoMapper.createDto(dto);
    }
}
