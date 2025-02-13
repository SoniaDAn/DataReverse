package org.example;

public class DataReverse {
    public static int[] dataReverse(int[] data) {
        int[][] twoDArray = convertsTo2dArray(data, 8);

        return reversesOrderOfSegmentsIn2dArray(twoDArray, 8);
    }

    public static int[][] convertsTo2dArray(int[] data, int byteSize) {
        int[][] twoDArray = new int[data.length / byteSize][byteSize];

        int dataArrayIndex = 0;

        for (int[] innerIndex : twoDArray) {
            for (int value : innerIndex) {
                value = data[dataArrayIndex];
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
