/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.tracy.designprinciples.config;

import com.tracy.designprinciples.dip.correction.Impl.Principle4;
import com.tracy.designprinciples.dip.correction.Impl.Teacher4;
import com.tracy.designprinciples.dip.correction.Salary1;

import com.tracy.designprinciples.dip.violation.Principle3;
import com.tracy.designprinciples.dip.violation.Teach3;
import com.tracy.designprinciples.encapsulation.Student;
import com.tracy.designprinciples.inheritance.SchoolMember;
import com.tracy.designprinciples.inheritance.Impl.StudentImpl;
import com.tracy.designprinciples.isp.correction.AverageTermMarkCalc;
import com.tracy.designprinciples.isp.correction.Impl.AverageMarkImpl;
import com.tracy.designprinciples.isp.correction.Impl.TermMarkImpl;
import com.tracy.designprinciples.isp.correction.Impl.YearMarkImpl;
import com.tracy.designprinciples.isp.correction.TermMarkCalc;
import com.tracy.designprinciples.isp.correction.YearMarkCalc;
import com.tracy.designprinciples.isp.violation.Impl.MarkCalculatorImpl;
import com.tracy.designprinciples.isp.violation.MarkCalculator;
import com.tracy.designprinciples.lsp.correction.Impl.Studs2;
import com.tracy.designprinciples.lsp.correction.Impl.Teach2;
import com.tracy.designprinciples.lsp.correction.SchoolMemb2;
import com.tracy.designprinciples.lsp.correction.StaffMember;
import com.tracy.designprinciples.lsp.violation.Impl.Studs1;
import com.tracy.designprinciples.lsp.violation.Impl.Teach1;
import com.tracy.designprinciples.lsp.violation.SchoolMemb1;
import com.tracy.designprinciples.ocp.correction.Principl;
import com.tracy.designprinciples.ocp.correction.SchoolMem1;
import com.tracy.designprinciples.ocp.correction.Teach;
import com.tracy.designprinciples.ocp.violation.Principle;
import com.tracy.designprinciples.ocp.violation.Salary;
import com.tracy.designprinciples.ocp.violation.Teacher1;
import com.tracy.designprinciples.plk.correction.Principle6;
import com.tracy.designprinciples.plk.correction.Student6;
import com.tracy.designprinciples.plk.violation.Principle5;
import com.tracy.designprinciples.plk.violation.Teacher5;
import com.tracy.designprinciples.polymorphism.SchoolMem;
import com.tracy.designprinciples.polymorphism.Impl.Teacher;

import com.tracy.designprinciples.srp.correction.Impl.Student1Impl;
import com.tracy.designprinciples.srp.correction.Student1;

import com.tracy.designprinciples.srp.correction.Impl.StudentReportsImpl;
import com.tracy.designprinciples.srp.correction.StudentReports;

import com.tracy.designprinciples.srp.violation.Impl.StudImpl;
import com.tracy.designprinciples.srp.violation.Stude;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


/**
 *
 * @author student
 */
@Configuration
public class AppConfig {
    
    //Bean for encapsulation Test
    @Bean(name = "encap")
    public Student getService()
    {
        return new Student();
    }
    
    //Bean for inheritance Test
    @Bean(name = "inherit")
    public SchoolMember getServiceInheritance()
    {
        return new StudentImpl();
    }
    
    //Bean for polymorphism Test
    @Bean(name = "polyTeacher")
    public SchoolMem getServicePoly()
    {
        return new Teacher();
    }
    
    //Bean for SRP violation
    @Bean(name = "Srp")
    public Stude getSRP()
    {
        return new StudImpl();
    }
    
    //Beans for SRP Correction
    @Bean (name = "SRPStud")
    public Student1 getSRPCorrect()
    {
        return new Student1Impl();
    }
    
    @Bean (name = "SRPStud1")
    public StudentReports getSRPCor()
    {
        return new StudentReportsImpl();
    }
    
    //Bean for ISP violation
    @Bean (name = "Isp")
    public MarkCalculator getISP()
    {
        return new MarkCalculatorImpl();
    }
    
    //Bean for ISP Correction
    @Bean (name = "Isp1")
    public AverageTermMarkCalc getISP1()
    {
        return new AverageMarkImpl();
    }
    @Bean (name = "Isp2")
    public TermMarkCalc getISP2()
    {
        return new TermMarkImpl();
    }
    @Bean (name = "Isp3")
    public YearMarkCalc getISP3()
    {
        return new YearMarkImpl();
    }
    
    //Bean for PLK violation
    @Bean (name= "Plk")
    public Student6 getPlkStud()
    {
        return new Student6();
    }
            
    @Bean (name= "Plk1")
    public Principle5 getPlkPrinc()
    {
        return new Principle5();
    }
    
    @Bean (name= "Plk2")
    public Teacher5 getPlkTeach()
    {
        return new Teacher5();
    }
    
    @Bean (name= "Plk3")
    public Principle6 getPlkPrinc1()
    {
        return new Principle6();
    }
    
    //Bean for OCP violation
    @Bean (name = "OcpV")
    public Principle getOcpPrince()
    {
        return new Principle();
    }
    @Bean (name = "OcpV1")
    public Teacher1 getOcpTeach()
    {
        return new Teacher1();
    }
    @Bean (name = "OcpV2")
    public Salary getOcpSal()
    {
        return new Salary();
    }
    
    //Bean for OCP correction
    @Bean (name = "OcpC")
    public SchoolMem1 getPrince()
    {
        return new Principl();
    }
    @Bean (name = "OcpC1")
    public SchoolMem1 getTeach()
    {
        return new Teach();
    }
    
    //Bean for LSP Correction
    @Bean (name = "LspC")
    public SchoolMemb2 getTeacher()
    {
        return new Teach2();
    }
    
    @Bean (name = "LspC1")
    public Teach2 getStaff()
    {
        return new Teach2();
    }
    
    @Bean (name = "LspC2")
    public SchoolMemb2 getStud()
    {
        return new Studs2();
    }
    
    //Bean for LSP Violation 
    @Bean (name = "LspV")
    public SchoolMemb1 getStud1()
    {
        return new Studs1();
    }
    
    @Bean (name = "LspV1")
    public SchoolMemb1 getTeach1()
    {
        return new Teach1();
    }
    
    //DIP Violation Bean
    @Bean (name = "DipV")
    public Principle3 getPri()
    {
        return new Principle3();
    }
    
    @Bean (name = "DipV1")
    public Teach3 getTea()
    {
        return new Teach3();
    }
    
    //DIP Correction Bean
    @Bean (name = "DipC")
    public Principle4 getPri1()
    {
        return new Principle4();
    }
    
    @Bean (name = "DipC1")
    public Salary1 getTea1()
    {
        return new Teacher4();
    }
}
