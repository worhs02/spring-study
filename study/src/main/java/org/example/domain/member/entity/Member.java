package org.example.domain.member.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.example.common.entity.BaseEntity;
import org.example.common.embedded.Address;
import org.example.domain.order.entity.Order;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
public class Member extends BaseEntity {

    private String name;

    @Embedded
    private Address address;

    @OneToMany(mappedBy = "member") //Order 테이블에 있는 멤버에 매핑되었다는 걸 의미
    private List<Order> orders = new ArrayList<>();
}
