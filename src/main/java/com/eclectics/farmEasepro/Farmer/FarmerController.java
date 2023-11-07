package com.eclectics.farmEasepro.Farmer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class FarmerController {
@Autowired
private FarmerService farmerService;
    @GetMapping(path = "/api/v1/farmers")
    public List<Farmer>getFarmers(){
        return farmerService.getFarmers();
    }
}
