package com.generation.rolling_stock_service.utils;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "remote.services")
public class RemoteServicesProperties {
    private String stationsRoutes;
    private String timetable;
    private String pricing;
    private String booking;
    
    public String getStationsRoutes() {
        return stationsRoutes;
    }
    public void setStationsRoutes(String stationsRoutes) {
        this.stationsRoutes = stationsRoutes;
    }
    public String getTimetable() {
        return timetable;
    }
    public void setTimetable(String timetable) {
        this.timetable = timetable;
    }
    public String getPricing() {
        return pricing;
    }
    public void setPricing(String pricing) {
        this.pricing = pricing;
    }
    public String getBooking() {
        return booking;
    }
    public void setBooking(String booking) {
        this.booking = booking;
    }


    
}