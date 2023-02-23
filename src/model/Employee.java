/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.time.LocalDate;
import javax.swing.Icon;

/**
 *
 * @author adeda
 */
public class Employee {
    
    private String name;
    private LocalDate startDate;
    private static int idCounter = 1;
    private int empId;
    private int age;
    private String gender;
    private String level;
    private Long cellNum;
    private String email;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public int getIdCounter() {
        return idCounter;
    }

    public void increaseIdCounter() {
        this.idCounter ++;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId() {
        this.empId = idCounter;
    }
    
    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public Long getCellNum() {
        return cellNum;
    }

    public void setCellNum(Long cellNum) {
        this.cellNum = cellNum;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Icon getPhoto() {
        return photo;
    }

    public void setPhoto(Icon photo) {
        this.photo = photo;
    }
    Icon photo;
    
    @Override
    public String toString() {
        return String.valueOf(empId);
    }
}
