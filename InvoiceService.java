package com.rental;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InvoiceService {

    @Autowired
    private InvoiceRepository repository;

    public Invoice save(Invoice invoice) {
        return repository.save(invoice);
    }
    public List<Invoice> findAll() {
        return repository.findAll();
    }

    public Invoice update(Long id, Invoice updated) {
        return repository.findById(id).map(invoice -> {
            invoice.setBookingId(updated.getBookingId());
            invoice.setAmount(updated.getAmount());
            invoice.setInvoiceDate(updated.getInvoiceDate());
            return repository.save(invoice);
        }).orElse(null);
    }

    public boolean delete(Long id) {
        return repository.findById(id).map(invoice -> {
            repository.delete(invoice);
            return true;
        }).orElse(false);
    }
}

