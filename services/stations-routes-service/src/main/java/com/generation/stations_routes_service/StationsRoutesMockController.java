package com.generation.stations_routes_service;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
public class StationsRoutesMockController {

    @GetMapping("/stations")
    public ResponseEntity<List<Map<String, Object>>> getAllStations() {
        return ResponseEntity.ok(List.of(Map.of("id", 1, "code", "FIR")));
    }

    @GetMapping("/stations/{id}")
    public ResponseEntity<Map<String, Object>> getStationById(@PathVariable int id) {
        return ResponseEntity.ok(Map.of("id", id, "code", "FIR"));
    }

    @GetMapping("/routes")
    public ResponseEntity<List<Map<String, Object>>> getAllRoutes() {
        return ResponseEntity.ok(List.of(Map.of("id", 1, "from", "FIR", "to", "ROM")));
    }

    @GetMapping("/routes/{id}")
    public ResponseEntity<Map<String, Object>> getRouteById(@PathVariable int id) {
        return ResponseEntity.ok(Map.of("id", id, "from", "FIR", "to", "ROM"));
    }
}
