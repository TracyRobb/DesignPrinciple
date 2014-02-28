/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.tracy.designprinciples.isp.correction.Impl;

import com.tracy.designprinciples.isp.correction.YearMarkCalc;

/**
 *
 * @author student
 */
public class YearMarkImpl implements YearMarkCalc{

    public double yearMark(double totMark, int subjectNum) {
        double yMark = totMark/subjectNum;
        return yMark;
    }
    
}
