/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.tracy.designprinciples.srp.violation.Impl;

import com.tracy.designprinciples.srp.violation.Stude;


public class StudImpl implements Stude{
    
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

    public String generateStudentReport(String n, String sn, char grade, double mark) {
        return "Name: "+n+" Surname: "+sn+" Grade: "+grade+" Mark Obtained: "+mark+"\n"; 
    }
    
    
}
