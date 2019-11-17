package V40;

public class is {
    public is(){}

    public static boolean lastIsOperator(char c) {
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
    public static boolean firstIsOperator(char c) {
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
    public static boolean isDigit2(String text, int current){ // kom på att jag skulle anändt "" på alla tal ja ja koden funkar
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
                return true;
            default:
                return false;
        }
    }

}
