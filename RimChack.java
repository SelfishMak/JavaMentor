package CalculatorNew;

import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;

public class RimChack {

    private String rimnumb1;
    private String rimnumb2;
    private char oper;

    public String getRimnumb1() {
        return rimnumb1;
    }

    public String getRimnumb2() {
        return rimnumb2;
    }

    public char getOper() {
        return oper;
    }

    public static Map<Integer, String> getRim() {
        return rim;
    }

    static Map<Integer, String> rim = new TreeMap<>() {{
        put(1, "I");
        put(2, "II");
        put(3, "III");
        put(4, "IV");
        put(5, "V");
        put(6, "VI");
        put(7, "VII");
        put(8, "VIII");
        put(9, "IX");
        put(10, "X");
        put(20, "XX");
        put(30, "XXX");
        put(40, "XL");
        put(50, "L");
        put(60, "LX");
        put(70, "LXX");
        put(80, "LXXX");
        put(90, "XC");
        put(100, "C");
    }};

    public static void checkRim(String rimNum1, String rimNum2, Character oper) {
        int rimnumb1 = 0;
        int rimnumb2 = 0;

        String rimnum1 = new String(rimNum1);
        String rimnum2 = new String(rimNum2);

        for (Map.Entry entry : rim.entrySet()) {
            if (entry.getValue().equals(rimnum1)) {
                rimnumb1 = (int) entry.getKey();
            }
            if (entry.getValue().equals(rimnum2)) {
                rimnumb2 = (int) entry.getKey();
            }
        }
//        Проверка <= 0 b >10
        if (rimnumb1 <= 0 || rimnumb1 > 10 || rimnumb2 <= 0 || rimnumb2 > 10) {
            throw new IllegalArgumentException("Введено число <= 0 или > 10 ");
        }
//        Вызываем класс Calculat и переводим результат вычисления в римские цифири
        int res1;
        int res2;
        int result = Calculat.calculat(rimnumb1, rimnumb2, oper);

        if (result > 10 && result % 10 != 0) {
            res2 = result % 10;
            res1 = (result / 10) * 10;
            System.out.println(rim.get(res1) + rim.get(res2));

        } else
            System.out.println(rim.get(result));
    }
}
