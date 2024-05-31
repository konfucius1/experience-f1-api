package com.experiencef1.routes

import com.experiencef1.service.DriverService
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Route.driverRoutes(driverService: DriverService) {
    route("/drivers") {
        get {
            call.respond(driverService.getAllDrivers())
        }
    }
}