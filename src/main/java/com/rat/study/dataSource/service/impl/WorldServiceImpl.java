package com.rat.study.dataSource.service.impl;

import com.rat.study.dataSource.entity.World;
import com.rat.study.dataSource.dao.WorldDao;
import com.rat.study.dataSource.service.WorldService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (World)表服务实现类
 *
 * @author makejava
 * @since 2020-02-09 15:37:26
 */
@Service("worldService")
public class WorldServiceImpl implements WorldService {
    @Resource
    private WorldDao worldDao;

    /**
     * 通过ID查询单条数据
     *
     * @param  id 主键
     * @return 实例对象
     */
    @Override
    public World queryById(Long id) {
        return this.worldDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<World> queryAllByLimit(int offset, int limit) {
        return this.worldDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param world 实例对象
     * @return 实例对象
     */
    @Override
    public World insert(World world) {
        this.worldDao.insert(world);
        return world;
    }

    /**
     * 修改数据
     *
     * @param world 实例对象
     * @return 实例对象
     */
    @Override
    public World update(World world) {
        this.worldDao.update(world);
        return this.queryById(world.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param  id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.worldDao.deleteById(id) > 0;
    }
}