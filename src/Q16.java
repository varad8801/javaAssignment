

import java.math.BigDecimal;

public class Q16 {
    public static void main(String[] args) {
        float floatResult = 1.0f / 3;
        double doubleResult = 1.0 / 3;

        BigDecimal bd1 = new BigDecimal("1.0");
        BigDecimal bd3 = new BigDecimal("3");
        BigDecimal bigDecimalResult = bd1.divide(bd3, 10, BigDecimal.ROUND_HALF_EVEN);

        System.out.println("Using float: " + floatResult);
        System.out.println("Using double: " + doubleResult);
        System.out.println("Using BigDecimal: " + bigDecimalResult);
    }
}
