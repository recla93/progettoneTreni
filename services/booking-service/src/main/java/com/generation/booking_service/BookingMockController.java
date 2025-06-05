package com.generation.booking_service;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
public class BookingMockController {

    @PostMapping("/bookings")
    public ResponseEntity<Map<String, Object>> createBooking() {
        return new ResponseEntity<>(Map.of("bookingId", 99, "status", "NEW"), HttpStatus.CREATED);
    }

    @GetMapping("/bookings/{id}")
    public ResponseEntity<Map<String, Object>> getBooking(@PathVariable int id) {
        return ResponseEntity.ok(Map.of("bookingId", id, "status", "CONFIRMED"));
    }
}
