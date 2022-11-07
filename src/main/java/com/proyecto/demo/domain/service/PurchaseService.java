package com.proyecto.demo.domain.service;

import com.proyecto.demo.domain.Purchase;
import com.proyecto.demo.domain.repository.PurchaseRepositoty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PurchaseService {
    @Autowired
    private PurchaseRepositoty purchaseRepositoty;

    public List<Purchase> getAll() {
        return purchaseRepositoty.getAll();
    }

    public Optional<List<Purchase>> getByClient(String clientId) {
        return purchaseRepositoty.getByClient(clientId);
    }

    public Purchase save(Purchase purchase) {
        return purchaseRepositoty.save(purchase);
    }

}
