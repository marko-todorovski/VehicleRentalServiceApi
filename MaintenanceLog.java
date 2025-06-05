package com.rental;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "maintenance_log")
public class MaintenanceLog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "vehicleId")
    private Long vehicleId;

    @Column(name = "description")
    private String description;


    @Column(name = "maintenanceDate")
    private LocalDate maintenanceDate;

    public MaintenanceLog() {}


    public MaintenanceLog(Long id, Long vehicleId, String description, LocalDate maintenanceDate) {
        this.id = id;
        this.vehicleId = vehicleId;
        this.description = description;
        this.maintenanceDate = maintenanceDate;
    }
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(Long vehicleId) {
        this.vehicleId = vehicleId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getMaintenanceDate() {
        return maintenanceDate;
    }

    public void setMaintenanceDate(LocalDate maintenanceDate) {
        this.maintenanceDate = maintenanceDate;
    }
}
