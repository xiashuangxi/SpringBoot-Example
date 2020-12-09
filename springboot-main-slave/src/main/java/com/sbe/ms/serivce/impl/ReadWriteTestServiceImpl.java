package com.sbe.ms.serivce.impl;

import com.sbe.ms.dto.ReadWriteTestDTO;
import com.sbe.ms.mapper.ReadWriteTestMapper;
import com.sbe.ms.serivce.ReadWriteTestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ReadWriteTestServiceImpl implements ReadWriteTestService {

    @Autowired
    private ReadWriteTestMapper readWriteTestMapper;

    @Override
    public List<ReadWriteTestDTO> findAll() {
        return readWriteTestMapper.findAll();
    }

    @Override
    @Transactional
    public int saveDto(ReadWriteTestDTO dto) {
        return readWriteTestMapper.saveDto(dto);
    }
}
