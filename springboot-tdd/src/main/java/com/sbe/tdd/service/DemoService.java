package com.sbe.tdd.service;

import com.sbe.tdd.dto.DemoDTO;

import java.util.List;

public interface DemoService {

    public List<DemoDTO> findAll();

    public int createDto(DemoDTO dto);
}
