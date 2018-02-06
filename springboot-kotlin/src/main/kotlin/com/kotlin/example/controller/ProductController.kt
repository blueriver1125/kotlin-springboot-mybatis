package com.kotlin.example.controller

import com.kotlin.example.service.ProductService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

/**
 * @author blueriver
 * @description 产品
 * @date 2018/2/6
 * @since 1.0
 */

@RestController
@RequestMapping("/product")
class ProductController {

    // 产品列表分页大小
    val PRODUCT_PAGE_SIZE: Int = 5

    // 产品service
    @Autowired
    private lateinit var productService: ProductService

    /**
     * 列表 
     */
    @PostMapping("/list.html")
    fun list(@RequestParam(value = "page") pageNo: Int): String {
        println("page ${pageNo}")

        return productService.list(pageNo, PRODUCT_PAGE_SIZE).toString()
    }

    /**
     * 详情
     */
    @PostMapping("/detail.html")
    fun detail(@RequestParam(value = "productCode") productCode: String): String {

        return productService.detail(productCode).toString()
    }
}