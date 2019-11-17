package V40;

import java.util.ArrayList;

public class check {
    public check(){}

        public static ArrayList<Character> checkLast(ArrayList<Character> internalText){
            is is = new is();
            ArrayList<Character> list = internalText;
            if(list.size() >= 2) {
                char first = list.get(list.size() - 1);
                char last = list.get(list.size() - 2);
                if(is.lastIsOperator(first) && is.lastIsOperator(last)) {
                    list.remove(list.size() - 1);
                }
            }
            return list;
        }
        public static ArrayList<Character> checkFirst(ArrayList<Character> internalText){
            ArrayList<Character> list = internalText;
            if(list.size() == 1){
                char first = list.get(list.size() - 1);
                if(is.firstIsOperator(first)){
                    list.remove(list.size() - 1);
                }
            }
            return list;
        }
}
