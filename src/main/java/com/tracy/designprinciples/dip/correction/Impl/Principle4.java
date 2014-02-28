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
//Principle class is now dependent on a abstraction instead of a class
public class Principle4 {
    Salary1 income;
    
    public void setSalary(Salary1 t)
    {
        income = t;
    }
    
    public double principleSalary()
    {
        double sal = income.salary(5) + 1500;
        return sal;
    }
    
}
