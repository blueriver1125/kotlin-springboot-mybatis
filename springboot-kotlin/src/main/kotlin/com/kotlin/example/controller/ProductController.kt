package com.kotlin.example.controller

import com.kotlin.example.entity.Product
import com.kotlin.example.service.ProductService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.*

/**
 * @author blueriver
 * @description 产品
 * @date 2018/2/6
 * @since 1.0
 */

//@RestController
@Controller
@RequestMapping("/product")
class ProductController {

    // 产品列表分页大小
    val PRODUCT_PAGE_SIZE: Int = 5

    // 产品service
    @Autowired
    private lateinit var productService: ProductService

    /**
     * 返回json
     */
    @PostMapping("/list.html")
    @ResponseBody
    fun list(@RequestParam(value = "page") pageNo: Int): List<Product>? {
        println("page ${pageNo}")

        return productService.list(pageNo, PRODUCT_PAGE_SIZE)
    }

    /**
     * 返回html页面
     */
    @GetMapping("/detail.html")
    fun detail(@RequestParam(value = "productCode") productCode: String, model: Model): String {
        model.addAttribute("product", productService.detail(productCode))
        return "/product/detail"
    }
}