/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.tracy.designprinciples.dip.violation;

/**
 *
 * @author student
 */

//Principle class is dependent of the teacher class to work out the principles salary
public class Principle3 {
    
    Teach3 income;
    
    public void setSalary(Teach3 t)
    {
        income = t;
    }
    
    public double principleSalary()
    {
        double sal = income.salary(5) + 1500;
        return sal;
    }
    
}
