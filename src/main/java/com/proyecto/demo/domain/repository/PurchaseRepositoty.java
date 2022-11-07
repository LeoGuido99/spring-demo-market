package com.proyecto.demo.domain.repository;

import com.proyecto.demo.domain.Purchase;

import java.util.List;
import java.util.Optional;

public interface PurchaseRepositoty {
    List<Purchase> getAll();
    Optional<List<Purchase>> getByClient(String clientId);
    Purchase save(Purchase purchase);

}
