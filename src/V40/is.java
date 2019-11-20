package V40;

public class is {
    public is(){}

    public static boolean lastIsOperator(char c) { // om de sista i strängen är en operator
        switch (c){
            case '+':
            case '-':
            case '*':
            case '%':
            case '/':
            case 'r':
                return true;
            default:
                return false;
        }
    }
    public static boolean firstIsOperator(char c) { // om de första är en operator förutom roten ur då de inte funker annars
        switch (c){
            case '+':
            case '-':
            case '*':
            case '%':
            case '/':
                return true;
            default:
                return false;
        }
    }
    public static boolean isDigit2(String text, int current){ // kollar om de är en sifra eller "."
        String a = text;
        int x = current;
        switch (text.charAt(x)){
            case '0':
            case '1':
            case '2':
            case '3':
            case '4':
            case '5':
            case '6':
            case '7':
            case '8':
            case '9':
            case '.':
            case 'E':
                return true;
            default:
                return false;
        }
    }

}
