package com.generation.timetable_service;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
public class TimetableMockController {

    @GetMapping("/trips/search")
    public ResponseEntity<List<Map<String, Object>>> searchTrips() {
        return ResponseEntity.ok(List.of(Map.of("tripId", 77)));
    }

    @GetMapping("/trips/{id}")
    public ResponseEntity<Map<String, Object>> getTripById(@PathVariable int id) {
        return ResponseEntity.ok(Map.of("tripId", id, "from", "FIR", "to", "ROM"));
    }
}
