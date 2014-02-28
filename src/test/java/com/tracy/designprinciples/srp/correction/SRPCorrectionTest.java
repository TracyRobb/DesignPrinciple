/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.tracy.designprinciples.srp.correction;

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
public class SRPCorrectionTest {
    
    private static StudentReports service;
    private static Student1 student1;
    
    public SRPCorrectionTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void SrpCorrectTest() {
        
        //testing the data part
        student1.setName("Tracy");
        Assert.assertEquals(student1.getName(), "Tracy");
        //testing the generatingReport
        Assert.assertNotEquals(service.generateStudentReport("Tracy", "Robb", 'B', 75), "Name: Tracy Surname: Robb Grade: B Mark Obtained: 75\n", "Reports are not the same");
    
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        service = (StudentReports)ctx.getBean("SRPStud1");
        
        ApplicationContext ctx1 = new AnnotationConfigApplicationContext(AppConfig.class);
        student1 = (Student1)ctx1.getBean("SRPStud");
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
