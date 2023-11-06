package com.eclectics.farmEasepro.Farmer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FarmerService {
    @Autowired
    private FarmerRepository farmerRepository;


    // Post Method
    public List<Farmer>getFarmers(){
        return farmerRepository.findAll();
    }

}
