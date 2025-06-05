package com.rental;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DamageReportService {

    @Autowired
    private DamageReportRepository repository;


    public DamageReport save(DamageReport report) {
        return repository.save(report);
    }
    public List<DamageReport> getAllReports() {
        return repository.findAll();
    }


    public DamageReport update(Long id, DamageReport updated) {
        return repository.findById(id).map(report -> {
            report.setBookingId(updated.getBookingId());
            report.setDescription(updated.getDescription());
            report.setEstimatedCost(updated.getEstimatedCost());
            return repository.save(report);
        }).orElse(null);
    }

    public boolean delete(Long id) {
        return repository.findById(id).map(report -> {
            repository.delete(report);
            return true;
        }).orElse(false);
    }
}