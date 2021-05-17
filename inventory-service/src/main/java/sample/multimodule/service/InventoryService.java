/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample.multimodule.service;

import sample.multimodule.dto.InventoryRequestDTO;
import sample.multimodule.dto.InventoryResponseDTO;

/**
 *
 * @author brijeshdhaker
 */
public interface InventoryService {
    
    void addInventory(final InventoryRequestDTO requestDTO);

    InventoryResponseDTO deductInventory(final InventoryRequestDTO requestDTO);
    
}
