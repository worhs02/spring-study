package org.example.domain.order.entity;

import jakarta.persistence.*;
import org.example.common.entity.BaseEntity;
import org.example.domain.member.entity.Member;
import org.example.domain.delivery.entity.Delivery;
import org.example.domain.order.enums.OrderStatus;
import org.example.domain.order_item.entity.OrderItem;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "oreders")
public class Order extends BaseEntity {

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "member_id")
    private Member member;

    @OneToMany(mappedBy = "order")
    private List<OrderItem> orderItems = new ArrayList<>();

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "delivery_id")
    private Delivery delivery;

    @Enumerated(EnumType.STRING)
    private OrderStatus status; //order, cancel
}
