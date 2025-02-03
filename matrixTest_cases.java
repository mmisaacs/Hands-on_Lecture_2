import org.junit.Test;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class matrixTest_cases {
    @Test
    public void test1(){
        spiral_matrix matrix1 = new spiral_matrix();
        int[][] inputMatrix = {
                {1,2,3},
                {4,5,6},
                {7,8,9}};
        List<Integer> result1 = matrix1.spiralOrder(inputMatrix);
        List<Integer> expected1 = new ArrayList<>(Arrays.asList(1, 2, 3, 6, 9, 8, 7, 4, 5));
        assertEquals(result1,expected1);
    }

    @Test
    public void test2(){
        spiral_matrix matrix2 = new spiral_matrix();
        int[][] inputMatrix = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12}};
        List<Integer> result2 = matrix2.spiralOrder(inputMatrix);
        List<Integer> expected2 = new ArrayList<>(Arrays.asList(1,2,3,4,8,12,11,10,9,5,6,7));
        assertEquals(result2,expected2);
    }

    @Test
    public void test3(){
        spiral_matrix matrix3 = new spiral_matrix();
        int[][] inputMatrix = {
                {10,6,3},
                {12,11,10},
                {1,2,3},
                {3,6,9}};
        List<Integer> result2 = matrix3.spiralOrder(inputMatrix);
        List<Integer> expected2 = new ArrayList<>(Arrays.asList(10,6,3,10,3,9,6,3,1,12,11,2));
        assertEquals(result2,expected2);
    }
}