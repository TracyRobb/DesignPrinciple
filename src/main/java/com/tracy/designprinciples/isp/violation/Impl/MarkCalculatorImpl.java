/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.tracy.designprinciples.isp.violation.Impl;

import com.tracy.designprinciples.isp.violation.MarkCalculator;

/**
 *
 * @author student
 */
public class MarkCalculatorImpl implements MarkCalculator {

    public double termMark(double m1, double m2) {
        double tMark = m1 + m2 / 2;
        return tMark;
    }

    public double avgTerm(int subjectNum, double totTermMark) {
        double aTerm = totTermMark/subjectNum;
        return aTerm;
    }

    public double yearMark(double totMark, int subjectNum) {
        double yMark = totMark/subjectNum;
        return yMark;
    }
    
    
}
