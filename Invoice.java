package com.rental;
import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "invoice")
public class Invoice {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "bookingid")
    private Long bookingId;
    @Column(name = "amount")
    private double amount;
    @Column(name = "invoiceDate")
    private LocalDate invoiceDate;

    public Invoice() {
    }

    public Invoice(Long bookingId, double amount, LocalDate invoiceDate) {
        this.bookingId = bookingId;
        this.amount = amount;
        this.invoiceDate = invoiceDate;
    }

    public Invoice(Long id, Long bookingId, double amount, LocalDate invoiceDate) {
        this.id = id;
        this.bookingId = bookingId;
        this.amount = amount;
        this.invoiceDate = invoiceDate;
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

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public LocalDate getInvoiceDate() {
        return invoiceDate;
    }

    public void setInvoiceDate(LocalDate invoiceDate) {
        this.invoiceDate = invoiceDate;
    }
}
