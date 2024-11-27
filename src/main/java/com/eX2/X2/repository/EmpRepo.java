package com.eX2.X2.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.eX2.X2.entity.Employee;

/**
 * Repository interface for the Employee entity.
 * Extends JpaRepository to provide CRUD operations for Employee entities.
 */
@Repository
public interface EmpRepo extends JpaRepository<Employee, Integer> {
    // JpaRepository provides default CRUD methods like save(), findById(), findAll(), etc.
    
}
