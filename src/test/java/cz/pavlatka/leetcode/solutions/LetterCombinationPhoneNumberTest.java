package cz.pavlatka.leetcode.solutions;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class LetterCombinationPhoneNumberTest {

    LetterCombinationPhoneNumber solver;

    @BeforeEach
    void setUp() {
        solver = new LetterCombinationPhoneNumber();
    }

    @Test
    void test1() {
        var result = solver.solve("");

        Assertions.assertThat(result).isEmpty();
    }

    @Test
    void test2() {
        var result = solver.solve("23");

        Assertions.assertThat(result).hasSize(9);
    }

}