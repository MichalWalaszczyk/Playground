package pl.walaszczyk;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class BlueColorTesterTest {

    static final Tester blueColorTester = new BlueColorTester();

    @Test
    void shouldReturnTrueForBlueColor() {
        final var result = blueColorTester.testColor(Color.BLUE);

        assertTrue(result);
    }

    @ParameterizedTest
    @ValueSource(strings = {"GREEN", "RED"})
    void shouldReturnFalseForColorsOtherThanBlue(String color) {
        final var result = blueColorTester.testColor(Color.valueOf(color));

        assertFalse(result);
    }
}