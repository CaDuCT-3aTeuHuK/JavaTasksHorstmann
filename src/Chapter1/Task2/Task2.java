package Chapter1.Task2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите целочисленное значение (как положительное, так и отрицательное):\t");
        int degreeOfAngle = scanner.nextInt();

        System.out.println("Нормализация с использованием %:\t"+(degreeOfAngle%360+360)%360); //Если использовать просто degreeOfAngle%360, то при вводе отрицательного угла, значения выводятся неверно
        System.out.println("Нормализация с использованием мтеода Math.floorMod:\t"+Math.floorMod(degreeOfAngle, 360));
    }
}
