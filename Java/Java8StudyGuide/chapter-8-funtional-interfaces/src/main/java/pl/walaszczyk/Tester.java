package pl.walaszczyk;

import java.util.logging.Logger;

@FunctionalInterface
interface Tester {

    Logger LOGGER = Logger.getLogger(Tester.class.getName());

    default void showTesterClassName() {
        LOGGER.info(this.getClass().getName());
    }

    boolean testColor(Color color);
}
