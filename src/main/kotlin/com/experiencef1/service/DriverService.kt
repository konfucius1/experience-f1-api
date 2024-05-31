package com.experiencef1.service

import com.experiencef1.model.Driver
import com.experiencef1.repository.DriverRepository

class DriverService(private val driverRepository: DriverRepository) {

    fun getAllDrivers(): List<Driver> = driverRepository.getAllDrivers()

    fun getDriverById(id: String): Driver? = driverRepository.getDriverById(id)

    fun addDriver(driver: Driver) {
        driverRepository.addDriver(driver)
    }

    fun updateDriver(id: String, driver: Driver): Boolean = driverRepository.updateDriver(id, driver)

    fun deleteDriver(id: String): Boolean = driverRepository.deleteDriver(id)
}