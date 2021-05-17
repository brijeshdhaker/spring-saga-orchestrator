/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample.multimodule.repository;

/**
 *
 * @author brijeshdhaker
 */

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sample.multimodule.domain.PurchaseOrderEntity;

@Repository
public interface PurchaseOrderRepository extends JpaRepository<PurchaseOrderEntity, String> {
    
}
