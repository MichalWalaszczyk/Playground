package pl.walaszczyk;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class RedColorTesterTest {

    static final Tester redColorTester = new RedColorTester();

    @Test
    void shouldReturnTrueForRedColor() {
        final var result = redColorTester.testColor(Color.RED);

        assertTrue(result);
    }

    @ParameterizedTest
    @ValueSource(strings = {"GREEN", "BLUE"})
    void shouldReturnFalseForColorsOtherThanBlue(String color) {
        final var result = redColorTester.testColor(Color.valueOf(color));

        assertFalse(result);
    }
}