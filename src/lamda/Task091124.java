package lamda;
import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

import java.util.function.UnaryOperator;

public class Task091124 {
    public static void main(String[] args) {
        UnaryOperator<String> operator = (str) -> {
            return str.toUpperCase().charAt(0)+str.substring(1).toLowerCase();
        };
        String str = "hELLO";
        String result = operator.apply(str);
        System.out.println(result);

        BinaryOperator<Integer> operator1 = (num1, num2) -> {
            if (num1>num2) {
                return  num1;
            }
            else return num2;
        };
        int max = operator1.apply(5, 6);
        System.out.println(max);
    }


}

