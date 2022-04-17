package pl.walaszczyk;

public class BlueColorTester implements Tester {

    @Override
    public boolean testColor(Color color) {
        return Color.BLUE == color;
    }
}
