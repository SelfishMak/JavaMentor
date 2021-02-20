package CalculatorNew;

public class ArabCheck {


    public static void checkAr(String arNum1, String arNum2, Character oper) {
//        Переводим строки в Integer

        int arnumb1 = Integer.parseInt(arNum1);
        int arnumb2 = Integer.parseInt(arNum2);

//        Проверка <= 0 b >10
        if (arnumb1 <= 0 || arnumb1 > 10 || arnumb2 <= 0 || arnumb2 > 10) {
            throw new IllegalArgumentException("Введено число <= 0 или > 10 ");
        }
//        Вызываем класс Calculat
        int result = Calculat.calculat(arnumb1, arnumb2, oper);
        System.out.println(result);
    }
}
