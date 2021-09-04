package Chapter1.Task10;

import java.util.Random;

public class Task10 {
    //Генератор случайных чисел
    final static Random random = new Random();

    public static void main(String[] args) {
        //Присваиваем случайное, неотрицательное число. Единицу вычитаем на случай,
        //если случайно будет сгенерировано минимальное отрицательное число типа long
        //которое по модулю будет на 1 больше, чем максимальное положительное число типа long
        long randomLong = Math.abs(random.nextLong()-1);
        System.out.println("Случайно сгенерированное число типа long: " + randomLong);
        //Выполняем деление по основанию 36 для генерации символьной строки,
        //где числа от 0 до 9 будут числами, а от 10 до 36 - символами английского алфавита
        //от "a" до "z"
        StringBuilder randomString = new StringBuilder();
        while (randomLong > 0) {
            if (randomLong % 36 <= 9) {
                randomString.append(randomLong % 36);
            } else {
                randomString.append((char) (randomLong % 36 + 55));
            }
            randomLong /= 36;
        }
        //Поскольку первые вычисленные символы должны быть в конце, то выполняем вызов
        //метода reverse, который "перевернет" символы строки с начала в конец
        System.out.println("Произвольная символьная строка из цифр и букв: "+randomString.reverse());
    }
}
