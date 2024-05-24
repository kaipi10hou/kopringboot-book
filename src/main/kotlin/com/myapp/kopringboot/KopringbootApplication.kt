package com.myapp.kopringboot

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KopringbootApplication

fun main(args: Array<String>) {
    runApplication<KopringbootApplication>(*args)
}
