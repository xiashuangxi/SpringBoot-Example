package com.sbe.tdd.service;

import com.sbe.tdd.dto.DemoDTO;
import com.sbe.tdd.mapper.DemoMapper;
import com.sbe.tdd.service.impl.DemoServiceImpl;
import org.apache.ibatis.reflection.ArrayUtil;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.BDDMockito;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@ExtendWith(SpringExtension.class)
public class DemoServiceTest {

    @Mock
    private DemoMapper demoMapper;

    @InjectMocks
    private DemoService demoService = new DemoServiceImpl();

    private DemoDTO demoDTO;

    @BeforeEach
    public void init(){
        demoDTO = new DemoDTO(1L,"xxx");
    }

    @Test
    public void test_demo_findAll() {
        System.out.println("##########Service FindAll##########");
//       DemoDTO demoDTO = new DemoDTO(1L,"xxx");
       BDDMockito.given(demoMapper.findAll()).willReturn(Collections.singletonList(this.demoDTO));

       List<DemoDTO> demos = demoService.findAll();
       Assertions.assertEquals(1, demos.size());
       Assertions.assertEquals(1,demos.get(0).getId());
       Assertions.assertEquals("xxx", demos.get(0).getContent());
    }


    @Test
    public void test_demo_create() {
        // TODO: 还有疑惑
//        DemoDTO demoDTO = new DemoDTO(0L,"xxx");randomString();
//        Assertions.assertEquals(this.demoDTO.getId(), 1L);
        int count = demoService.createDto(this.demoDTO);
//        Assertions.assertNotEquals(count, 1L);
    }

    private String randomString() {
        String id = "";
        for (int i = 0; i < 20; i++) {
            double dValue = Math.random();
            if (i % 2 == 0) {
                id += (char) ((dValue * 26) + 65);   // 대문자
                continue;
            }
            id += (char) ((dValue * 26) + 97); // 소문자
        }
        return id;
    }

}
