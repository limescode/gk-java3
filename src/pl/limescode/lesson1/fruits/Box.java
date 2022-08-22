package pl.limescode.lesson1.fruits;

import java.util.ArrayList;
import java.util.List;

public class Box<F extends Fruit> {
    private List<F> fruits;

    public Box(List<F> fruits) {
        this.fruits = fruits;
    }

    public void addFruit(F fruit) {
        fruits.add(fruit);
    }

    public void sprinkleBox(Box<F> otherBox) {
        fruits.addAll(otherBox.getFruits());
        otherBox.setFruits(new ArrayList<>());
    }

    public double getWeight() {
        if (fruits.isEmpty())
            return 0;
        double weight = fruits.get(0).getWeight();
        return weight * fruits.size();
    }

    public boolean compare(Box otherBox) {
        return Double.compare(this.getWeight(), otherBox.getWeight()) == 0;
    }

    public List<F> getFruits() {
        return fruits;
    }

    public void setFruits(List<F> fruits) {
        this.fruits = fruits;
    }
}
