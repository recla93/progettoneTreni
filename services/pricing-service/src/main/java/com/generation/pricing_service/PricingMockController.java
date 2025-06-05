package com.generation.pricing_service;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
public class PricingMockController {

    @PostMapping("/pricing/quote")
    public ResponseEntity<Map<String, Object>> calculateQuote() {
        return ResponseEntity.ok(Map.of("currency", "EUR", "total", 72.40));
    }
}
