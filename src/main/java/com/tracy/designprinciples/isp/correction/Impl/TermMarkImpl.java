/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.tracy.designprinciples.isp.correction.Impl;

import com.tracy.designprinciples.isp.correction.TermMarkCalc;

/**
 *
 * @author student
 */
public class TermMarkImpl implements TermMarkCalc{

    public double termMark(double m1, double m2) {
         double tMark = m1 + m2 / 2;
         return tMark;
    }
    
}
