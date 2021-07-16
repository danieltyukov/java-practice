package collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class CollectionDemo {

  public static void show() {
    //we create an array collection which we can verify
    //collections do not support indexing
    Collection<String> collection = new ArrayList<>();
    collection.add("a");
    collection.add("b");
    collection.add("c");

    // Add multiple items in one go
    Collections.addAll(collection, "a", "b", "c");

    var size = collection.size();
    System.out.println(size);

    collection.remove("a");
    var containsA = collection.contains("a");
    System.out.println(containsA);

    collection.clear();
    var isEmpty = collection.isEmpty();
    System.out.println(isEmpty);

    Object[] objectArray = collection.toArray();
    System.out.println(objectArray);
    String[] stringArray = collection.toArray(new String[0]);
    System.out.println(stringArray);

    Collection<String> other = new ArrayList<>();
    other.add("a");
    other.add("b");
    other.add("c");
    //they have different positions in mememory and therefor are not equal
    System.out.println(collection == other);
    System.out.println(collection.equals(other));
  }
}
