package pl.walaszczyk;

public class RedColorTester implements Tester {

    @Override
    public boolean testColor(Color color) {
        return Color.RED == color;
    }
}
