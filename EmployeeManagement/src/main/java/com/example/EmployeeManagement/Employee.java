package com.example.EmployeeManagement;


import jakarta.persistence.*;



@Entity
@Table(name="Employee_table")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    int id;
    String name;
    String designation;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }
}
