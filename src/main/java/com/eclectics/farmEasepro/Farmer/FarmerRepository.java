package com.eclectics.farmEasepro.Farmer;

import jakarta.persistence.Id;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public class FarmerRepository extends JpaRepository<Long, Id> {
}
