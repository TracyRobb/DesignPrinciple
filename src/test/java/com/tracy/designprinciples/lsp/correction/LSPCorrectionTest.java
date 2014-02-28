/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.tracy.designprinciples.lsp.correction;

import com.tracy.designprinciples.config.AppConfig;
import com.tracy.designprinciples.lsp.correction.Impl.Teach2;
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
public class LSPCorrectionTest {
    
    private static Teach2 teacher;
    private static SchoolMemb2 stud;
    
    public LSPCorrectionTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void LspCorrectTest() {
        teacher.setStaffNumber("S12345");
        stud.setName("Tracy");
        
        Assert.assertEquals(teacher.getStaffNumber(),"S12345");
        Assert.assertEquals(stud.getName(),"Tracy");
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
        
        ApplicationContext ctx1 = new AnnotationConfigApplicationContext(AppConfig.class);
        teacher = (Teach2)ctx1.getBean("LspC1");
        
        ApplicationContext ctx2 = new AnnotationConfigApplicationContext(AppConfig.class);
        stud = (SchoolMemb2)ctx2.getBean("LspC2");
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
