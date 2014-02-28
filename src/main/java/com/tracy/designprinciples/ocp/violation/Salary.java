/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.tracy.designprinciples.ocp.violation;



/**
 *
 * @author student
 */

//Class has been modified to work out salary of principle and teacher
public class Salary {
    public double calcSalary(Object Schoolmember, int classes)
    {
        double salary = 0;
        if(Schoolmember instanceof Principle)
        {
            salary = classes * 850 * 1.5 + 1500;
        }
        else
        {
              salary = classes * 850 * 1.5;  
        }
        return salary;
    }
}
