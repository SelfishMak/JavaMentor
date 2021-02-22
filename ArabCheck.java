package CalculatorNew;


public class ArabCheck {

    private int arnumb1;
    private int arnumb2;
    private char oper;

    public ArabCheck(int arnumb1, int arnumb2, char oper) {
        this.arnumb1 = arnumb1;
        this.arnumb2 = arnumb2;
        this.oper = oper;
    }

    public int getArnumb1() {
        return arnumb1;
    }

    public int getArnumb2() {
        return arnumb2;
    }

    public char getOper() {
        return oper;
    }

    public static void checkAr(int arNum1, int arNum2, Character oper) {
//        Переводим строки в Integer

        int arnumb1 = arNum1;
        int arnumb2 = arNum2;

//        Проверка <= 0 b >10
        if (arnumb1 <= 0 || arnumb1 > 10 || arnumb2 <= 0 || arnumb2 > 10) {
            throw new IllegalArgumentException("Введено число <= 0 или > 10 ");
        }
//        Вызываем класс Calculat
        int result = Calculat.calculat(arnumb1, arnumb2, oper);
        System.out.println(result);
    }
}
