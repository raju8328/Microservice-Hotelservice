package com.raju.hotel.services;

import com.raju.hotel.entities.Hotel;
import java.util.List;

public interface HotelService {

    //Create Hotel
    Hotel saveHotel(Hotel hotel);

    //Get All Hotels
    List<Hotel> getAllHotel();

    //Get Single User of given UserId
    Hotel gerHotel(String userId);

    //
}
