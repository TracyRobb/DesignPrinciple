/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.tracy.designprinciples.isp.correction.Impl;

import com.tracy.designprinciples.isp.correction.AverageTermMarkCalc;

/**
 *
 * @author student
 */

public class AverageMarkImpl implements AverageTermMarkCalc{

    public double avgTerm(int subjectNum, double totTermMark) {
        double aTerm = totTermMark/subjectNum;
        return aTerm;
    }
    
}
