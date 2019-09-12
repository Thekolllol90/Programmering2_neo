package v36;

import java.util.ArrayList;
import java.util.Arrays;

public class Box {
    public ArrayList<Object> store = new ArrayList<>();

    public Box(Object... items) {
        store.addAll(Arrays.asList(items));
    }
}
