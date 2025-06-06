package com.generation.rolling_stock_service.utils;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class BookingService 
{

    @Autowired
    private RestTemplate restTemplate;
    @Autowired
    private RemoteServicesProperties urls;



    public List<BookingDto> getAllBookings()
    {
        String url = urls.getBooking()+"/bookings";//localhost:3003/booking-service/bookings
        //nel caso di una post, qui mettiamo il body
        // HttpEntity<Void> request = new HttpEntity<>(null);//request senza body

        //response che contiene come body una lista di BookingDto
        //passiamo come parametri l'url e come vogliamo convertire il body della response, in questo caso in un Array di DTO
        ResponseEntity<BookingDto[]> response = restTemplate.getForEntity(url,BookingDto[].class);

        //prendiamo solo il body della response e lo convertiamo in lista
        return List.of(response.getBody());
    }






    public record BookingDto
    (
        Long bookingId,
        String status
    ){}

}
