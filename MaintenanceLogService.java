package com.rental;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MaintenanceLogService {

    @Autowired
    private MaintenanceLogRepository repository;

    public MaintenanceLog save(MaintenanceLog log) {
        return repository.save(log);
    }

    public List<MaintenanceLog> findAll() {
        return repository.findAll();
    }

    public MaintenanceLog update(Long id, MaintenanceLog log) {
        return repository.findById(id)
                .map(existing -> {
                    existing.setVehicleId(log.getVehicleId());
                    existing.setDescription(log.getDescription());
                    existing.setMaintenanceDate(log.getMaintenanceDate());
                    return repository.save(existing);
                }).orElse(null);
    }

    public boolean delete(Long id) {
        return repository.findById(id)
                .map(log -> {
                    repository.delete(log);
                    return true;
                }).orElse(false);
    }
}