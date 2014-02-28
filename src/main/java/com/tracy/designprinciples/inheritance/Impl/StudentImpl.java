/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.tracy.designprinciples.inheritance.Impl;

//Inheriting from interface SchoolMember

import com.tracy.designprinciples.inheritance.SchoolMember;


public class StudentImpl implements SchoolMember{
    
    private String name;
    private String surname;
    
    //inherited methods from SchoolMember Interface
    public String getName() {
        return name;
    }

    public void setName(String n) {
        this.name = n;    
    }
    
    //Concrete class methods
    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
    
    
    
    
}
