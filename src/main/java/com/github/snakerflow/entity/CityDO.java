package com.github.snakerflow.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("city")
public class CityDO {
    private Long id;

    private Long provinceId;

    private String cityName;

    private String description;

}