/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.tracy.designprinciples.dip.correction;

import com.tracy.designprinciples.config.AppConfig;
import com.tracy.designprinciples.dip.correction.Impl.Principle4;
import com.tracy.designprinciples.dip.correction.Impl.Teacher4;
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
public class DipCorrectionTest {
    
    private static Principle4 principle;
    private static Teacher4 teacher;
    
    public DipCorrectionTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void DpvTest() {
        Assert.assertEquals(teacher.salary(50), 63750.0);
        principle.setSalary(teacher);
        Assert.assertEquals(principle.principleSalary(), 7875.0);
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
        
        ApplicationContext ctx1 = new AnnotationConfigApplicationContext(AppConfig.class);
        teacher = (Teacher4)ctx1.getBean("DipC1");
        
        ApplicationContext ctx2 = new AnnotationConfigApplicationContext(AppConfig.class);
        principle = (Principle4)ctx2.getBean("DipC");
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
