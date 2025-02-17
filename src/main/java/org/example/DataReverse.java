package org.example;

public class DataReverse {
    public static int[] dataReverse(int[] data) {
        int[][] twoDArray = convertsTo2dArray(data, 8);

        //return reversesOrderOfSegmentsIn2dArray(twoDArray);
        return new int[0];
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

    public static int[][] reversesOrderOfSegmentsIn2dArray(int[][] twoDArray) {

        if (twoDArray.length == 0) {
            return new int[twoDArray.length][];
        }

        int[][] data = new int[twoDArray.length][twoDArray[0].length];
        int dataOuterIndex = 0;
        for (int outerIndex = twoDArray.length - 1; outerIndex >= 0; outerIndex--) {
            int dataInnerIndex = 0;
            for (int innerIndex = 0; innerIndex < twoDArray[outerIndex].length; innerIndex++) {
                data[dataOuterIndex][dataInnerIndex] = twoDArray[outerIndex][innerIndex];
                dataInnerIndex +=1;

            }
            dataOuterIndex += 1;

        }
        return data;
    }

    public static int[] convertsToArray(int[][] twoDArray) {
        int[] data = new int[twoDArray.length * twoDArray[0].length];

        int dataIndex = 0;

        for (int outerIndex = 0; outerIndex < twoDArray.length; outerIndex++) {
            for (int innerIndex = 0; innerIndex < twoDArray[outerIndex].length; innerIndex++) {
                data[dataIndex] = twoDArray[outerIndex][innerIndex];
                dataIndex += 1;
            }

        }
        return data;
    }
}
