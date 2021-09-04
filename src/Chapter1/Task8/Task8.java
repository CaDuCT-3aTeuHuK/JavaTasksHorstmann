package Chapter1.Task8;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        //Ввод исходной строки
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строку:\t");
        String str = scanner.nextLine();

        //Вывод всех непустых подстрок, вариант 1
        System.out.println("Все непустые подстроки, вариант 1:");
        String[] masStr = str.split(" ");
        for (String strOut : masStr
        ) {
            if (!"".equals(strOut)) {
                System.out.println(strOut);
            }
        }

        //Вывод всех непустых подстрок, вариант 2
        System.out.println("Все непустые подстроки, вариант 2:");
        for (String strOut : masStr
        ) {
            if (!strOut.isEmpty()) {
                System.out.println(strOut);
            }
        }
    }
}
