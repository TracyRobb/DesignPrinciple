/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.tracy.designprinciples.plk.violation;

/**
 *
 * @author student
 */

//Principle is dependent on teacher and teacher is dependent on student to get the student mark
//this violates the PLK because you are accessing not just your neighbour
public class Principle5 {
    
    Teacher5 teach;
    
    public double getStudentMark()
     {
         return teach.getStudentMark();
     }
    
}
