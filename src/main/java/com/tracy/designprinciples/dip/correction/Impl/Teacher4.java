/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.tracy.designprinciples.dip.correction.Impl;

import com.tracy.designprinciples.dip.correction.Salary1;

/**
 *
 * @author student
 */
public class Teacher4 implements Salary1{

    public double salary(int classes) {
        double salary;
        salary = classes * 850 * 1.5; 
        return salary;
    }
    
    
}
