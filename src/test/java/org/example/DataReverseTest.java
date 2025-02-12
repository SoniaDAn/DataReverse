package org.example;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@Nested
class DataReverseTest {

    @Test
    void dataReverse() {

    }

    @Test
    void reverseAnArray_reversesAnArray() {
        //given
        int[] data = {1, 2, 3, 4, 5};

        //when
        int[] result = DataReverse.reverseAnArray(data);

        //then
        assertThat(result).containsExactly(5, 4, 3, 2, 1);
    }

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
}