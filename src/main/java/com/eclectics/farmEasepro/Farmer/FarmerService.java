package com.eclectics.farmEasepro.Farmer;

import jakarta.persistence.Id;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FarmerService {
    @Autowired
    private FarmerRepository farmerRepository;


    // Post Method
    public List<Farmer>getFarmers(){
        List<Farmer> farmers = farmerRepository.findAll();

        return farmers;
    }






}
