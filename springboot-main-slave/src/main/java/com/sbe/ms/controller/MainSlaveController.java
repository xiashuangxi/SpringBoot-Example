package com.sbe.ms.controller;

import com.sbe.ms.dto.ReadWriteTestDTO;
import com.sbe.ms.serivce.ReadWriteTestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.awt.*;
import java.util.List;

@RestController
@RequestMapping("/main-slave")
public class MainSlaveController {

    @Autowired
    private ReadWriteTestService readWriteTestService;

    @RequestMapping( value = "/findAll", method = RequestMethod.GET)
    public List<ReadWriteTestDTO> findAll(){
        return readWriteTestService.findAll();
    }

    @PostMapping(value = "/saveDto", produces = MediaType.APPLICATION_JSON_VALUE)
    public int saveDto(@RequestBody ReadWriteTestDTO dto){
        return readWriteTestService.saveDto(dto);
    }

}
