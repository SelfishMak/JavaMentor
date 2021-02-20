package CalculatorNew;

public class Calculat {
    public static int calculat(int numb1, int numb2, char operation){
        int result = 0;

        switch (operation){
            case '+': result = numb1 + numb2; break;
            case '-': result = numb1 - numb2; break;
            case '*': result = numb1 * numb2; break;
            case '/': result = numb1 / numb2; break;
        }
        return result;
    }
}
