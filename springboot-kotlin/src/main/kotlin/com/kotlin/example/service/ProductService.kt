package com.kotlin.example.service

import com.kotlin.example.entity.Product

/**
 * @author blueriver
 * @description 产品服务
 * @date 2018/2/6
 * @since 1.0
 */

interface ProductService {

    /**
     * 产品列表
     */
    fun list(pageNo: Int = 1, pageSize: Int = 5): List<Product>?

    /**
     * 产品详情,可返回空值
     */
    fun detail(productCode: String): Product?

    /**
     * 删除产品
     */
    fun delete(productCode: String)
}