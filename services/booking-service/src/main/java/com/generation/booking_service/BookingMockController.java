package com.generation.booking_service;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
public class BookingMockController {

  @GetMapping("/bookings")
public ResponseEntity<List<Map<String, Object>>> getAllBookings() {
    List<Map<String, Object>> bookings = List.of(
        Map.of("bookingId", 99, "status", "NEW"),
        Map.of("bookingId", 100, "status", "CONFIRMED"),
        Map.of("bookingId", 101, "status", "CANCELLED")
    );

    return ResponseEntity.ok(bookings);
}

    @GetMapping("/bookings/{id}")
    public ResponseEntity<Map<String, Object>> getBooking(@PathVariable int id) {
        return ResponseEntity.ok(Map.of("bookingId", id, "status", "CONFIRMED"));
    }
}
