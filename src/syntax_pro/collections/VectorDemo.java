package syntax_pro.collections;

import java.util.Vector;

// Vector - устаревший синхронизованный класс для обеспечения доступа в режиме многопоточности.
// Ставит блокировки. В основе - массив Object. Не рекомендован для использования.
public class VectorDemo {
    public static void main(String[] args) {
        Vector<String> vector = new Vector<>();
        vector.add("Misha");
        vector.add("Oleg");
        vector.add("Zaur");
        System.out.println(vector);
        System.out.println(vector.firstElement());
        System.out.println(vector.lastElement());
        vector.remove(2);
        System.out.println(vector.lastElement());
        System.out.println(vector.get(0));
    }
}

