package com.eX2.X2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.eX2.X2.entity.Employee;
import com.eX2.X2.service.EmpService;

/**
 * Controller class for managing Employee-related operations.
 * Handles requests for displaying, adding, editing, updating, and deleting employees.
 */
@Controller
public class xcontroller {

    @Autowired
    private EmpService service; // Dependency Injection for Employee Service

    /**
     * Displays the home page with a list of all employees.
     *
     * @param m The model to hold the employee data for the view.
     * @return The name of the view (index.html).
     */
    @GetMapping("/")
    public String home(Model m) {
        List<Employee> employees = service.getAllEmp(); // Fetch all employees
        m.addAttribute("emp", employees); // Add employee list to the model
        return "index"; // Return the index page
    }

    

    /**
     * Displays the form to add a new employee.
     *
     * @return The name of the view (add_emp.html).
     */
    @GetMapping("add-emp")
    public String addEmpForm() {
        return "add_emp"; // Return the add employee form page
    }

    /**
     * Handles the registration of a new employee.
     *
     * @param e The Employee object populated from the form data.
     * @return A redirect to the home page.
     */
    @PostMapping("/register")
    public String empRegister(@ModelAttribute Employee e) {
        service.addEmp(e); // Add the new employee to the database
        return "redirect:/"; // Redirect to the home page
    }

    /**
     * Displays the edit form for a specific employee.
     *
     * @param id The ID of the employee to edit.
     * @param m  The model to hold the employee data for the view.
     * @return The name of the view (edit.html).
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable int id, Model m) {
        Employee e = service.getEmpById(id); // Fetch the employee by ID
        m.addAttribute("emp", e); // Add employee details to the model
        return "edit"; // Return the edit form page
    }

    /**
     * Handles the update of an employee's details.
     *
     * @param e The updated Employee object populated from the form data.
     * @return A redirect to the home page.
     */
    @PostMapping("/update")
    public String updateEmp(@ModelAttribute Employee e) {
        service.addEmp(e); // Update the employee details in the database
        return "redirect:/"; // Redirect to the home page
    }

    /**
     * Deletes a specific employee by their ID.
     *
     * @param id The ID of the employee to delete.
     * @return A redirect to the home page.
     */
    @GetMapping("/delete/{id}")
    public String deleteEmp(@PathVariable int id) {
        service.deleteEmp(id); // Delete the employee from the database
        return "redirect:/"; // Redirect to the home page
    }
}
