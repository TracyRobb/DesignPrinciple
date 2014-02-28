/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.tracy.designprinciples.srp.correction.Impl;

import com.tracy.designprinciples.srp.correction.StudentReports;

/**
 *
 * @author student
 */
public class StudentReportsImpl implements StudentReports{
    
     public String generateStudentReport(String n, String sn, char grade, double mark) {
        return "Name: "+n+" Surname: "+sn+" Grade: "+grade+" Mark Obtained: "+mark+"\n"; 
    }
    
}
