package com.cpd.hotel_system.hotel_management_service_api.entity;

import jakarta.persistence.*;

@Entity
@Table(name="facility")
public class Facility {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)  //auto create the id
    private long id;

    @Column(length = 100,nullable = false,name = "name")
    private String name;

    //Mapping the relationship between tables(Entity)

    @ManyToOne()
    @JoinColumn(name = "room_id")
    private Room room;
}
