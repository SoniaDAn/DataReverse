package org.example;

public class DataReverse {
    public static int[] dataReverse(int[] data) {
        int[][] twoDArray = convertsTo2dArray(data, 8);
        final int[][] reversed = reverse(twoDArray);

        return deconstructTwoDimensionalArray(reversed);
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

    public static int[][] reverse(int[][] input) {
        if (input.length == 0) {
            return new int[0][0];
        }

        int[][] result = new int[input.length][input[0].length];

        for (int originalIndex = input.length - 1, resultIndex = 0; originalIndex >= 0; originalIndex--, resultIndex++) {
            result[resultIndex] = input[originalIndex];
        }

        return result;
    }

    public static int[] deconstructTwoDimensionalArray(int[][] input) {
        if (input.length == 0) {
            return new int[0];
        }

        final int resultingArrayLength = input.length * input[0].length;
        int[] result = new int[resultingArrayLength];

        int resultIndex = 0;

        for (final int[] segment : input) {
            for (final int item : segment) {
                result[resultIndex] = item;
                resultIndex++;
            }
        }

        return result;
    }
}
