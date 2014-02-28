/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.tracy.designprinciples.isp.correction;

import com.tracy.designprinciples.config.AppConfig;
import com.tracy.designprinciples.isp.violation.MarkCalculator;
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
public class ISPCorrectionTest {
    
    private static AverageTermMarkCalc average;
    private static TermMarkCalc term;
    private static YearMarkCalc year;
            
    
    public ISPCorrectionTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void ispCorrectTest() {
        
        Assert.assertEquals(term.termMark(50, 75), 87.5);
        
        Assert.assertEquals(average.avgTerm(7, 567), 81.0);
        Assert.assertEquals(year.yearMark(567, 7), 81.0);
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
        
        ApplicationContext ctx1 = new AnnotationConfigApplicationContext(AppConfig.class);
        average = (AverageTermMarkCalc)ctx1.getBean("Isp1");
        
        ApplicationContext ctx2 = new AnnotationConfigApplicationContext(AppConfig.class);
        term = (TermMarkCalc)ctx2.getBean("Isp2");
        
        ApplicationContext ctx3 = new AnnotationConfigApplicationContext(AppConfig.class);
        year = (YearMarkCalc)ctx3.getBean("Isp3");
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
