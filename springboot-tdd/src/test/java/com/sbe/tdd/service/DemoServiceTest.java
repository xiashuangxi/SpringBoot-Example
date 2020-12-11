package com.sbe.tdd.service;

import com.sbe.tdd.dto.DemoDTO;
import com.sbe.tdd.mapper.DemoMapper;
import com.sbe.tdd.service.impl.DemoServiceImpl;
import org.apache.ibatis.reflection.ArrayUtil;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.BDDMockito;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@SpringBootTest
public class DemoServiceTest {
    @Mock
    private DemoMapper demoMapper;

    @InjectMocks
    private DemoService demoService = new DemoServiceImpl();

    @Autowired
    private DemoServiceImpl demoServiceImpl;

    @Test
    public void getDemoDetails_returnsDemoInfo() {
        DemoDTO dto = new DemoDTO();
        dto.setId(1L);
        dto.setContent("xxx");

        List<DemoDTO> demos = Arrays.asList(dto);
        BDDMockito.when(demoService.findAll()).thenReturn(demos);
        List<DemoDTO> dtoList = demoService.findAll();

        Assertions.assertFalse(dtoList.isEmpty());
        Assertions.assertEquals(dtoList.get(0).getId(),1L);
        Assertions.assertEquals(dtoList.get(0).getContent(),"xxx");
    }

    @Test
    public void getDemoDetails_returnsDemoAll() {
        DemoDTO dto = new DemoDTO();
        dto.setId(1L);
        dto.setContent("xxx");

        List<DemoDTO> demos = Arrays.asList(dto);

        BDDMockito.when(demoService.findAll()).thenReturn(demos);
        List<DemoDTO> dtoList = demoService.findAll();
        Assertions.assertFalse(dtoList.isEmpty());
    }
}
