/******************************************************************************
 * Copyright © 2020 xiashuangxi<xiashuangxi@hotmail.com>                      *
 *                                                                            *
 * Permission is hereby granted, free of charge, to any person obtaining a    *
 * copy of this software and associated documentation files (the “Software”), *
 * to deal in the Software without restriction, including without limitation  *
 * the rights to use, copy, modify, merge, publish, distribute, sublicense,   *
 * and/or sell copies of the Software, and to permit persons to whom the      *
 * Software is furnished to do so, subject to the following conditions:       *
 *                                                                            *
 * The above copyright notice and this permission notice shall be included in *
 * all copies or substantial portions of the Software.                        *
 *                                                                            *
 * THE SOFTWARE IS PROVIDED “AS IS”, WITHOUT WARRANTY OF ANY KIND, EXPRESS OR *
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,   *
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE*
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER     *
 * LIABILITY,WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING     *
 * FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER        *
 * DEALINGS IN THE SOFTWARE.                                                  *
 ******************************************************************************/

package com.sbe.tdd.mapper;

import com.sbe.tdd.TDDApplication;
import com.sbe.tdd.dto.DemoDTO;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.BDDMockito;
import org.mockito.Mock;
import org.mockito.Spy;
import org.mybatis.spring.boot.test.autoconfigure.MybatisTest;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;

import java.util.Collections;
import java.util.List;

@MybatisTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class DemoMapperTest{

    @Spy
    private DemoMapper demoMapper;


    @Test
    public void test_demo_findAll() {
        System.out.println("##########Mapper FindAll##########");
        DemoDTO demoDTO = new DemoDTO(1L,"xxx");
        BDDMockito.given(demoMapper.findAll()).willReturn(Collections.singletonList(demoDTO));

        List<DemoDTO> demos = demoMapper.findAll();
        Assertions.assertEquals(1, demos.size());
    }

    @Test
    public void test_demo_create() {
        System.out.println("##########Mapper Create##########");
        DemoDTO demoDTO = new DemoDTO(1L,"xxx");
        demoMapper.createDto(demoDTO);
    }
}
