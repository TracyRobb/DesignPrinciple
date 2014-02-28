/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.tracy.designprinciples.ocp.violation;

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
public class OCPViolationTest {
    
    private static Principle principle;
    private static Teacher1 teach;
    private static Salary sal;
    
    public OCPViolationTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void OCPViolTest() {
        
        Assert.assertEquals(sal.calcSalary(principle, 45), 58875.0);
        
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
        
        ApplicationContext ctx1 = new AnnotationConfigApplicationContext(AppConfig.class);
        principle = (Principle)ctx1.getBean("OcpV");
        
        ApplicationContext ctx2 = new AnnotationConfigApplicationContext(AppConfig.class);
        teach = (Teacher1)ctx2.getBean("OcpV1");
        
        ApplicationContext ctx3 = new AnnotationConfigApplicationContext(AppConfig.class);
        sal = (Salary)ctx3.getBean("OcpV2");
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
