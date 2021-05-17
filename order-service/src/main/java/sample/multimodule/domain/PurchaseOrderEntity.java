/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample.multimodule.domain;

import lombok.Data;
import lombok.ToString;
import sample.multimodule.enums.OrderStatus;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author brijeshdhaker
 */
@Data
@Entity
@ToString
@Table(name = "PURCHASE_ORDER")
public class PurchaseOrderEntity {

    @Id
    @Column(name= "ID", updatable = false, nullable = false)
    private String id;
    
    @Column(name= "USERID")
    private Integer userId;
    
    @Column(name= "PRODUCT_ID")
    private Integer productId;
    
    @Column(name= "PRICE")
    private Double price;
    
    @Column(name= "STATUS")
    private OrderStatus status;

}
