package com.sbe.tdd.service;

import com.sbe.tdd.dto.DemoDTO;
import org.apache.ibatis.reflection.ArrayUtil;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.BDDMockito;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
public class DemoServiceTest {
    @Mock
    private DemoService demoService;

    @Test
    public void getDemoDetails_returnsDemoInfo() {
        DemoDTO dto = new DemoDTO();
        dto.setId(1L);
        dto.setContent("xxx");
        List<DemoDTO> ldtolist = new ArrayList<DemoDTO>();
        ldtolist.add(dto);
        BDDMockito.given( demoService.findAll()).willReturn( ldtolist );
        List<DemoDTO> dtoList = demoService.findAll();

        Assertions.assertFalse(dtoList.isEmpty());
        Assertions.assertEquals(dtoList.get(0).getId(),1L);
        Assertions.assertEquals(dtoList.get(0).getContent(),"xxx");
    }

    @Test
    public void getDemoDetails_returnsDemoAll() {
        List<DemoDTO> dtoList = demoService.findAll();
//        Assertions.assertFalse(dtoList.isEmpty());
    }
}
