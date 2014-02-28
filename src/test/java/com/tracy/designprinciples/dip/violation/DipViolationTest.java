/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.tracy.designprinciples.dip.violation;

import com.tracy.designprinciples.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.testng.Assert;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author student
 */
public class DipViolationTest {
    private static Principle3 principle;
    private static Teach3 teacher;
    
    public DipViolationTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void testDipVio() {
        //teacher.salary(50);
        
        //principle.principleSalary();
        Assert.assertEquals(teacher.salary(50), 63750.0);
        principle.setSalary(teacher);
        Assert.assertEquals(principle.principleSalary(), 7875.0);
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
        ApplicationContext ctx1 = new AnnotationConfigApplicationContext(AppConfig.class);
        teacher = (Teach3)ctx1.getBean("DipV1");
        
        ApplicationContext ctx2 = new AnnotationConfigApplicationContext(AppConfig.class);
        principle = (Principle3)ctx2.getBean("DipV");
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
}
