/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author adeda
 */
public class EmployeeDirectory {
    
    private ArrayList<User> allUsers;

    public EmployeeDirectory() {
        this.allUsers = new ArrayList<>();
    }

    public ArrayList<User> getAllUsers() {
        return allUsers;
    }

    public void setAllUsers(ArrayList<User> allUsers) {
        this.allUsers = allUsers;
    }
    
    public void addUser(User aUser){
        this.allUsers.add(aUser);
    }
    public void removeUser(User aUser){
        this.allUsers.remove(aUser);
    }

//    @Override
//    public String toString() {
//        return "UserDirectory{" + "allUsers=" + allUsers + '}';
//    }
}
