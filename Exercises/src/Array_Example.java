import java.util.*;

public class Array_Example {
    public static void main(String[] args) {

        String[] geese = {"African", "Roman Tufted", "Toulouse", "Pilgrim", "Steinbachert"};
        String[] example = {"Mallard", "Hook Bill", "African", "Crested", "Pilgrim", "Toulouse", "Blue Swedish"};

        List<String> exampleList = new ArrayList<>(Arrays.asList(example));
        List<String> geeseList = new ArrayList<>(Arrays.asList(geese));

        exampleList.removeAll(geeseList);
        System.out.println(exampleList);

    }
}
