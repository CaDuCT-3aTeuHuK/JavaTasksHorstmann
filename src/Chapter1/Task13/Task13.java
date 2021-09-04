package Chapter1.Task13;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Task13 {
    //Генератор случайных чисел
    final static Random random = new Random();

    public static void main(String[] args) {

        //Создаем и заполняем списочный массив числами от 1 до 49
        ArrayList<Integer> arrayList = new ArrayList<>();
        int count = 49;
        for (int i = 1; i <= count; i++) {
            arrayList.add(i);
        }

        //"Вытаскиваем" из списочного массива 6 победных чисел, удаляя их из исходного списочного массива и добавляя в новый.
        //Поскольку при каждом "вытаскивании" числа исходный массив уменьшается на 1, то на каждой итерации
        //на 1 уменьшается граница генератора случайных чисел
        ArrayList<Integer> lotteryAnswer = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            int randomInt = random.nextInt(count--);
            lotteryAnswer.add(arrayList.remove(randomInt));
        }

        System.out.println("Исходная последовательность без победных чисел: "+arrayList);
        //Сортировка победных чисел
        Collections.sort(lotteryAnswer);
        System.out.println("Победная последовательность чисел: "+lotteryAnswer);
    }
}
