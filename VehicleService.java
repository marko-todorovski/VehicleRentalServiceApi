package com.rental;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VehicleService {

    @Autowired
    private VehicleRepository vehicleRepository;

    public List<Vehicle> getAllVehicles() {
        return vehicleRepository.findAll();
    }

    public Vehicle saveVehicle(Vehicle vehicle) {
        return vehicleRepository.save(vehicle);
    }
    public VehicleService(VehicleRepository vehicleRepository) {
        this.vehicleRepository = vehicleRepository;
    }



    public Vehicle updateVehicle(Long id, Vehicle vehicle) {
        return vehicleRepository.findById(id)
                .map(existingVehicle -> {
                    existingVehicle.setBrand(vehicle.getBrand());
                    existingVehicle.setModel(vehicle.getModel());
                    existingVehicle.setManufactureyear(vehicle.getManufactureyear());
                    existingVehicle.setType(vehicle.getType());
                    return vehicleRepository.save(existingVehicle);
                })
                .orElse(null);
    }

    public boolean deleteVehicle(Long id) {
        return vehicleRepository.findById(id)
                .map(vehicle -> {
                    vehicleRepository.delete(vehicle);
                    return true;
                })
                .orElse(false);
    }
}
