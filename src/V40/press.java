package V40;

import java.util.ArrayList;

public class press {
    public press(){}

    public static ArrayList<Character> pressBack(ArrayList<Character> internalText){
        ArrayList<Character> list = internalText;
        list.remove(list.size() - 1);
        return list;
    }
    public static ArrayList<Character> pressC(ArrayList<Character> internalText){
        ArrayList<Character> list = internalText;
        list.clear();
        return list;
    }

}
