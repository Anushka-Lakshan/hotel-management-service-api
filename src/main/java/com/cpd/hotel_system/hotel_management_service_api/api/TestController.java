package com.cpd.hotel_system.hotel_management_service_api.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

//http://localhost:8081/hotel-management/api/v1/test/check

@RestController
@RequestMapping("/hotel-management/api/v1/test")
public class TestController {

    @GetMapping("/check")
    public String test() {
        return "Connected..!";
//        video 1.19
    }
}
