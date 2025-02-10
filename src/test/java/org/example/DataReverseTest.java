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

        //when
        int[][] result = DataReverse.convertsTo2dArray(data);

        //then
        assertThat(result.length).isEqualTo(10);
    }
}