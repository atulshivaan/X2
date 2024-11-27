package com.eX2.X2.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eX2.X2.entity.Employee;
import com.eX2.X2.repository.EmpRepo;

/**
 * Service class for handling business logic related to Employee operations.
 * This class acts as an intermediary between the controller and the repository layer.
 */
@Service
public class EmpService {
    
    @Autowired
    private EmpRepo repo;

    /**
     * Add a new employee to the repository.
     * 
     * @param e the employee to be added
     */
    public void addEmp(Employee e) {
        repo.save(e);
    }

    /**
     * Get a list of all employees.
     * 
     * @return a list of all employees
     */
    public List<Employee> getAllEmp() {
        return repo.findAll();
    }

    /**
     * Get an employee by their ID.
     * 
     * @param id the ID of the employee to be retrieved
     * @return the employee with the specified ID, or null if not found
     */
    public Employee getEmpById(int id) {
        return repo.findById(id).orElse(null); 
    }


    /**
     * Get an employee by their ID (Alternative method).
     * This method uses Optional to handle null values.
     * 
     * @param id the ID of the employee to be retrieved
     * @return the employee with the specified ID, or null if not found
     */
    public Employee getEmpbyId(int id) {
        Optional<Employee> e = repo.findById(id);
        return e.orElse(null);
    }

    /**
     * Delete an employee by their ID.
     * 
     * @param id the ID of the employee to be deleted
     */
    public void deleteEmp(int id) {
        repo.deleteById(id);
    }
}
