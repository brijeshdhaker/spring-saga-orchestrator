/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample.multimodule.service;

import sample.multimodule.domain.PurchaseOrderEntity;
import sample.multimodule.dto.OrchestratorRequestDTO;
import sample.multimodule.dto.OrderResponseDTO;
import sample.multimodule.dto.request.OrderRequestDTO;

import java.util.List;

/**
 *
 * @author brijeshdhaker
 */
public interface OrderService {
    
    PurchaseOrderEntity createOrder(OrderRequestDTO orderRequestDTO);

    List<OrderResponseDTO> getAll();

    OrchestratorRequestDTO getOrchestratorRequestDTO(OrderRequestDTO orderRequestDTO);
    
}
