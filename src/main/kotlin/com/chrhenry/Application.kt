@file:JvmName("ApplicationKt")

package com.chrhenry

import io.ktor.application.*
import io.ktor.http.content.*
import io.ktor.response.*
import io.ktor.routing.*

fun main(args: Array<String>): Unit = io.ktor.server.netty.EngineMain.main(args)

fun Application.processHtml(){
    routing {
        static("/"){
            defaultResource("index.html", "files")
        }
    }
}

fun Application.getController(){
    routing {
        get("/smoketest") {
            call.respondText("Smoke test")
        }
    }
}