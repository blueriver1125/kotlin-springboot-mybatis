package com.kotlin.example.service

import com.kotlin.example.dao.mapper.ProductMapper
import com.kotlin.example.entity.Product
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

/**
 * @author blueriver
 * @description 产品服务实现
 * @date 2018/2/6
 * @since 1.0
 */
@Service("productService")
class ProductServiceImpl : ProductService {

    @Autowired
    lateinit var productMapper: ProductMapper

    override fun list(pageNo: Int, pageSize: Int): List<Product>? {
        // 这里暂时省略判断 pageNO 和 pageSize 合法性
        val startNumber = (pageNo - 1) * pageSize
        return productMapper.list(startNumber, pageSize)
    }

    override fun detail(productCode: String): Product? {
        if (productCode == null || productCode.trim() == "") {
            return null
        }
        return productMapper.detail(productCode)
    }

    override fun delete(productCode: String) {
        if (productCode == null || productCode.trim() == "") {
            return
        }
        productMapper.delete(productCode)
    }
}