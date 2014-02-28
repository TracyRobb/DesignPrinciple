/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.tracy.designprinciples.srp.correction.Impl;

import com.tracy.designprinciples.srp.correction.Student1;


public class Student1Impl implements Student1{
    
    private String name;
    private String surname;
    

    public String getName() {
        return name;
    }

    public void setName(String n) {
        name = n;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String sn) {
        sn = surname;
    }
 
    
}
