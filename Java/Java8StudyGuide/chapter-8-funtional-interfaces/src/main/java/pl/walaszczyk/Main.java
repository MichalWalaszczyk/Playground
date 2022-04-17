package pl.walaszczyk;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {

    private static final Logger LOGGER = Logger.getLogger(Main.class.getName());

    static final List<Tester> testers;

    static {
        testers = new ArrayList<>();
        testers.add(new GreenColorTester());
        testers.add(new RedColorTester());
        testers.add(new BlueColorTester());
    }

    public static void main(String[] args) {
        LOGGER.info("Test starting...");
        for (Tester tester : testers) {
            tester.showTesterClassName();
            for (Color color : Color.values()) {
                LOGGER.log(Level.INFO, "Result of the test of the {0} color is: {1}", new String[]{
                        color.name(), String.valueOf(tester.testColor(color))
                });
            }
        }
        LOGGER.info("Test ended");
    }
}
