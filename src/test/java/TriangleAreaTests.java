import org.assertj.core.api.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.text.DecimalFormat;
import java.util.Formatter;

import static org.junit.jupiter.api.Assertions.*;

class TriangleAreaTests {

    CalculateTriangleArea calculateTriangleArea;

    @BeforeEach
    void setUp() {

        calculateTriangleArea = new CalculateTriangleArea();
    }

    @ParameterizedTest
    @DisplayName("Parameterized positives")
    @CsvSource({"3,4,5", "5,5,6", "2,3,4"})
    void parameterizedTestsPositive(int a, int b, int c) {

        assertTrue(calculateTriangleArea.gerone(a, b, c) > 0);
    }

    @ParameterizedTest
    @DisplayName("Parameterized negatives")
    @CsvSource({"-3,4,5", "5,-5,6", "2,3,-4", "0,0,0"})
    void parameterizedTestsNegative(int a, int b, int c) {
        try {
            calculateTriangleArea.gerone(a, b, c);
            fail("Should have thrown an exception");
        } catch (Exception e) {
            assertTrue(true);
        }
    }

    @Test
    @DisplayName("Positive 6")
    void testPositive() {
        assertEquals(6, calculateTriangleArea.gerone(3, 4, 5),
                "Triangle with sides = 3, 4, 5 should return 6");
    }

    @Test
    @DisplayName("Positive 12")
    void testPositive2() {
        assertEquals(12, calculateTriangleArea.gerone(5, 5, 6),
                "Triangle with sides = 5, 5, 6 should return 12");
    }

    @Test
    @DisplayName("Negative - input error - negative")
    void testNegative() {

        try {
            calculateTriangleArea.gerone(-5, 4, 5);
            fail("Should have thrown an exception");
        } catch (Exception e) {
            assertTrue(true);
        }
    }

    @Test
    @DisplayName("Negative - input error - 0")
    void testNegative2() {

        try {
            calculateTriangleArea.gerone(5, 0, 5);
            fail("Should have thrown an exception");
        } catch (Exception e) {
            assertTrue(true);
        }
    }


}
