package Chapter1.Task5;

public class Task5 {
    public static void main(String[] args) {
        double moreThanInteger=100000000000000000d;
        int testTranslation = (int)moreThanInteger;
        System.out.println("Перевод числа 100000000000000000 типа double в тип int дает следующий результат:\t"+testTranslation);
        testTranslation = (int)2000000000000d;
        System.out.println("Перевод числа 2000000000000 типа double в тип int дает следующий результат:\t\t\t"+testTranslation);
        //Принятие типом int максимального значения в данных случаях вызвано его переполнением и невозможностью принять большее значение

        testTranslation=testTranslation+5000;
        System.out.println("При добавлении к максимальному значению типа int числа (например, 5000) получен следующий результат:\t"+testTranslation);
        //При добавлении к уже максимальному 32-битовому числу в двоичной системе нового значения его 31 бит примет значения "0"
        // (32-й бит является признаком отрицателности числа) и соответственно отсчет продолжится с минимального отрицательного числа int + добавляемое число


        //Для наглядности того, как в двоичной системе выглядят минимальное и максимальное значение типа int
        System.out.println("Минимальное значение типа int в двоичной системе:\t"+Integer.toBinaryString(Integer.MIN_VALUE));
        System.out.println("Максимальное значение типа int в двоичной системе:\t"+Integer.toBinaryString(Integer.MAX_VALUE));
    }
}
