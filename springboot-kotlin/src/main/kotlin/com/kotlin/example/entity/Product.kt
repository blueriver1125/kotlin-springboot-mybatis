package com.kotlin.example.entity

import java.sql.Timestamp


/**
 * @author blueriver
 * @description 产品实体
 * @date 2018/2/6
 * @since 1.0
 */
data class Product constructor(val code: String, val name: String, val createTime: Timestamp, val updateTime: Timestamp) {

}

// 注意mybatis查询数据，然后封装实体的时候，构造方法这里有点儿坑，查询的字段必须与构造方法一直。