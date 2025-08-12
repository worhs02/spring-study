package org.example.domain.delivery.entity;


import jakarta.persistence.*;
import org.example.common.entity.BaseEntity;
import org.example.common.embedded.Address;
import org.example.domain.delivery.enums.DeliveryStatus;
import org.example.domain.order.entity.Order;

@Entity
public class Delivery extends BaseEntity {
    @OneToOne(mappedBy = "delivery")
    private Order order;

    @Embedded
    private Address address;

    @Enumerated(EnumType.STRING)
    private DeliveryStatus status;
}
