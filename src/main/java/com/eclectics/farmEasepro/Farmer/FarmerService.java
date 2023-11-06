package com.eclectics.farmEasepro.Farmer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FarmerService {
    @Autowired
    private FarmerRepository farmerRepository;

}
