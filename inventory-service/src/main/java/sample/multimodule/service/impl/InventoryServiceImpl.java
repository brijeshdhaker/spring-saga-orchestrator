/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample.multimodule.service.impl;

import org.springframework.stereotype.Service;
import sample.multimodule.dto.InventoryRequestDTO;
import sample.multimodule.dto.InventoryResponseDTO;
import sample.multimodule.enums.InventoryStatus;
import sample.multimodule.service.InventoryService;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author brijeshdhaker
 */
@Service
public class InventoryServiceImpl implements InventoryService {
    
    private Map<Integer, Integer> productInventoryMap;

    @PostConstruct
    private void init(){
        this.productInventoryMap = new HashMap<>();
        this.productInventoryMap.put(1, 5);
        this.productInventoryMap.put(2, 5);
        this.productInventoryMap.put(3, 5);
    }

    @Override
    public InventoryResponseDTO deductInventory(final InventoryRequestDTO requestDTO){
        int quantity = this.productInventoryMap.getOrDefault(requestDTO.getProductId(), 0);
        InventoryResponseDTO responseDTO = new InventoryResponseDTO();
        responseDTO.setOrderId(requestDTO.getOrderId());
        responseDTO.setUserId(requestDTO.getUserId());
        responseDTO.setProductId(requestDTO.getProductId());
        responseDTO.setStatus(InventoryStatus.UNAVAILABLE);
        if(quantity > 0){
            responseDTO.setStatus(InventoryStatus.AVAILABLE);
            this.productInventoryMap.put(requestDTO.getProductId(), quantity - 1);
        }
        return responseDTO;
    }

    @Override
    public void addInventory(final InventoryRequestDTO requestDTO){
        this.productInventoryMap.computeIfPresent(requestDTO.getProductId(), (k, v) -> v + 1);
    }
}
