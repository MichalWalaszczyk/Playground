package pl.walaszczyk;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class GreenColorTesterTest {

    static final Tester greenColorTester = new GreenColorTester();

    @Test
    void shouldReturnTrueForGreenColor() {
        final var result = greenColorTester.testColor(Color.GREEN);

        assertTrue(result);
    }

    @ParameterizedTest
    @ValueSource(strings = {"RED", "BLUE"})
    void shouldReturnFalseForColorsOtherThanBlue(String color) {
        final var result = greenColorTester.testColor(Color.valueOf(color));

        assertFalse(result);
    }
}