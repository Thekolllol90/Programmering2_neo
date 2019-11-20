package V40;

import java.util.ArrayList;

public class check {
    public check(){}

        public static ArrayList<Character> checkLast(ArrayList<Character> internalText){ // kollar så att man inte lägger in fler operatorer i rad
            is is = new is();
            ArrayList<Character> list = internalText;
            if(list.size() >= 2) {
                char first = list.get(list.size() - 1);
                char last = list.get(list.size() - 2);
                if(is.lastIsOperator(first) && is.lastIsOperator(last)) { //kollar om sista och den innan sista är båda operatorer
                    list.remove(list.size() - 1); // tar bort den sista om de är sant
                }
            }
            return list;
        }
        public static ArrayList<Character> checkFirst(ArrayList<Character> internalText){ // kollar så de första man lägger in inte är en operator
            ArrayList<Character> list = internalText;
            if(list.size() == 1){ // om längden på listan bara är 1
                char first = list.get(list.size() - 1);
                if(is.firstIsOperator(first)){ // om den första är en operator
                    list.remove(list.size() - 1); // tar bort den
                }
            }
            return list;
        }
}
