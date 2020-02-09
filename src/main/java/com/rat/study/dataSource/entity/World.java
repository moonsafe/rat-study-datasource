package com.rat.study.dataSource.entity;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * (World)实体类
 *
 * @author makejava
 * @since 2020-02-09 15:37:25
 */
public class World implements Serializable {
    private static final long serialVersionUID = 305478424278741295L;

    @Getter
    @Setter
    private Long id;

    @Getter
    @Setter
    private String name;

    @Getter
    @Setter
    private String continent;

    @Getter
    @Setter
    private Integer area;

    @Getter
    @Setter
    private Integer population;

    @Getter
    @Setter
    private Integer gdp;

}