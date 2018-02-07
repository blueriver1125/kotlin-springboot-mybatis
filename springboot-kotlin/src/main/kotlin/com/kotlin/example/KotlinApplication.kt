package com.kotlin.example

import org.mybatis.spring.annotation.MapperScan
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.data.mongo.MongoDataAutoConfiguration
import org.springframework.boot.autoconfigure.data.mongo.MongoRepositoriesAutoConfiguration
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration

/**
 * 启动类
 */
@MapperScan("com.kotlin.example.dao.mapper")
@SpringBootApplication(
        scanBasePackages = arrayOf("com.kotlin.example"),
        exclude = arrayOf(MongoAutoConfiguration::class,
                MongoDataAutoConfiguration::class,
                MongoRepositoriesAutoConfiguration::class))
class KotlinApplication

fun main(args: Array<String>) {

    SpringApplication.run(KotlinApplication::class.java, *args)
}