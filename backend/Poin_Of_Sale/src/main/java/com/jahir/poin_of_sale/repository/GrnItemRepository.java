package com.jahir.poin_of_sale.repository;

import com.jahir.poin_of_sale.model.grn.GrnItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GrnItemRepository extends JpaRepository<GrnItem, Long> {
}
