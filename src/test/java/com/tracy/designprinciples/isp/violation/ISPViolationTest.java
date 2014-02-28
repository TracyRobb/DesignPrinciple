/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.tracy.designprinciples.isp.violation;

import com.tracy.designprinciples.config.AppConfig;
import com.tracy.designprinciples.srp.violation.Stude;
import junit.framework.Assert;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
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
public class ISPViolationTest {
    
    private static MarkCalculator service;
    
    public ISPViolationTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void ispViolaTest() {
        
        Assert.assertEquals(service.termMark(50, 75), 87.5);
        
        Assert.assertEquals(service.avgTerm(7, 567), 81.0);
        Assert.assertEquals(service.yearMark(567, 7), 81.0);
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
        
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        service = (MarkCalculator)ctx.getBean("Isp");
        
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
