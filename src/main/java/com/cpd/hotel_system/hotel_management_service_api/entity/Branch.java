package com.cpd.hotel_system.hotel_management_service_api.entity;


import com.cpd.hotel_system.hotel_management_service_api.enums.BranchType;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "branch")
public class Branch {

    @Id
    @Column(name = "branch_id")
    private String branchId;

    @Column(name = "room_count", nullable = false)
    private int roomCount;

    @Enumerated(EnumType.STRING)
    @Column(name = "branch_type", nullable = false)
    private BranchType branchType;

    @Column(name = "branch_name", nullable = false)
    private String branchName;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinTable(name = "hotel_id")
    private Hotel hotel;

    @OneToMany()
    private List<Room> rooms;

    @OneToOne(mappedBy = "branch")
    private Address address;
}
