package org.example;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@Nested
class DataReverseTest {

    @Test
    void convertsTo2dArray_takesAnArrayAndConvertsTo2d() {
        //given
        int[] data = new int[80];
        int byteSize = 8;

        //when
        int[][] result = DataReverse.convertsTo2dArray(data, byteSize);

        //then
        assertThat(result.length).isEqualTo(10);
    }

    @Test
    void convertsTo2dArray_populatesA2dArray() {
        //given
        int[] data = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16};
        int byteSize = 8;

        //when
        int[][] result = DataReverse.convertsTo2dArray(data, byteSize);

        //then
        assertThat(result).isDeepEqualTo(new int[][]{{1, 2, 3, 4, 5, 6, 7, 8}, {9, 10, 11, 12, 13, 14, 15, 16}});
    }

    @Test
    void convertsTo2dArray_populatesAnother2dArray() {
        //given
        int[] data = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24};
        int byteSize = 8;

        //when
        int[][] result = DataReverse.convertsTo2dArray(data, byteSize);

        //then
        assertThat(result).isDeepEqualTo(new int[][]{{1, 2, 3, 4, 5, 6, 7, 8}, {9, 10, 11, 12, 13, 14, 15, 16},
                {17, 18, 19, 20, 21, 22, 23, 24}});
    }

    @Test
    void convertsTo2dArray_populatesAnother2dArrayWithSmallerByteSize() {
        //given
        int[] data = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25};
        int byteSize = 5;

        //when
        int[][] result = DataReverse.convertsTo2dArray(data, byteSize);

        //then
        assertThat(result).isDeepEqualTo(new int[][]{{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}, {11, 12, 13, 14, 15},
                {16, 17, 18, 19, 20}, {21, 22, 23, 24, 25}});
    }

    @Test
    void reversesOrderOfSegmentsIn2dArray_reversesPositionsOf2Arrays() {
        //given
        int[][] twoDArray = {{1, 2, 3, 4, 5, 6, 7, 8}, {9, 10, 11, 12, 13, 14, 15, 16}};

        //when
        int[] result = DataReverse.reversesOrderOfSegmentsIn2dArray(twoDArray);

        //then
        assertThat(result).containsExactly(9, 10, 11, 12, 13, 14, 15, 16, 1, 2, 3, 4, 5, 6, 7, 8);
    }

    @Test
    void reversesOrderOfSegmentsIn2dArray_reversesPositionsOf3Arrays() {
        //given
        int[][] twoDArray = {{1, 2, 3, 4, 5, 6, 7, 8}, {9, 10, 11, 12, 13, 14, 15, 16}, {17, 18, 19, 20, 21, 22, 23, 24}};

        //when
        int[] result = DataReverse.reversesOrderOfSegmentsIn2dArray(twoDArray);

        //then
        assertThat(result).containsExactly(17, 18, 19, 20, 21, 22, 23, 24, 9, 10, 11, 12, 13,
                14, 15, 16, 1, 2, 3, 4, 5, 6, 7, 8);
    }

    @Test
    void reversesOrderOfSegmentsIn2dArray_reversesPositionsOfMultipleArraysWithSmallerByteSize() {
        //given
        int[][] twoDArray = {{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}, {11, 12, 13, 14, 15}, {16, 17, 18, 19, 20},
                {21, 22, 23, 24, 25}};

        //when
        int[] result = DataReverse.reversesOrderOfSegmentsIn2dArray(twoDArray);

        //then
        assertThat(result).containsExactly(21, 22, 23, 24, 25, 16, 17, 18, 19, 20, 11, 12, 13, 14, 15,
                6, 7, 8, 9, 10,1, 2, 3, 4, 5);
    }

    @Test
    void reversesOrderOfSegmentsIn2dArray_returnsEmptyArrayIf2dArrayIsEmpty() {
        //given
        int[][] twoDArray = {};

        //when
        int[] result = DataReverse.reversesOrderOfSegmentsIn2dArray(twoDArray);

        //then
        assertThat(result).isEmpty();
    }

    @Test
    void dataReverse_returnsReverseSegmentArray() {
        //given
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16};

        //when
        int[] result = DataReverse.dataReverse(array);

        //then
        assertThat(result).containsExactly(9, 10, 11, 12, 13, 14, 15, 16, 1, 2, 3, 4, 5, 6, 7, 8);
    }

    @Test
    void deconstructTwoDimensionalArray_returnsDeconstructedArray() {
        //given
        int[][] input = {{1, 2, 3, 4}, {5, 6, 7, 8}};

        //when
        final int[] result = DataReverse.deconstructTwoDimensionalArray(input);

        //then
        assertThat(result).containsExactly(1, 2, 3, 4, 5, 6, 7, 8);
    }

    @Test
    void reverse_reversesTheTwoDimensionalArray() {
        //given
        int[][] input = {{1, 2, 3, 4}, {5, 6, 7, 8}};

        //when
        int[][] result = DataReverse.reverse(input);

        //then
        assertThat(result).isDeepEqualTo(new int[][]{{5, 6, 7, 8}, {1, 2, 3, 4}});
    }
}