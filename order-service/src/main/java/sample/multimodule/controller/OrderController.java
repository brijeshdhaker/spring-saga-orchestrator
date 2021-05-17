/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample.multimodule.controller;

/**
 *
 * @author brijeshdhaker
 */

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;
import sample.multimodule.domain.PurchaseOrderEntity;
import sample.multimodule.dto.OrderResponseDTO;
import sample.multimodule.dto.request.OrderRequestDTO;
import sample.multimodule.service.OrderService;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("api/order")
public class OrderController {

    private static final Logger log = LoggerFactory.getLogger(OrderController.class);
    
    @Autowired
    @Qualifier("orderService")
    private OrderService orderService;

    @PostMapping("/create")
    public PurchaseOrderEntity createOrder(@RequestBody OrderRequestDTO requestDTO){
        requestDTO.setOrderId(UUID.randomUUID());
        log.info("Order Request Received @OrderController ...");
        return this.orderService.createOrder(requestDTO);
    }

    @GetMapping("/all")
    public List<OrderResponseDTO> getOrders(){
        return this.orderService.getAll();
    }

}