package com.crop.application

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.data.jpa.repository.config.EnableJpaAuditing

@EnableJpaAuditing
@SpringBootApplication
class CropApplication

fun main(args: Array<String>) {
    runApplication<CropApplication>(*args)
}
