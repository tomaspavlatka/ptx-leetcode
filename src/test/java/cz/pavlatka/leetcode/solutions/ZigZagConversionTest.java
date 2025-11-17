package cz.pavlatka.leetcode.solutions;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class ZigZagConversionTest {

    ZigZagConversion solver;

    @BeforeEach
    void setUp() {
        solver = new ZigZagConversion();
    }

    @Test
    void test1() {
        var result = solver.solve("PAYPALISHIRING", 3);

        assertThat(result).isEqualTo("PAHNAPLSIIGYIR");
    }

    @Test
    void test2() {
        var result = solver.solve("PAYPALISHIRING", 4);

        assertThat(result).isEqualTo("PINALSIGYAHRPI");
    }

    @Test
    void test3() {
        var result = solver.solve("A", 1);

        assertThat(result).isEqualTo("A");
    }

}