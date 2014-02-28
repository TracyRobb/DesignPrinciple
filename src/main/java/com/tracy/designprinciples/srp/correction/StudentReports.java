/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.tracy.designprinciples.srp.correction;

/**
 *
 * @author student
 */

//Contains one responsibility generating student report
public interface StudentReports {
    
    public String generateStudentReport(String n, String sn, char grade, double mark);
    
}
