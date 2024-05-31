package com.experiencef1.repository

import com.experiencef1.model.Driver

class DriverRepository {
    private val drivers = mutableListOf<Driver>()

    fun getAllDrivers(): List<Driver> = drivers

    fun getDriverById(id: String): Driver? = drivers.find { it.driverId == id }

    fun addDriver(driver: Driver) {
        drivers.add(driver)
    }

    fun updateDriver(id: String, updatedDriver: Driver): Boolean {
        val driverIndex = drivers.indexOfFirst { it.driverId == id }
        if (driverIndex != -1) {
            drivers[driverIndex] = updatedDriver
            return true
        }
        return false
    }

    fun deleteDriver(id: String): Boolean {
        return drivers.removeIf { it.driverId == id }
    }
}