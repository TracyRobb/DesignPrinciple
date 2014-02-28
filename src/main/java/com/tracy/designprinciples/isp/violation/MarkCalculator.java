/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.tracy.designprinciples.isp.violation;

/**
 *
 * @author student
 */
//Too many different Methods preformed by one Interface
public interface MarkCalculator {
    
    public double termMark(double m1, double m2);
    public double avgTerm(int subjectNum, double totTermMark);
    public double yearMark(double totMark, int subjectNum);
    
    
}
