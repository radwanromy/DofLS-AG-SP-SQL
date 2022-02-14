package com.example.DrawerAllocation.Repository;

import com.example.DrawerAllocation.Entity.CustomerReleaseEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerReleaseRepository extends JpaRepository<CustomerReleaseEntity,Long> {
}
