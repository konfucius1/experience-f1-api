package com.experiencef1.routes

import com.experiencef1.repository.DriverRepository
import com.experiencef1.service.DriverService
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Application.configureRouting() {
    val driverRepository = DriverRepository()
    val driverService = DriverService(driverRepository)

    routing {
        get("/") {
            call.respondText("Experience F1!")
        }

        driverRoutes(driverService)
    }
}
