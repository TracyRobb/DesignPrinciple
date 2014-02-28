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
public class Stud implements SchoolMem{
    
    private String name;
    private String surname;
    private double fees;
    
  

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

    //Method from Interface used in Student class to calculate fees
    public double payment(int classes) {
        
        //works out students fees
        
        fees = classes * 2500.00;
        return fees;
        
    }
    
}
