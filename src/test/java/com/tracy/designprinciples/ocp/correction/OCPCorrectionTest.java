/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.tracy.designprinciples.ocp.correction;

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
public class OCPCorrectionTest {
    
    private static Principl principle;
    private static Teach teach;
    //private static SchoolMem1 school;
    
    public OCPCorrectionTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void OcpCorrectTest() {
        
        Assert.assertEquals(principle.salary(45), 58875.0);
        Assert.assertEquals(teach.salary(45), 57375.0);
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
        
        ApplicationContext ctx1 = new AnnotationConfigApplicationContext(AppConfig.class);
        principle = (Principl)ctx1.getBean("OcpC");
        
        ApplicationContext ctx2 = new AnnotationConfigApplicationContext(AppConfig.class);
        teach = (Teach)ctx2.getBean("OcpC1");
        
        /*ApplicationContext ctx3 = new AnnotationConfigApplicationContext(AppConfig.class);
        sal = (SchoolMem1)ctx3.getBean("OcpV2");*/
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
