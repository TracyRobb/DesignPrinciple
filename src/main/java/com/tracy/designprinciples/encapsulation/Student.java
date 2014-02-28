/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.tracy.designprinciples.encapsulation;


public class Student {
    
    private String Name;
    private String Surname;
    private double endMark;

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getSurname() {
        return Surname;
    }

    public void setSurname(String Surname) {
        this.Surname = Surname;
    }

    public double getEndMark() {
        return endMark;
    }

    public void setEndMark(double endMark) {
        this.endMark = endMark;
    }
    
    

   
    
    
    
}
