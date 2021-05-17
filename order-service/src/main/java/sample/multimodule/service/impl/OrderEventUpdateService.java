/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample.multimodule.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sample.multimodule.dto.OrchestratorResponseDTO;
import sample.multimodule.repository.PurchaseOrderRepository;

import javax.transaction.Transactional;

/**
 *
 * @author brijeshdhaker
 */
@Service
public class OrderEventUpdateService {
    
    @Autowired
    private PurchaseOrderRepository repository;

    @Transactional
    public void updateOrder(final OrchestratorResponseDTO responseDTO){
        this.repository
                .findById(responseDTO.getOrderId())
                .ifPresent(po -> {
                    po.setStatus(responseDTO.getStatus());
                    this.repository.save(po);
                });
    }
}
