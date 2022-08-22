package pl.limescode.lesson1;

import pl.limescode.lesson1.fruits.Apple;
import pl.limescode.lesson1.fruits.Box;
import pl.limescode.lesson1.fruits.Orange;
import pl.limescode.lesson1.transformation.Transformator;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lesson1 {

    public static void main(String[] args) {
        taskOneTest();
        taskSecondTest();
        taskThirdTest();
    }

    public static void taskOneTest() {
        System.out.println("==== Task 1 ====");
        List<BigDecimal> numbers = new ArrayList<>(List.of(BigDecimal.ZERO, BigDecimal.ONE, BigDecimal.TEN));
        System.out.println(numbers);
        Transformator<BigDecimal> transformator = new Transformator<>();
        transformator.reorderList(numbers, 0, 2);
        System.out.println(numbers);
    }

    public static void taskSecondTest() {
        System.out.println("==== Task 2 ====");
        Integer[] numbers = {0, 5, 8, 10};
        System.out.println("array: " + Arrays.toString(numbers));

        Transformator<Integer> transformator = new Transformator<>();
        List<Integer> list = transformator.arrayToList(numbers);
        System.out.println("list: " + list.toString());
    }

    public static void taskThirdTest() {
        System.out.println("==== Task 3 ====");
        Box<Apple> box1 = new Box(new ArrayList(List.of(new Apple(), new Apple(), new Apple())));
        Box<Orange> box2 = new Box(new ArrayList(List.of(new Orange(), new Orange())));
        System.out.println(box1.compare(box2));
        box2.addFruit(new Orange());
        System.out.println(box1.compare(box2));
        Box<Orange> box3 = new Box(new ArrayList(List.of(new Orange(), new Orange())));
        box2.sprinkleBox(box3);
        System.out.println("box2 size: " + box2.getFruits().size());
        System.out.println("box3 size: " + box3.getFruits().size());
    }

}
