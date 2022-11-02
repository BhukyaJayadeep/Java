import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class ArrayListFruit {
    public static void main(String[] args) {
        List<String> fruitNames = new ArrayList<>();
        fruitNames.add("Banana");
        fruitNames.add("Apple");
        fruitNames.add("PineApple");
        fruitNames.add("Watermelon");
        fruitNames.add("Strawberry");
        fruitNames.add("Kiwi");
        System.out.println("Initial List: " + fruitNames);

        // Remove the element at index `5`
        fruitNames.remove(5);
        System.out.println("After remove(5): " + fruitNames);
        // Remove the first occurrence of the given element from the ArrayList
// (The remove() method returns false if the element does not exist in the ArrayList)
        boolean isRemoved = fruitNames.remove("Kiwi");
        System.out.println("After remove(\"Kiwi\"): " + fruitNames);
        // Remove all the elements that exist in a given collection
        List<String> newListFruitName = new ArrayList<>();
        newListFruitName.add("Apple");
        newListFruitName.add("PineApple");
        newListFruitName.add("Watermelon");

        fruitNames.removeAll(newListFruitName);
        System.out.println("After removeAll(newListFruitName): " + fruitNames);

        // Remove all the elements that satisfy the given predicate
        fruitNames.removeIf(new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.startsWith("Banana");
            }
        });
        System.out.println("After Removing all elements that start with \"Banana\": " + fruitNames);
        // Remove all elements from the ArrayList
        fruitNames.clear();
        System.out.println("After clear(): " + fruitNames);
    }
}
// I am first inserting elements into the ArrayList and then deleting the elements from the list