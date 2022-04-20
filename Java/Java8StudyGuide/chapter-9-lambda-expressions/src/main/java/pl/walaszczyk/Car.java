package pl.walaszczyk;


class Car {

    private final int cost;
    private final Color color;

    Car(int cost, Color color) {
        this.cost = cost;
        this.color = color;
    }

    public int getCost() {
        return cost;
    }

    public Color getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "cost=" + cost +
                ", color=" + color +
                '}';
    }
}
