package com.order.services.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="order")
public class OrderEntity {

    @Id
    @GeneratedValue
    private Integer orderId;
    private String orderName;
    private String orderDescription;
}
