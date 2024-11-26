package com.eX2.X2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.eX2.X2.entity.Employee;


@Repository
public interface EmpRepo  extends JpaRepository<Employee, Integer>{

}
