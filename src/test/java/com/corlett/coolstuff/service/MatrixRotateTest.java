package com.corlett.coolstuff.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;

import static com.corlett.coolstuff.util.Utility.printMatrix;

@RunWith(SpringRunner.class)
public class MatrixRotateTest {

    int[][] array = {{1, 0},
            {1, 0}};

    String[][] stringMatrix = {{"X", "_"},{"X","_"}};

    String[][] testRotateMatrix = {{"X", "_", "_"},{"X", "_", "_"},{"X", "_", "_"}};


    @Test
    public void testPrinting(){

        System.out.println("Printing Matrix");

        printMatrix(stringMatrix);
    }

    @Test
    public void testRotateCounterClockwise() {

        String[][] matrix = MatrixRotate.rotateMatrixCounterClockwise(testRotateMatrix);

        printMatrix(matrix);
    }

    @Test
    public void testRotateClockwise() {

        String[][] testRotateMatrix = {{"X", "_", "_"},{"X", "_", "_"},{"X", "_", "_"}};


        String[][] matrix = MatrixRotate.rotateMatrixClockwise(testRotateMatrix);

        printMatrix(matrix);
    }

}
