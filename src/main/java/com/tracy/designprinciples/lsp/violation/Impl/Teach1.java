/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.tracy.designprinciples.lsp.violation.Impl;

import com.tracy.designprinciples.lsp.violation.SchoolMemb1;

/**
 *
 * @author student
 */
public class Teach1 implements SchoolMemb1{

    private String name;
    private String surname;
    private String staffNum;
    
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

    public void setStaffNumber(String tn) {
        this.staffNum = tn;
        
    }

    public String getStaffNumber() {
        return staffNum;
    }
    
}
