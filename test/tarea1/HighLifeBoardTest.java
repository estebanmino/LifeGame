/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea1;

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
public class HighLifeBoardTest {
    
    public HighLifeBoardTest() {
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
     * Test of getData method, of class HighLifeBoard.
     */
    @Test
    public void testGetDataColumns() {
        System.out.println("testGetDataColumns");
        HighLifeBoard instance = new HighLifeBoard(10,10);
        int lenght = 10;
        boolean[][] result = instance.getData();
        assertEquals(lenght, result.length);
    }
    
    @Test
    public void testGetDataRows() {
        System.out.println("testGetDataRows");
        HighLifeBoard instance = new HighLifeBoard(10,10);
        int lenght = 10;
        boolean[][] result = instance.getData();
        assertEquals(lenght, result[1].length);
    }
    
    @Test
    public void testGetData() {
        System.out.println("testGetData");
        HighLifeBoard instance = new HighLifeBoard(10,10);
        int lenght = 10;
        boolean[][] expResult = new boolean[10][10];
        boolean[][] result = instance.getData();
        assertArrayEquals(expResult, result);
    }

    /**
     * Test of setCell method, of class HighLifeBoard.
     */
    @Test
    public void testSetCellFalse() {
        System.out.println("setCellFalse");
        int i = 0;
        int j = 0;
        boolean value = false;
        HighLifeBoard instance = new HighLifeBoard(10,10);
        instance.setCell(i, j, value);
        boolean[][] result = instance.getData();
        assertEquals(result[0][0], false);
    }
    
        @Test
    public void testSetCellTrue() {
        System.out.println("setCellTrue");
        int i = 0;
        int j = 0;
        boolean value = true;
        HighLifeBoard instance = new HighLifeBoard(10,10);
        instance.setCell(i, j, value);
        boolean[][] result = instance.getData();
        assertEquals(result[0][0], true);
    }
    
    @Test(expected = IndexOutOfBoundsException.class)
    public void testSetCellOutOfBound() {
        System.out.println("SetCellOutOfBound");
        int i = 110;
        int j = 10;
        boolean value = true;
        HighLifeBoard instance = new HighLifeBoard(10,10);
        instance.setCell(i, j, value);
    }

    /**
     * Test of isAlive method, of class HighLifeBoard.
     */
    @Test
    public void testIsAliveTrue() {
        System.out.println("isAliveTrue");
        int i = 0;
        int j = 0;
        HighLifeBoard instance = new HighLifeBoard(10,10);
        boolean expResult = true;
        instance.setCell(i,j, true);
        boolean result = instance.isAlive(i, j);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testIsAliveFalse() {
        System.out.println("isAliveFalse");
        int i = 0;
        int j = 0;
        HighLifeBoard instance = new HighLifeBoard(10,10);
        boolean expResult = false;
        instance.setCell(i,j, false);
        boolean result = instance.isAlive(i, j);
        assertEquals(expResult, result);
    }

    @Test
    public void testIsAliveOutNegLength() {
        System.out.println("isAliveOutNegLength");
        int i = -10;
        int j = 0;
        HighLifeBoard instance = new HighLifeBoard(10,10);
        boolean expResult = false;
        boolean result = instance.isAlive(i, j);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testIsAliveOutPosLength() {
        System.out.println("isAliveOutPosLength");
        int i = 15;
        int j = 0;
        HighLifeBoard instance = new HighLifeBoard(10,10);
        boolean expResult = false;
        boolean result = instance.isAlive(i, j);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testIsAliveOutNegWidth() {
        System.out.println("isAliveOutNegWidth");
        int i = 1;
        int j = -10;
        HighLifeBoard instance = new HighLifeBoard(10,10);
        boolean expResult = false;
        boolean result = instance.isAlive(i, j);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testIsAliveOutPosWidth() {
        System.out.println("isAliveOutPosWidth");
        int i = 1;
        int j = 15;
        HighLifeBoard instance = new HighLifeBoard(10,10);
        boolean expResult = false;
        boolean result = instance.isAlive(i, j);
        assertEquals(expResult, result);
    }
    
    
    /**
     * Test of countAliveNeighbors method, of class HighLifeBoard.
     */
    
    @Test
    public void testCountAliveNeighborsStartLeft() {
        System.out.println("testCountAliveNeighborsStartLeft");
        int i = 0;
        int j = 0;
        HighLifeBoard instance = new HighLifeBoard(10,10);
        int expResult = 0;
        int result = instance.countAliveNeighbors(i, j);
        assertEquals(expResult, result);
    }
    
        @Test
    public void testCountAliveNeighborsAllStartLeft() {
        System.out.println("testCountAliveNeighborsAllStartLeft");
        int i = 0;
        int j = 0;
        HighLifeBoard instance = new HighLifeBoard(10,10);
        int expResult = 3;
        instance.setCell(0,1,true);
        instance.setCell(1,1,true);
        instance.setCell(1,0,true);
        int result = instance.countAliveNeighbors(i, j);
        assertEquals(expResult, result);
    }
    
        @Test
    public void testCountAliveNeighborsEndLeft() {
        System.out.println("testCountAliveNeighborsEndLeft");
        int i = 0;
        int j = 9;
        HighLifeBoard instance = new HighLifeBoard(10,10);
        int expResult = 0;
        int result = instance.countAliveNeighbors(i, j);
        assertEquals(expResult, result);
    }
    
        @Test
    public void testCountAliveNeighborsAllEndLeft() {
        System.out.println("testCountAliveNeighborsAllEndLeft");
        int i = 0;
        int j = 9;
        HighLifeBoard instance = new HighLifeBoard(10,10);
        int expResult = 3;
        instance.setCell(0,8,true);
        instance.setCell(1,8,true);
        instance.setCell(1,9,true);
        int result = instance.countAliveNeighbors(i, j);
        assertEquals(expResult, result);
    }
    
        @Test
    public void testCountAliveNeighborsStartRight() {
        System.out.println("testCountAliveNeighborsStartRight");
        int i = 9;
        int j = 0;
        HighLifeBoard instance = new HighLifeBoard(10,10);
        int expResult = 0;
        int result = instance.countAliveNeighbors(i, j);
        assertEquals(expResult, result);
    }
    
        @Test
    public void testCountAliveNeighborsAllStartRight() {
        System.out.println("testCountAliveNeighborsAllStartRight");
        int i = 9;
        int j = 0;
        HighLifeBoard instance = new HighLifeBoard(10,10);
        int expResult = 3;
        instance.setCell(8,0,true);
        instance.setCell(8,1,true);
        instance.setCell(9,1,true);
        int result = instance.countAliveNeighbors(i, j);
        assertEquals(expResult, result);
    }
    
            @Test
    public void testCountAliveNeighborsEndRight() {
        System.out.println("testCountAliveNeighborsEndRight");
        int i = 9;
        int j = 9;
        HighLifeBoard instance = new HighLifeBoard(10,10);
        int expResult = 0;
        int result = instance.countAliveNeighbors(i, j);
        assertEquals(expResult, result);
    }
    
        @Test
    public void testCountAliveNeighborsAllEndRight() {
        System.out.println("testCountAliveNeighborsAllEndRight");
        int i = 9;
        int j = 9;
        HighLifeBoard instance = new HighLifeBoard(10,10);
        int expResult = 3;
        instance.setCell(8,9,true);
        instance.setCell(8,8,true);
        instance.setCell(9,8,true);
        int result = instance.countAliveNeighbors(i, j);
        assertEquals(expResult, result);
    }
    
            @Test
    public void testCountAliveNeighborsMiddle() {
        System.out.println("testCountAliveNeighborsMiddle");
        int i = 5;
        int j = 5;
        HighLifeBoard instance = new HighLifeBoard(10,10);
        int expResult = 3;
        instance.setCell(5,6,true);
        instance.setCell(4,4,true);
        instance.setCell(4,5,true);
        instance.setCell(4,7,true);
        int result = instance.countAliveNeighbors(i, j);
        assertEquals(expResult, result);
    }
    
                @Test
    public void testCountAliveNeighborsMiddleNone() {
        System.out.println("testCountAliveNeighborsMiddleNone");
        int i = 5;
        int j = 5;
        HighLifeBoard instance = new HighLifeBoard(10,10);
        int expResult = 0;
        instance.setCell(3,6,true);
        instance.setCell(9,9,true);
        instance.setCell(3,3,true);
        int result = instance.countAliveNeighbors(i, j);
        assertEquals(expResult, result);
    }
    
                    @Test
    public void testCountAliveNeighborsItself() {
        System.out.println("testCountAliveNeighborsItself");
        int i = 5;
        int j = 5;
        HighLifeBoard instance = new HighLifeBoard(10,10);
        int expResult = 0;
        instance.setCell(5,5,true);
        int result = instance.countAliveNeighbors(i, j);
        assertEquals(expResult, result);
    }

    /**
     * Test of shouldSurvive method, of class HighLifeBoard.
     */
    @Test
    public void testShouldSurviveDeadWithNone() {
        System.out.println("testShouldSurviveDeadWithNone");
        int i = 0;
        int j = 0;
        HighLifeBoard instance = new HighLifeBoard(10,10);
        boolean expResult = false;
        boolean result = instance.shouldSurvive(i, j);
        assertEquals(expResult, result);
    }
    
        @Test
    public void testShouldSurviveDeadWithOne() {
        System.out.println("testShouldSurviveDeadWithOne");
        int i = 0;
        int j = 0;
        HighLifeBoard instance = new HighLifeBoard(10,10);
        boolean expResult = false;
        instance.setCell(1,0,true);
        boolean result = instance.shouldSurvive(i, j);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testShouldSurviveDeadWithTwo() {
        System.out.println("testShouldSurviveDeadWithOne");
        int i = 0;
        int j = 0;
        HighLifeBoard instance = new HighLifeBoard(10,10);
        boolean expResult = false;
        instance.setCell(1,0,true);
        instance.setCell(1,1,true);
        boolean result = instance.shouldSurvive(i, j);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testShouldSurviveDeadWithThree() {
        System.out.println("testShouldSurviveDeadWithThree");
        int i = 0;
        int j = 0;
        HighLifeBoard instance = new HighLifeBoard(10,10);
        boolean expResult = false;
        instance.setCell(1,0,true);
        instance.setCell(1,1,true);
        instance.setCell(0,1,true);
        boolean result = instance.shouldSurvive(i, j);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testShouldSurviveDeadWithMoreThanThree() {
        System.out.println("testShouldSurviveDeadWithMoreThanThree");
        int i = 1;
        int j = 1;
        HighLifeBoard instance = new HighLifeBoard(10,10);
        boolean expResult = false;
        instance.setCell(1,0,true);
        instance.setCell(0,0,true);
        instance.setCell(2,1,true);
        instance.setCell(2,2,true);
        boolean result = instance.shouldSurvive(i, j);
        assertEquals(expResult, result);
    }
    
        @Test
    public void testShouldSurviveAliveWithNone() {
        System.out.println("testShouldSurviveAliveWithNone");
        int i = 1;
        int j = 1;
        HighLifeBoard instance = new HighLifeBoard(10,10);
        boolean expResult = false;
        instance.setCell(1,1,true);
        boolean result = instance.shouldSurvive(i, j);
        assertEquals(expResult, result);
    }
    
            @Test
    public void testShouldSurviveAliveWithOne() {
        System.out.println("testShouldSurviveAliveWithOne");
        int i = 1;
        int j = 1;
        HighLifeBoard instance = new HighLifeBoard(10,10);
        boolean expResult = false;
        instance.setCell(1,1,true);
        instance.setCell(0,1,true);
        boolean result = instance.shouldSurvive(i, j);
        assertEquals(expResult, result);
    }
    
                @Test
    public void testShouldSurviveAliveWithTwo() {
        System.out.println("testShouldSurviveAliveWithTwo");
        int i = 1;
        int j = 1;
        HighLifeBoard instance = new HighLifeBoard(10,10);
        boolean expResult = true;
        instance.setCell(1,1,true);
        instance.setCell(0,1,true);
        instance.setCell(0,0,true);
        boolean result = instance.shouldSurvive(i, j);
        assertEquals(expResult, result);
    }
    
                @Test
    public void testShouldSurviveAliveWithThree() {
        System.out.println("testShouldSurviveAliveWithThree");
        int i = 1;
        int j = 1;
        HighLifeBoard instance = new HighLifeBoard(10,10);
        boolean expResult = true;
        instance.setCell(1,1,true);
        instance.setCell(0,1,true);
        instance.setCell(0,0,true);
        instance.setCell(1,0,true);
        boolean result = instance.shouldSurvive(i, j);
        assertEquals(expResult, result);
    }
    
                    @Test
    public void testShouldSurviveAliveWithMoreThanThree() {
        System.out.println("testShouldSurviveAliveWithThree");
        int i = 1;
        int j = 1;
        HighLifeBoard instance = new HighLifeBoard(10,10);
        boolean expResult = true;
        instance.setCell(1,1,true);
        instance.setCell(0,1,true);
        instance.setCell(0,0,true);
        instance.setCell(1,0,true);
        instance.setCell(1,2,true);
        boolean result = instance.shouldSurvive(i, j);
        assertEquals(expResult, result);
    }

    /**
     * Test of shouldBeBorn method, of class HighLifeBoard.
     */
    @Test
    public void testShouldBeBorn() {
        System.out.println("shouldBeBorn");
        int i = 0;
        int j = 0;
        HighLifeBoard instance = null;
        boolean expResult = false;
        boolean result = instance.shouldBeBorn(i, j);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calculateNextState method, of class HighLifeBoard.
     */
    @Test
    public void testCalculateNextState() {
        System.out.println("calculateNextState");
        int i = 0;
        int j = 0;
        HighLifeBoard instance = null;
        boolean expResult = false;
        boolean result = instance.calculateNextState(i, j);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of simulate method, of class HighLifeBoard.
     */
    @Test
    public void testSimulate() {
        System.out.println("simulate");
        HighLifeBoard instance = null;
        instance.simulate();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class HighLifeBoard.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        HighLifeBoard instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
