package org.example;

public class DataReverse {
    public static int[] dataReverse(int[] data) {
        return new int[0];
    }

    public static int[] reverseAnArray(int[] data) {

        int[] reversedResult = new int[data.length];

        for (int indexOfOriginalArray = data.length - 1, indexOfReversedResult = 0; indexOfOriginalArray > -1;
             indexOfOriginalArray--, indexOfReversedResult++) {
            reversedResult[indexOfReversedResult] = data[indexOfOriginalArray];
        }
        return reversedResult;
    }

    public static int[][] convertsTo2dArray(int[] data, int byteSize) {
        return new int[data.length / byteSize][byteSize];
    }
}
