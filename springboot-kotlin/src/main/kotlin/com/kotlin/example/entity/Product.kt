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