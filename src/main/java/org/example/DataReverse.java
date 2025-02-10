package org.example;

public class DataReverse {
    public static int[] dataReverse(int[] data) {
        return new int[0];
    }

    public static int[] reverseAnArray(int[] data) {
//        for (int i = 0; i < data.length / 2; i++) { //sets the loop conditions. Start at zero and loop through half of the array. Increment by 1 each time until reach mid-way point
//            int temporaryInt = data[i]; //new variable temporaryInt stores the value of the iteration we're on. So for 1st loop it is 1
//            data[i] = data[data.length - 1 - i]; //swaps values in the positions. The zero index becomes the 4th index.
//            // minus i is removing the index that the loop is on from the back of the loop so both swaps correctly correspond
//            //for the second iteration it is the value of index 1 being swapped with [5 - 1 - 1] so index 3
//            data[data.length - 1 - i] = temporaryInt; // the value stored in temporaryInt is moved to relevant index
//        }

        int[] reversedResult = new int[data.length]; //new array set to the length of og array

        int indexOfReversedResult = 0;
        for (int i = data.length - 1; i > -1; i--) {
            reversedResult[indexOfReversedResult] = data[i];
            indexOfReversedResult += 1;
        }
        return reversedResult;
    }

}
