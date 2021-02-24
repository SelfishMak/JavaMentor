package CalculatorNew;

import java.util.Scanner;

public class Reader {

    private int arnumb1;
    private int arnumb2;
    private String rimnumb1;
    private String rimnumb2;
    private char oper;

    public Reader() {
        this.arnumb1 = arnumb1;
        this.arnumb2 = arnumb2;
        this.rimnumb1 = rimnumb1;
        this.rimnumb2 = rimnumb2;
        this.oper = oper;
    }

    public int getNumb1() {
        return arnumb1;
    }

    public int getNumb2() {
        return arnumb2;
    }

    public String getRimnumb1() {
        return rimnumb1;
    }

    public String getRimnumb2() {
        return rimnumb2;
    }

    public char getOper() {
        return oper;
    }

        public void read () {
//            Массивы для проверки ввода
            String[] arab = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
            String[] rim = {"X", "IX", "VIII", "VII", "VI", "V", "IV", "III", "II", "I"};

            Scanner scanner = new Scanner(System.in);
            String txt = scanner.nextLine();

            txt = txt.substring(0, txt.length() - 0);
            String[] blocks = txt.split("[+-/*]");
            oper = txt.charAt(blocks[0].length());

            String str1 = new String(blocks [0]);
            String str2 = new String(blocks [1]);

//          Переводим строки в верхний регистр
            String res1 = str1.toUpperCase();
            String res2 = str2.toUpperCase();

//          Определяем, какие данные были введены.
//          Если ввели арабские цифры

            for (int i = 0; i < arab.length; i++) {
                if (arab[i].equals(blocks[0]) || arab[i].equals(blocks[1])) {
                    arnumb1 = Integer.parseInt(blocks[0]);
                    arnumb2 = Integer.parseInt(blocks[1]);
                }
            }
            if (arnumb1 > 0 || arnumb2 > 0) {
                checkArabia ();
            }

//          Если введи римские цифры
            for (int j = 0; j < rim.length; j++) {
                if (rim[j].equals(res1) || rim[j].equals(res2)) {
                    rimnumb1 = res1;
                    rimnumb2 = res2;
                }
            }

            if (rimnumb1 != null || rimnumb2 !=null) {
                checkRim();
            }
        }
//      Запускаем калькулятор для арабских цифр
        public void checkArabia () {
            ArabCheck.checkAr (getNumb1(), getNumb2(), getOper());
        }
//      Запускаем калькулятор римских цифр
        public void checkRim () {
            RimChack.checkRim (getRimnumb1(), getRimnumb2(), getOper());
    }
}


