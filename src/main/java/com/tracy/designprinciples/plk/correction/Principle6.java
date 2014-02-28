/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.tracy.designprinciples.plk.correction;

/**
 *
 * @author student
 */

//This allows principle to only have access to Student
public class Principle6 {
    
    Student6 stud;
    
    public void setStudent(Student6 s)
    {
        stud = s;
    }
    
    public double getStudentMark()
     {
         return stud.getMark();
     }
    
}
