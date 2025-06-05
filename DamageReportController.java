package com.rental;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/damage")
public class DamageReportController {

    @Autowired
    private DamageReportService service;

    @GetMapping
    public List<DamageReport> getAllReports() {
        return service.getAllReports();
    }

    @PostMapping
    public DamageReport create(@RequestBody DamageReport report) {
        return service.save(report);
    }

    @PutMapping("/{id}")
    public ResponseEntity<DamageReport> updateReport(@PathVariable Long id, @RequestBody DamageReport updatedReport) {
        DamageReport report = service.update(id, updatedReport);
        return report != null ? ResponseEntity.ok(report) : ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteReport(@PathVariable Long id) {
        return service.delete(id) ? ResponseEntity.noContent().build() : ResponseEntity.notFound().build();
    }
}