package Chapter1.Task1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите целочисленное значение:\t");
        int number = scanner.nextInt();

        System.out.println("Введенное число в двоичной системе счисления:\t" + Integer.toBinaryString(number));
        System.out.println("Введенное число в восьмириричной системе счисления:\t" + Integer.toOctalString(number));
        System.out.println("Введенное число в шестнадцатеричной системе счисления:\t" + Integer.toHexString(number));

        double reverse = 1.0/(double)number;

        System.out.println("Обратное шестнадцатеричное число:\t" + Double.toHexString(reverse));
    }
}