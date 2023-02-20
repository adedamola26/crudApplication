/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import javax.swing.Icon;
import java.time.LocalDate;

/**
 *
 * @author adeda
 */
public class User {
    
    String name;
    LocalDate dt;
    static int id = 1;
    int empId;
    String age;
    String gender;
    String level;
    String cellNum;
    String email;
    Icon photo;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDt() {
        return dt;
    }

    public void setdt(LocalDate dt) {
        this.dt = dt;
    }
    
    public int getId() {
        return id;
    }

    public void setId() {
        this.id ++;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId() {
        this.empId = id;
//        setId();
    }
    public void setEmpId(int num) {
        this.empId = num;
    }
    
    public String getAge() {
        return age;
    }

    public void setAge(String age) {
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

    public String getCellNum() {
        return cellNum;
    }

    public void setCellNum(String cellNum) {
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

    @Override
    public String toString() {
        return name;
    }
    

}
