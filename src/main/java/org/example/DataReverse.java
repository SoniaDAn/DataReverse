package org.example;

public class DataReverse {
    public static int[] dataReverse(int[] data) {
        //is next step to use converts method on a data array so we have an actual array to use?
        //then

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
        int[][] twoDArray = new int[data.length / byteSize][byteSize];

        int arr = 0;

        for (int outerIndex = 0; outerIndex < twoDArray.length; outerIndex++) {

            //when 2nd outer loop starts it should be on index 8 but inner index has been reset to 0
            for (int innerIndex = 0; innerIndex < twoDArray[outerIndex].length; innerIndex++) {
                twoDArray[outerIndex][innerIndex] = data[arr];
                arr += 1;//the data index can't be called innerIndex.
            }
            //at the end of 1st inner loop should have gone to 7th index of data array

            //data[innerIndex] = data[innerIndex * outerIndex];
            //data[outerIndex] += 1; this isn't incrementing the index. data[outerIndex += 1] increments the index.
            //data = data[outerIndex += 1];

        }
        return twoDArray;
    }
}
