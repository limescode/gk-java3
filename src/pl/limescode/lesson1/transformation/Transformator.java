package pl.limescode.lesson1.transformation;

import java.util.List;

public class Transformator<T> {

    public void reorderList(List<T> list, int indexNumberX, int indexNumberY) {
        try {
            if (list.isEmpty() || list.size() < indexNumberX - 1 || list.size() < indexNumberY - 1) {
                return;
            }
            T xValue = list.get(indexNumberX);
            T yValue = list.get(indexNumberY);
            list.set(indexNumberX, yValue);
            list.set(indexNumberY, xValue);
        } catch (UnsupportedOperationException e) {
            System.out.println("Collection must be muttable!");
            e.printStackTrace();
        }
    }

    public List<T> arrayToList(T[] array) {
        return List.of(array);
    }

}
