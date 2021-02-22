package CalculatorNew;

public class Calculat {
    public static int calculat(int n1, int n2, char operation){
        int result = 0;

        switch (operation){
            case '+': result = n1 + n2; break;
            case '-': result = n1 - n2; break;
            case '*': result = n1 * n2; break;
            case '/': result = n1 / n2; break;
        }
        return result;
    }
}
