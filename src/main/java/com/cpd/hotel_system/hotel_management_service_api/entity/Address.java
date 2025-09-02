package com.cpd.hotel_system.hotel_management_service_api.entity;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
@Table(name = "address")
public class Address {
    @Id
    @Column(name = "address_id")
    private String addressId;

    @Column(name = "address" , nullable = false, length = 100)
    private String address;

    @Column(name = "city" , nullable = false , length = 50)
    private String city;

    @Column(name = "country" , nullable = false, length = 50)
    private String country;

    @Column(name = "longitude" , nullable = false, precision = 10, scale = 8)
    private BigDecimal longitude;

    @Column(name = "latitude" , nullable = false, precision = 10, scale = 8)
    private BigDecimal latitude;

    @OneToOne()
    @JoinColumn(name = "branch_id")
    private Branch branch;


}
