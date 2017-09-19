/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea1;

import java.awt.Graphics;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ESTEBANFML
 */
public class HighLifeGUITest {
    
    public HighLifeGUITest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of setDisplayData method, of class HighLifeGUI.
     */
    @Test
    public void testSetDisplayData() {
        System.out.println("setDisplayData");
        boolean[][] board = null;
        HighLifeGUI instance = null;
        instance.setDisplayData(board);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of paint method, of class HighLifeGUI.
     */
    @Test
    public void testPaint() {
        System.out.println("paint");
        Graphics g = null;
        HighLifeGUI instance = null;
        instance.paint(g);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
