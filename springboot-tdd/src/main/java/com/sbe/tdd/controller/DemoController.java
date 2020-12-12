package com.sbe.tdd.controller;

import com.sbe.tdd.dto.DemoDTO;
import com.sbe.tdd.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Demo 控制器类
 */
@RestController
@RequestMapping( value = "/tdd")
public class DemoController {

    @Autowired
    private DemoService demoService;

    /**
     * 查询所有数据
     * @return
     */
    @GetMapping( value = "/findAll")
    public List<DemoDTO> findAll() {
        return demoService.findAll();
    }
}
