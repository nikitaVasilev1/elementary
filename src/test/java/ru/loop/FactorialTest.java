package ru.loop;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class FactorialTest {

    @Test
    void whenCalculateFactorialForFiveThenOneHundredTwenty() {
        int expected = 120;
        int n = 5;
        int out = Factorial.calc(n);
        assertThat(out).isEqualTo(expected);
    }

    @Test
    void whenCalculateFactorialForZeroThenOne() {
        int expected = 1;
        int n = 1;
        int out = Factorial.calc(n);
        assertThat(out).isEqualTo(expected);
    }
}