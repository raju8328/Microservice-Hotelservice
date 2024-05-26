package com.raju.hotel.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Builder
@Table(name="hotels")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Hotel {
    @Id
    @Column(name="ID")
    private String hotelId;
    @Column(name="hotel_name")
    private String hotelName;
    @Column(name="ABOUT")
    private String about;
    @Column(name="LOCATION")
    private String location;

}
