package com.jahir.poin_of_sale.dto;

import java.time.LocalDateTime;

public record SearchGrnInvoiceDTO(int page, int size, LocalDateTime startDate, LocalDateTime endDate) {
}
