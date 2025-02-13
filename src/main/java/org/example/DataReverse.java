package org.example;

public class DataReverse {
    public static int[] dataReverse(int[] data) {
       //we have a method to convert to a 2d array
        //we have a method to convert a 2d array to the final array output
        //int[] dataArray = new int[data.length];

        int[][] twoDArray = convertsTo2dArray(data, 8);

        return reversesOrderOfSegmentsIn2dArray(twoDArray, 8);
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

        int dataArrayIndex = 0;

        for (int outerIndex = 0; outerIndex < twoDArray.length; outerIndex++) {
            for (int innerIndex = 0; innerIndex < twoDArray[outerIndex].length; innerIndex++) {
                twoDArray[outerIndex][innerIndex] = data[dataArrayIndex];
                dataArrayIndex += 1;
            }
        }
        return twoDArray;
    }

    public static int[] reversesOrderOfSegmentsIn2dArray(int[][] twoDArray, int byteSize) {
        int[] data = new int[twoDArray.length * byteSize];

        int resultArrayIndex = 0;

        for (int outerIndex = twoDArray.length - 1; outerIndex >= 0; outerIndex--) {
            for (int innerIndex = 0; innerIndex < twoDArray[outerIndex].length; innerIndex++) {
                data[resultArrayIndex] = twoDArray[outerIndex][innerIndex];
                resultArrayIndex += 1;
            }
        }
        return data;
    }
}
