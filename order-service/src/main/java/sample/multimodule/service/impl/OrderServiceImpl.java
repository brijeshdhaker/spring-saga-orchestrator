/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample.multimodule.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.FluxSink;
import sample.multimodule.domain.PurchaseOrderEntity;
import sample.multimodule.dto.OrchestratorRequestDTO;
import sample.multimodule.dto.OrderResponseDTO;
import sample.multimodule.dto.request.OrderRequestDTO;
import sample.multimodule.enums.OrderStatus;
import sample.multimodule.repository.PurchaseOrderRepository;
import sample.multimodule.service.OrderService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.stream.Collectors;

/**
 *
 * @author brijeshdhaker
 */
@Service("orderService")
public class OrderServiceImpl implements OrderService {
    
    private static final Logger log = LoggerFactory.getLogger(OrderServiceImpl.class);
    
    // product price map
    private static Map<Integer, Double> PRODUCT_PRICE =  new HashMap<>();
    
    static{
        PRODUCT_PRICE.put(1, 100d);
        PRODUCT_PRICE.put(2, 200d);
        PRODUCT_PRICE.put(3, 300d);
    }
    
    @Autowired
    private PurchaseOrderRepository purchaseOrderRepository;

    @Autowired
    private FluxSink<OrchestratorRequestDTO> sink;

    @Override
    public PurchaseOrderEntity createOrder(OrderRequestDTO orderRequestDTO){
        PurchaseOrderEntity purchaseOrder = this.purchaseOrderRepository.save(this.dtoToEntity(orderRequestDTO));
        System.out.println("Order Request Saved to  purchaseOrderRepository @OrderServiceImpl ...");
        log.info("Order Request Saved to  purchaseOrderRepository @OrderServiceImpl ...");
        this.sink.next(this.getOrchestratorRequestDTO(orderRequestDTO));
        System.out.println("Order Request pushed to  kafka stream @OrderServiceImpl ...");
        log.info("Order Request pushed to  kafka stream @OrderServiceImpl ...");
        return purchaseOrder;
    }

    @Override
    public List<OrderResponseDTO> getAll() {
        return this.purchaseOrderRepository.findAll()
                .stream()
                .map(this::entityToDto)
                .collect(Collectors.toList());
    }

    private PurchaseOrderEntity dtoToEntity(final OrderRequestDTO dto){
        PurchaseOrderEntity purchaseOrder = new PurchaseOrderEntity();
        purchaseOrder.setId(dto.getOrderId().toString());
        purchaseOrder.setProductId(dto.getProductId());
        purchaseOrder.setUserId(dto.getUserId());
        purchaseOrder.setStatus(OrderStatus.ORDER_CREATED);
        purchaseOrder.setPrice(PRODUCT_PRICE.get(dto.getProductId()));
        return purchaseOrder;
    }

    private OrderResponseDTO entityToDto(final PurchaseOrderEntity purchaseOrder){
        OrderResponseDTO dto = new OrderResponseDTO();
        dto.setOrderId(UUID.fromString(purchaseOrder.getId()));
        dto.setProductId(purchaseOrder.getProductId());
        dto.setUserId(purchaseOrder.getUserId());
        dto.setStatus(purchaseOrder.getStatus());
        dto.setAmount(purchaseOrder.getPrice());
        return dto;
    }

    @Override
    public OrchestratorRequestDTO getOrchestratorRequestDTO(OrderRequestDTO orderRequestDTO){
        OrchestratorRequestDTO requestDTO = new OrchestratorRequestDTO();
        requestDTO.setUserId(orderRequestDTO.getUserId());
        requestDTO.setAmount(PRODUCT_PRICE.get(orderRequestDTO.getProductId()));
        requestDTO.setOrderId(orderRequestDTO.getOrderId().toString());
        requestDTO.setProductId(orderRequestDTO.getProductId());
        return requestDTO;
    }
}
