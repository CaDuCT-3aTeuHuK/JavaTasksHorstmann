package Chapter1.Task3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите три целочисленных значения");
        System.out.print("Значение 1:\t");
        int firstNumber = scanner.nextInt();
        System.out.print("Значение 2:\t");
        int secondNumber = scanner.nextInt();
        System.out.print("Значение 3:\t");
        int thirdNumber = scanner.nextInt();

        //Решение с помощью использования условной операции
        if (firstNumber>secondNumber && firstNumber>thirdNumber) {
            System.out.println("Наибольшее число:\t"+firstNumber);
        } else if (secondNumber>firstNumber && secondNumber>thirdNumber){
            System.out.println("Наибольшее число:\t"+secondNumber);
        } else System.out.println("Наибольшее число:\t"+thirdNumber);

        //Решение с помощью метода Math.mах()
        System.out.println("Наибольшее число:\t"+Math.max(firstNumber,Math.max(secondNumber,thirdNumber)));
    }
}
