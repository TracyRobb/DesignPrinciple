/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.tracy.designprinciples.srp.violation;

import com.tracy.designprinciples.config.AppConfig;
import com.tracy.designprinciples.encapsulation.Student;
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
public class SRPViolationTest {
    
    private static Stude service;
    
    public SRPViolationTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void violateTest(){
        
  
        service.setName("Tracy");
  
        Assert.assertEquals(service.getName(), "Tracy", "Names do not match");
        Assert.assertNotEquals(service.generateStudentReport("Tracy", "Robb", 'B', 75), "Name: Tracy Surname: Robb Grade: B Mark Obtained: 75\n", "Reports are not the same");
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
        
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        service = (Stude)ctx.getBean("Srp");
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
