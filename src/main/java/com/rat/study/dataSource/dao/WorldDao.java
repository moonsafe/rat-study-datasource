package com.rat.study.dataSource.dao;

import com.rat.study.dataSource.entity.World;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (World)表数据库访问层
 *
 * @author makejava
 * @since 2020-02-09 15:37:25
 */
@Mapper
public interface WorldDao {

    /**
     * 通过ID查询单条数据
     *
     * @param  id
     * @return 实例对象
     */
    World queryById(Long id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<World> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param world 实例对象
     * @return 对象列表
     */
    List<World> queryAll(World world);

    /**
     * 新增数据
     *
     * @param world 实例对象
     * @return 影响行数
     */
    int insert(World world);

    /**
     * 修改数据
     *
     * @param world 实例对象
     * @return 影响行数
     */
    int update(World world);

    /**
     * 通过主键删除数据
     *
     * @param  id
     * @return 影响行数
     */
    int deleteById(Long id);

}