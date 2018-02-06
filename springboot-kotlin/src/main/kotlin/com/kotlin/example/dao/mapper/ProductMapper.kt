package com.kotlin.example.dao.mapper

import com.kotlin.example.entity.Product
import org.apache.ibatis.annotations.Mapper
import org.apache.ibatis.annotations.Param
import org.apache.ibatis.annotations.Select

/**
 * @author blueriver
 * @description 产品Dao
 * @date 2018/2/6
 * @since 1.0
 */
@Mapper
interface ProductMapper {

    @Select("select code, name, create_time, update_time from t_product limit #{start}, #{size} ")
    fun list(@Param("start") start: Int, @Param("size") pageSize: Int): List<Product>?

    fun detail(@Param("productCode") productCode: String): Product?

    fun delete(@Param("productCode") productCode: String)

}