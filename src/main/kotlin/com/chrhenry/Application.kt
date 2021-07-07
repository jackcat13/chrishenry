@file:JvmName("ApplicationKt")

package com.chrhenry

import io.ktor.application.*
import io.ktor.http.content.*
import io.ktor.response.*
import io.ktor.routing.*

fun main(args: Array<String>): Unit = io.ktor.server.netty.EngineMain.main(args)

@Suppress("unused")
@kotlin.jvm.JvmOverloads
fun Application.processHtml(testing: Boolean = false){
    routing {
        static("/"){
            defaultResource("index.html", "files")
            files("src/main/resources/files/style")
            files("src/main/resources/files/js")
        }
    }
}

@Suppress("unused")
@kotlin.jvm.JvmOverloads
fun Application.getController(testing: Boolean = false){
    routing {
        get("/smoketest") {
            call.respondText("Smoke test")
        }
    }
}