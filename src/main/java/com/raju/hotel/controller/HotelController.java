package com.raju.hotel.controller;

import com.raju.hotel.entities.Hotel;
import com.raju.hotel.services.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/hotels")
public class HotelController {

    @Autowired
    HotelService hotelService;

    //Create User
    @PostMapping("/createHotel")
    public ResponseEntity<Hotel> createUser(@RequestBody Hotel hotel){
      Hotel hotel1=hotelService.saveHotel(hotel);
      return ResponseEntity.status(HttpStatus.CREATED).body(hotel1);
    }

    //Get All Hotel
    @GetMapping("/getAllHotel")
    public ResponseEntity<List<Hotel>> getAllHotel(){
        List<Hotel> user1=hotelService.getAllHotel();
        return ResponseEntity.status(HttpStatus.OK).body(user1);
    }

    //Get Single Hotel
    @GetMapping("/getSingleHotel/{id}")
    public ResponseEntity<Hotel> getSingleHotel(@PathVariable(name = "id") String id ){
        Hotel user1=hotelService.gerHotel(id);
        return ResponseEntity.status(HttpStatus.OK).body(user1);
    }
}
