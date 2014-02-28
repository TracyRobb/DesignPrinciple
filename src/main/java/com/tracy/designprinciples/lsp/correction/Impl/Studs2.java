/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.tracy.designprinciples.lsp.correction.Impl;

import com.tracy.designprinciples.lsp.correction.SchoolMemb2;

/**
 *
 * @author student
 */

//Student does not support staff number because it is not a staff member
//but student wiil still inherit this useless method

public class Studs2 implements SchoolMemb2{

    private String name;
    private String surname;
    
    public void setName(String n) {
        this.name = n;
    }

    public String getName() {
        return name;
    }

    public void setSurname(String sn) {
         this.surname = sn;
    }

    public String getSurname() {
        return surname;
    }
    
}
