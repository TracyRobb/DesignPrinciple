/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.tracy.designprinciples.srp.violation;

/**
 *
 * @author student
 */

//Contains two responsibilities student data and generating student report
public interface Stude {
    
    public String getName();
    public void setName(String n);
    public String getSurname();
    public void setSurname(String sn);
    public String generateStudentReport(String n, String sn, char grade, double mark);
    
}
