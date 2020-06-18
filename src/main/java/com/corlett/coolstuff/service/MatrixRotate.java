package com.corlett.coolstuff.service;

/*
Given an image represented by an NxN matrix,
where each pixel in the image us 4 bytes,
write a method to rotate the image by 90 degrees.
Can you do this in place?

[*][ ] == [*][*]
[*][ ]    [ ][ ]

 */
public class MatrixRotate {


    public static String[][] rotateMatrixCounterClockwise(String[][] matrix) {

        for(int i = 0; i < matrix[i].length/2; i++) {

            for(int j = i; j < matrix[i].length - i - 1; j++) {
                //temp var
                String temp = matrix[i][j];

                //move vals from right to top
                matrix[i][j] = matrix[j][matrix[0].length - 1 - i];

                //move vals from bottom to right
                matrix[j][matrix[0].length - 1 - i]
                        = matrix[matrix[0].length - 1 - i][matrix[0].length - 1- j];

                //move vals from left to bottom
                matrix[matrix[0].length - 1 - i][matrix[0].length - 1 - j]
                        = matrix[matrix[0].length - 1 - j][i];

                //assign temp to left
                matrix[matrix[0].length - 1 - j][i] = temp;

            }
        }

        return matrix;
    }


    public static String[][] rotateMatrixClockwise(String[][] matrix) {

        for(int i = 0; i < matrix[i].length/2; i++) {

            for(int j = i; j < matrix[i].length - i - 1; j++) {
                //temp var
                String temp = matrix[i][j];

                //move vals from right to top
//                matrix[i][j] = matrix[j][matrix[0].length - 1 - i];
                //move vals from left to top
                matrix[i][j] = matrix[matrix[0].length - 1 - j][i];

                //move vals from bottom to right
//                matrix[j][matrix[0].length - 1 - i]
//                        = matrix[matrix[0].length - 1 - i][matrix[0].length - 1- j];
                //move vals from bottom to left
                matrix[j][matrix[0].length - 1 - i]
                        = matrix[matrix[0].length - 1 - j][i];

                //move vals from left to bottom
//                matrix[matrix[0].length - 1 - i][matrix[0].length - 1 - j]
//                        = matrix[matrix[0].length - 1 - j][i];
                //move vals from right to bottom
                matrix[matrix[0].length - 1 - i][matrix[0].length - 1 - j]
                        = matrix[j][matrix[0].length - 1 - i];

                //assign temp to left
                //matrix[matrix[0].length - 1 - j][i] = temp;
                //assing temp to right
                matrix[j][matrix[0].length - 1 - i] = temp;


            }
        }

        return matrix;
    }

}
