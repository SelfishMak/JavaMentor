package CalculatorNew;

import java.util.Scanner;

public class Reader {

        private int numb1;
        private int numb2;
        private char oper;

        public char getOper() {
            return oper;
        }

        public void read () {
//            Массивы для проверки ввода
            String[] arab = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
            String[] rim = {"X", "IX", "VIII", "VII", "VI", "V", "IV", "III", "II", "I"};

            Scanner scanner = new Scanner(System.in);
            String txt = scanner.nextLine();

            txt = txt.substring(0, txt.length() - 1);
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
                    checkArabia (blocks [0], blocks [1], oper);
                }
            }

//          Если введи римские цифры
            for (int j = 0; j < rim.length; j++) {
                if (rim[j].equals(res1) || rim[j].equals(res2)) {
                    checkRim(res1, res2, oper);
                }
            }
        }
//      Запускаем калькулятор для арабских цифр
        public void checkArabia (String arNum1, String arNum2, Character op) {
            ArabCheck.checkAr (arNum1, arNum2, getOper());
        }
//      Запускаем калькулятор римских цифр
        public void checkRim (String rimNum1, String rimNum2, Character op) {
            RimChack.checkRim (rimNum1, rimNum2, getOper());
    }
}


