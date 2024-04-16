package com.jahir.poin_of_sale.service;

import com.jahir.poin_of_sale.repository.UnitRepository;
import com.jahir.poin_of_sale.model.product.Unit;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UnitService {

    private final UnitRepository unitRepository;

    public List<Unit> getUnits() {
        return unitRepository.findAll();
    }
}
