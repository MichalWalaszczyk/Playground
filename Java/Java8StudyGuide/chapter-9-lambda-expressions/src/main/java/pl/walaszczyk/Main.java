package pl.walaszczyk;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.logging.Logger;
import java.util.stream.Collectors;

class Main {

    private static final Logger LOGGER = Logger.getLogger(Main.class.getName());
    private static final List<Car> CARS = List.of(new Car(15_000, Color.RED), new Car(16_000, Color.GREEN));

    public static void main(String[] args) {
        helloLambdaWorld();
        printRedCars();
        printExpensiveCars();
    }

    private static void helloLambdaWorld() {
        Runnable runnable = () -> System.out.println("Hello lambda world!");
        runnable.run();
        Consumer<String> stringConsumer = (String s) -> System.out.println(s);
        stringConsumer.accept("Hello string consumer!");
    }

    private static void printRedCars() {
        final CarFilter carColor = car -> Color.RED == car.getColor();
        List<Car> redCars = CARS.stream()
                .filter(car -> carColor.fiter(car))
                .collect(Collectors.toUnmodifiableList());
        LOGGER.info("Red cars: " + redCars);
    }

    private static void printExpensiveCars() {
        final Predicate<Car> carCost = (Car car) -> car.getCost() > 15_000;
        final List<Car> expensiveCars = CARS.stream()
                .filter(carCost)
                .collect(Collectors.toUnmodifiableList());
        LOGGER.info("Cars that costs over 15 000 USD: " + expensiveCars);
    }
}
