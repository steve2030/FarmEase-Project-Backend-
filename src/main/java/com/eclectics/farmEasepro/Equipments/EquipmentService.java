package com.eclectics.farmEasepro.Equipments;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EquipmentService {
    @Autowired

    private EquipmentRepository equipmentRepository;

    public List<Equipment>getEquipments(){
        return equipmentRepository.findAll();

    }
}
