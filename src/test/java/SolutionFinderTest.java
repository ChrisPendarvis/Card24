/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import java.util.ArrayList;
import java.util.Arrays;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Chris
 */
public class SolutionFinderTest {
    
    public SolutionFinderTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    @Test
    public void testSwap() {
        int[] a = {1, 2, 3};
        int[] b = {3, 2, 1};
        SolutionFinder.swap(a, 0, 2);
        assert(Arrays.equals(a, b));
        
    }
    @Test
    public void testPermute() {
        int[] a = {1,2};
        ArrayList<int[]> b = new ArrayList<>();
        b.add(a.clone());
        int[] c = {2, 1};
        b.add(c.clone());
        ArrayList<int[]> result = SolutionFinder.permute(a);
        assertEquals(b.size(), result.size());
        for(int i = 0; i < b.size(); i++){
            assert(Arrays.equals(b.get(i), result.get(i)));
        }
        
    }
}
