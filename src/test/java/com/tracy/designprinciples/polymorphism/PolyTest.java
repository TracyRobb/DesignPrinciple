/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.tracy.designprinciples.polymorphism;

import com.tracy.designprinciples.config.AppConfig;
import com.tracy.designprinciples.polymorphism.Impl.Stud;
import com.tracy.designprinciples.polymorphism.Impl.Teacher;
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
public class PolyTest {
    
    private static SchoolMem service;
    
    public PolyTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    // 
    @Test
    public void polyTest() {
        
        
        Assert.assertEquals(service.payment(45), 57375.0);
        
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
       
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        service = (Teacher)ctx.getBean("polyTeacher");
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
