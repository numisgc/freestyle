/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.mavenfreestyle;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author olivert
 */
public class MavenFreeStyleTest {
    
    public MavenFreeStyleTest() {
    }

    /**
     * Test of main method, of class MavenFreeStyle.
     */
    
    @Test 
    public void testFibonacci(){
        //App test = new App();
        MavenFreeStyle instance = new MavenFreeStyle();
	assertTrue(instance.fibonacci(1) == 1);
    }
    @Test	
    public void testFibonacci2(){
	//App test = new App();
        MavenFreeStyle instance = new MavenFreeStyle();
        assertTrue(instance.fibonacci(10) == 55);
    }
    
}
