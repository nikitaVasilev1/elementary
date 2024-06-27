package ru.array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class TurnTest {
    @Test
    void whenTurnArrayWithEvenAmountOfElementsThenTurnedArray() {
        int[] input = new int[] {4, 1, 6, 2};
        int[] result = Turn.back(input);
        int[] expected = new int[] {2, 6, 1, 4};
        assertThat(result).containsExactly(expected);
    }

    @Test
    void whenTurnArrayWithOddAmountOfElementsThenTurnedArray() {
        int[] input = new int[] {4, 1, 6, 2, 3};
        int[] result = Turn.back(input);
        int[] expected = new int[] {3, 2, 6, 1, 4};
        assertThat(result).containsExactly(expected);
    }

    @Test
    void whenTurnArrayWithYetAmountOfElementsThenTurnedArray() {
        int[] input = new int[] {4, 2, 3};
        int[] result = Turn.back(input);
        int[] expected = new int[] {3, 2, 4};
        assertThat(result).containsExactly(expected);
    }
}