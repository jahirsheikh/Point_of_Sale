package com.jahir.poin_of_sale.controller;

import com.jahir.poin_of_sale.dto.StockSearchDTO;
import lombok.Builder;

@Builder
public record StockSearchParentDTO(
        StockSearchDTO stock,
        int page,
        int size
) {
}
