package cz.pavlatka.practice;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MinimumWindowSubstringTest {
    
    MinimumWindowSubstring solver;
    
    @BeforeEach
    void setUp() {
        solver = new MinimumWindowSubstring();
    }

    @Test
    void test1() {
        var result = solver.solve("ADOBECODEBANC", "ABC");
        
        assertThat(result).isEqualTo("BANC");
    }

}