package V40;

public class calc {
    public calc(){}

    public static double calculate(String numbers){
        int index = 0;
        double left = 0;
        double right = 0;

        while(index < numbers.length()) {

            if(Character.isDigit(numbers.charAt(index))) {
                double[] values = getDouble(numbers, index);
                left  = values[0];
                index = (int) values[1];
            } else {
                switch(numbers.charAt(index)) {
                    case '+': {
                        index++;
                        double [] val = plus(index, left, right, numbers);
                        left = val[0];
                        index = (int) val[1];
                    } break;

                    case '*': {
                        index++;
                        double [] val = multi(index, left, right, numbers);
                        left = val[0];
                        index = (int) val[1];
                    } break;

                    case '-': {
                        index++;
                        double [] val = minus(index, left, right, numbers);
                        left = val[0];
                        index = (int) val[1];
                    } break;

                    case '/': {
                        index++;
                        double [] val = div(index, left, right, numbers);
                        left = val[0];
                        index = (int) val[1];
                    } break;

                    case '%': {
                        index++;
                        double [] val = mod(index, left, right, numbers);
                        left = val[0];
                        index = (int) val[1];
                    } break;

                    case 'r': {
                        index++;
                        double [] val = rot(index, left, right, numbers);
                        left = val[0];
                        index = (int) val[1];
                    } break;
                }
            }
        }

        return left;
    }

    public static double[] plus(int index, double left, double right, String numbers){
        double[] values = getDouble(numbers, index);
        right = values[0];
        double res = left + right;
        index = (int) values[1];
        double[] value = {res, index};

        return value;
    }
    public static double[] multi(int index, double left, double right, String numbers) {
        double[] values = getDouble(numbers, index);
        right = values[0];
        double res = left * right;
        index = (int) values[1];
        double[] value = {res, index};

        return value;
    }
    public static double[] minus(int index, double left, double right, String numbers) {
        double[] values = getDouble(numbers, index);
        right = values[0];
        double res = left - right;
        index = (int) values[1];
        double[] value = {res, index};

        return value;
    }
    public static double[] div(int index, double left, double right, String numbers) {
        double[] values = getDouble(numbers, index);
        right = values[0];
        double res = left / right;
        index = (int) values[1];
        double[] value = {res, index};

        return value;
    }
    public static double[] mod(int index, double left, double right, String numbers) {
        double[] values = getDouble(numbers, index);
        right = values[0];
        double res = left % right;
        index = (int) values[1];
        double[] value = {res, index};

        return value;
    }
    public static double[] rot(int index, double left, double right, String numbers) {
        double[] values = getDouble(numbers, index);
        right = values[0];
        double res = Math.sqrt(right);
        index = (int) values[1];
        double[] value = {res, index};

        return value;
    }

    public static double[] getDouble(String text, int start) {
        int current = start;

        while(current < text.length() && is.isDigit2(text, current)) {
            current++;
        }

        double value = Double.parseDouble(text.substring(start, current));

        return new double[] { value, current };
    }
}
