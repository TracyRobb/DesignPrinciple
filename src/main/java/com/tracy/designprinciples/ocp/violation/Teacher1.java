/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.tracy.designprinciples.ocp.violation;


/**
 *
 * @author student
 */
public class Teacher1{
    
    private String name;
    private String surname;

    public String getName() {
        return name;
    }

    public void setName(String n) {
       this.name = n;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurame(String sn) {
        this.surname = sn;
    }
    
}
