package V40;

import java.util.ArrayList;

public class string {
    public string(){}
    public static String arrayListToString(ArrayList<Character> internalText){ // gör om en array till en string
        String res = "";
        for(int i = 0; i < internalText.size(); i++){
            res = res + internalText.get(i);
        }
        return res;
    }

}
