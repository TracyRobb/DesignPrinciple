/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.tracy.designprinciples.plk.violation;

import com.tracy.designprinciples.config.AppConfig;
import com.tracy.designprinciples.isp.violation.MarkCalculator;
import com.tracy.designprinciples.plk.correction.Principle6;
import com.tracy.designprinciples.plk.correction.Student6;
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
public class PLKViolationTest {
    private static Student6 service;
    private static Principle5 principle;
    private static Teacher5 teach;
    
    public PLKViolationTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    
        @Test(expectedExceptions = NullPointerException.class )
        public void exceptionAssertion() throws Exception{  
        service.setMark(22.0); 
        principle.getStudentMark();
    
        
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
        
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        service = (Student6)ctx.getBean("Plk");
        
        ApplicationContext ctxp = new AnnotationConfigApplicationContext(AppConfig.class);
        principle = (Principle5)ctx.getBean("Plk1");
        
        ApplicationContext ctxt = new AnnotationConfigApplicationContext(AppConfig.class);
        teach = (Teacher5)ctx.getBean("Plk2");
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
