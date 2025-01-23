package collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(); // by default тип object
        list.add("Artem"); // add - добавление элемента для всех List impl классов
        list.add("Olya");
        list.add("Prokofiy");
        System.out.println(list);
        System.out.println(list.size()); // size - размер, capacity - вместимость (при переполнении создаётся новый лист и копируются данные со старого)
        ArrayList<String> listHasStartSize = new ArrayList<>(30); // initial capacity 30, увеличили скорость добавления
        List<String> myList = new ArrayList<>(); // обрезаем возможности до List. Делаем так, если в будущем поменять ArrayList на другую колл impl List.
        ArrayList<String> namesList = new ArrayList<>(list); // создаём namesList на основе list (элементы копируются). Это НОВЫЙ объект.
    }
}
