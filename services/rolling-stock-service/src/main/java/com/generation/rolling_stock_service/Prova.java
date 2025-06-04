package com.generation.rolling_stock_service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Prova {

    @GetMapping("/trains")
    public String a()
    {
        return "ciufciuf";
    }

       @GetMapping("/pippo")
    public String aaaa()
    {
        return "aiaiaiia";
    }

       @GetMapping("/paperino")
    public String qua()
    {
        return "quaqua";
    }
}
