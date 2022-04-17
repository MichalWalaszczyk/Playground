package pl.walaszczyk;

class GreenColorTester implements Tester {

    @Override
    public boolean testColor(Color color) {
        return Color.GREEN == color;
    }
}
