package traversinglist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Main {
    class ForLoop {
        public void handle(){
            List<String> list = new ArrayList<>();
            list.add("Apple");
            list.add("Banana");
            list.add("Cherry");

            // Traverse using a for-loop
            for (int i = 0; i < list.size(); i++) {
                System.out.println(list.get(i));
            }
        }
    }

    class EnhancedForLoop {
        public void handle(){
            List<String> list = new ArrayList<>();
            list.add("Apple");
            list.add("Banana");
            list.add("Cherry");

            // Traverse using an enhanced for-loop
            for (String fruit : list) {
                System.out.println(fruit);
            }
        }
    }

    class IteratorItems {
        public void handle(){
            List<String> list = new ArrayList<>();
            list.add("Apple");
            list.add("Banana");
            list.add("Cherry");

            // Traverse using an Iterator
            Iterator<String> iterator = list.iterator();
            while (iterator.hasNext()) {
                String fruit = iterator.next();
                System.out.println(fruit);
            }
        }
    }

    class ListIteratorItems {
        public void handle(){
            List<String> list = new ArrayList<>();
            list.add("Apple");
            list.add("Banana");
            list.add("Cherry");

            // Traverse using a ListIterator (forward direction)
            ListIterator<String> listIterator = list.listIterator();
            while (listIterator.hasNext()) {
                String fruit = listIterator.next();
                System.out.println(fruit);
            }

            // Traverse using a ListIterator (backward direction)
            while (listIterator.hasPrevious()) {
                String fruit = listIterator.previous();
                System.out.println(fruit);
            }
        }
    }

    class ForEachLambdaExpression {
        public void handle(){
            List<String> list = new ArrayList<>();
            list.add("Apple");
            list.add("Banana");
            list.add("Cherry");

            // Traverse using forEach and lambda expression
            list.forEach(fruit -> System.out.println(fruit));

            // Traverse using method reference
            list.forEach(System.out::println);
        }
    }

    public static void main(String[] args) {
        Main main = new Main();
        ForLoop forLoop = main. new ForLoop();
        EnhancedForLoop enhancedForLoop = main. new EnhancedForLoop();
        IteratorItems iteratorItems = main. new IteratorItems();
        ListIteratorItems listIteratorItems = main. new ListIteratorItems();
        ForEachLambdaExpression forEachLambdaExpression = main. new ForEachLambdaExpression();

        forLoop.handle();
        enhancedForLoop.handle();
        iteratorItems.handle();
        listIteratorItems.handle();
        forEachLambdaExpression.handle();
    }
}
