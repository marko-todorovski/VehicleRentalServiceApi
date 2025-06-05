package com.rental;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "damagereport")
public class DamageReport {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "bookingId")
    private Long bookingId;
    @Column(name = "descriptipn")
    private String description;
    @Column(name = "estimatedCost")
    private double estimatedCost;
    @Column(name = "reportDate")
    private LocalDate reportDate;


    public DamageReport() {
    }

    public DamageReport(Long bookingId, String description, double estimatedCost, LocalDate reportDate) {
        this.bookingId = bookingId;
        this.description = description;
        this.estimatedCost = estimatedCost;
        this.reportDate = reportDate;
    }

    public DamageReport(Long id, Long bookingId, String description, double estimatedCost, LocalDate reportDate) {
        this.id = id;
        this.bookingId = bookingId;
        this.description = description;
        this.estimatedCost = estimatedCost;
        this.reportDate = reportDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getBookingId() {
        return bookingId;
    }

    public void setBookingId(Long bookingId) {
        this.bookingId = bookingId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getEstimatedCost() {
        return estimatedCost;
    }

    public void setEstimatedCost(double estimatedCost) {
        this.estimatedCost = estimatedCost;
    }

    public LocalDate getReportDate() {
        return reportDate;
    }

    public void setReportDate(LocalDate reportDate) {
        this.reportDate = reportDate;
    }
}
