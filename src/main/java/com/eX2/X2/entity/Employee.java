package com.eX2.X2.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 * Entity class representing an Employee.
 * Mapped to the "EMP" table in the database.
 */
@Entity
@Table(name = "EMP")
public class Employee {

    // Primary key, auto-generated
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    // Employee details
    private String Name;
    private String Email;
    private String Phone;
    private String Department;

    /**
     * Default no-args constructor.
     */
    public Employee() {
        super();
    }

    /**
     * Gets the employee's name.
     *
     * @return the employee's name.
     */
    public String getName() {
        return Name;
    }

    /**
     * Sets the employee's name.
     *
     * @param name the name to set.
     */
    public void setName(String name) {
        Name = name;
    }

    /**
     * Gets the employee's ID.
     *
     * @return the employee's ID.
     */
    public int getId() {
        return id;
    }

    /**
     * Sets the employee's ID.
     *
     * @param id the ID to set.
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Gets the employee's email.
     *
     * @return the employee's email.
     */
    public String getEmail() {
        return Email;
    }

    /**
     * Sets the employee's email.
     *
     * @param email the email to set.
     */
    public void setEmail(String email) {
        Email = email;
    }

    /**
     * Gets the employee's phone number.
     *
     * @return the employee's phone number.
     */
    public String getPhone() {
        return Phone;
    }

    /**
     * Sets the employee's phone number.
     *
     * @param phone the phone number to set.
     */
    public void setPhone(String phone) {
        Phone = phone;
    }

    /**
     * Gets the employee's department.
     *
     * @return the employee's department.
     */
    public String getDepartment() {
        return Department;
    }

    /**
     * Sets the employee's department.
     *
     * @param department the department to set.
     */
    public void setDepartment(String department) {
        Department = department;
    }

    /**
     * Overrides the toString method to display employee details as a string.
     *
     * @return a string representation of the employee object.
     */
    @Override
    public String toString() {
        return "Employee [id=" + id + ", Name=" + Name + ", Email=" + Email 
                + ", Phone=" + Phone + ", Department=" + Department + "]";
    }
}
