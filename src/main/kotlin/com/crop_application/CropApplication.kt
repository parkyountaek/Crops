package com.crop_application

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class CropApplication

fun main(args: Array<String>) {
	runApplication<CropApplication>(*args)
}
