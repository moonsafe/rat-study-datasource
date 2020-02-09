package com.rat.study.dataSource.controller;

import com.rat.study.dataSource.entity.World;
import com.rat.study.dataSource.service.WorldService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (World)表控制层
 *
 * @author makejava
 * @since 2020-02-09 15:37:26
 */
@RestController
@RequestMapping("world")
public class WorldController {
    /**
     * 服务对象
     */
    @Resource
    private WorldService worldService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public World selectOne(Long id) {
        return this.worldService.queryById(id);
    }

}