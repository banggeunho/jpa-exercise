package org.delivery;

import javax.persistence.*;

@Entity
public class Delivery {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne(mappedBy = "delivery")
    private Order order;
    private String city;
    private String street;
    private String zipcode;
    @Enumerated(EnumType.STRING)
    private DailyStatus status;
}
