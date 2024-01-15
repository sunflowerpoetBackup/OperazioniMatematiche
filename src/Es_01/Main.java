package Es_01;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        BigDecimal number1 = new BigDecimal("15.3");
        BigDecimal number2 = new BigDecimal("7.9");

        MathOp operationChoice = MathOp.MAX;

        BigDecimal result = executeOp(number1, number2, operationChoice);
        System.out.println("Imput number 1 : " + number1);
        System.out.println("Imput number 2 : " + number2);
        System.out.println("Operation : " + operationChoice);
        System.out.println("Result : " + result);
    }

    public static BigDecimal executeOp (BigDecimal num1, BigDecimal num2, MathOp opertion) {
        switch (opertion) {
            case SUM:
                return num1.add(num2);
            case SUBTRACTION:
                return num1.subtract(num2);
            case MULTIPLICATION:
                return num1.multiply(num2);
            case DIVISION:
                if (num2.compareTo(BigDecimal.ZERO) == 0) {
                    throw new ArithmeticException("Impossible to divide by zero.");
                }
                return num1.divide(num2);
            case MIN:
                return num1.min(num2);
            case MAX:
                return num1.max(num2);
            default:
                throw new IllegalArgumentException("Invalid operation");
        }
    }
}
