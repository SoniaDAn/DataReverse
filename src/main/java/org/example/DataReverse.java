package org.example;

public class DataReverse {
    public static int[] dataReverse(int[] data) {
        return new int[0];
    }

    public static int[] reverseAnArray(int[] data) {

        int[] reversedResult = new int[data.length];

        int indexOfReversedResult = 0;
        for (int indexOfOriginalArray = data.length - 1; indexOfOriginalArray > -1; indexOfOriginalArray--) {
            reversedResult[indexOfReversedResult] = data[indexOfOriginalArray];
            indexOfReversedResult += 1;
        }
        return reversedResult;

    }

}
