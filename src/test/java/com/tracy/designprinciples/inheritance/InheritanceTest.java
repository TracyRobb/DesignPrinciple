/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.tracy.designprinciples.inheritance;

import com.tracy.designprinciples.config.AppConfig;
import com.tracy.designprinciples.inheritance.Impl.StudentImpl;
import org.junit.Assert;
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
public class InheritanceTest {
    
    private static StudentImpl service;
    
    public InheritanceTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void IntheritTest() {
        
        service.setName("Harley");
        
        Assert.assertEquals("Name of students do not match: ", service.getName(), "Harley");
    
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
        
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        service = (StudentImpl)ctx.getBean("inherit");
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
