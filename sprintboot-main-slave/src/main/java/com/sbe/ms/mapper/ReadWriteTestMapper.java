package com.sbe.ms.mapper;


import com.sbe.ms.dto.ReadWriteTestDTO;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface ReadWriteTestMapper {

    /**
     *  查询所有数据，从slave中取数据
     * @return 一个集合对象
     */
    public List<ReadWriteTestDTO> findAll();

    /**
     * 添加一个数据，针对 main数据源
     * @param dto 对象
     * @return 影响行数
     */
    public int saveDto(ReadWriteTestDTO dto);
}
