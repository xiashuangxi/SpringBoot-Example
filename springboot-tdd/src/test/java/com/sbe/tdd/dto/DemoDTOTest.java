package com.sbe.tdd.dto;

import com.sbe.tdd.mapper.DemoMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertFalse;

//@AutoConfigureTestDatabase( replace = AutoConfigureTestDatabase.Replace.NONE)
@SpringBootTest
public class DemoDTOTest {

    @Autowired
    private DemoMapper demoMapper;

    @Test
    public void getDemo_returnDemoDetails() throws Exception {
        List<DemoDTO> dtoList = demoMapper.findAll();
        assertFalse(dtoList.isEmpty());
    }
}
