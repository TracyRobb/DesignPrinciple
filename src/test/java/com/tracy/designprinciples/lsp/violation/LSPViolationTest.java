/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.tracy.designprinciples.lsp.violation;

import com.tracy.designprinciples.config.AppConfig;
import com.tracy.designprinciples.lsp.violation.Impl.Studs1;
import com.tracy.designprinciples.lsp.violation.Impl.Teach1;
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
public class LSPViolationTest {
    
    private static Studs1 student;
    private static Teach1 teacher;
    
    public LSPViolationTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void LspViolaTest() {
        
        teacher.setStaffNumber("S12345");
        student.setName("Tracy");
        
        Assert.assertEquals(teacher.getStaffNumber(),"S12345");
        Assert.assertEquals(student.getName(),"Tracy");
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
        
        ApplicationContext ctx1 = new AnnotationConfigApplicationContext(AppConfig.class);
        teacher = (Teach1)ctx1.getBean("LspV1");
        
        ApplicationContext ctx2 = new AnnotationConfigApplicationContext(AppConfig.class);
        student = (Studs1)ctx2.getBean("LspV");
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
