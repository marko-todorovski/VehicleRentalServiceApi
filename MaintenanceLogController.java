package com.rental;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/maintenance")
public class MaintenanceLogController {

    @Autowired
    private MaintenanceLogService service;

    @PostMapping
    public MaintenanceLog create(@RequestBody MaintenanceLog log) {
        return service.save(log);
    }

    @GetMapping
    public List<MaintenanceLog> getAllLogs() {
        return service.findAll();
    }

    @PutMapping("/{id}")
    public ResponseEntity<MaintenanceLog> updateLog(@PathVariable Long id, @RequestBody MaintenanceLog updatedLog) {
        MaintenanceLog log = service.update(id, updatedLog);
        return log != null ? ResponseEntity.ok(log) : ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteLog(@PathVariable Long id) {
        return service.delete(id) ? ResponseEntity.noContent().build() : ResponseEntity.notFound().build();
    }
}
