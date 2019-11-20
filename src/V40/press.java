package V40;

import java.util.ArrayList;

public class press {
    public press(){}

    public static ArrayList<Character> pressBack(ArrayList<Character> internalText){ // tar bort de sista i arrayn
        ArrayList<Character> list = internalText;
        if(internalText.size() < 1){
            return list;
        }
        list.remove(list.size() - 1); // tar bort den sista
        return list;
    }
    public static ArrayList<Character> pressC(ArrayList<Character> internalText){ // tömmer hela arrayn
        ArrayList<Character> list = internalText;
        list.clear();
        return list;
    }

}
