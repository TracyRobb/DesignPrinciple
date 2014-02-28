/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.tracy.designprinciples.polymorphism.Impl;

import com.tracy.designprinciples.polymorphism.SchoolMem;

/**
 *
 * @author student
 */
public class Teacher implements SchoolMem{
    
    private String name;
    private String surname;
    private double salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    //Method from Interface used in Teacher class to calculate salary
    public double payment(int classes) {
        
        //works out teachers salary
        
        salary =  classes * 850.00 * 1.5;
        return salary;
    }
    
}
