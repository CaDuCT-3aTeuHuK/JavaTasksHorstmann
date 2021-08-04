package Chapter1.Task4;

public class Task4 {
    public static void main(String[] args) {

        //Вывод наибольшего положительного значения числа типа double
        System.out.println("Наибольшее положительное значение числа типа double (при использовании Math.nextUp и Double.MAX_VALUE):\t"+Math.nextUp(Double.MAX_VALUE));
        System.out.println("Наибольшее положительное значение числа типа double (при использовании Double.MAX_VALUE):\t\t\t\t"+Double.MAX_VALUE);
        //Вывод наименьшего положительного значения числа типа double
        System.out.println("Наименьшее положительное значение числа типа double (при использовании Math.nextUp):\t\t\t\t\t"+Math.nextUp(0d));
        //Наименьшее положительное значение числа типа double равно значению Double.MIN_VALUE
        System.out.println("Наименьшее положительное значение числа типа double (при использовании Double.MIN_VALUE):\t\t\t\t"+Double.MIN_VALUE);

        //Поиск в цикле наибольшего положительного значения числа типа double с помощью метода Math.nextUp
        double maxDouble=Double.MAX_VALUE-0.00000001;
        while(Double.isInfinite(maxDouble)){
            maxDouble=Math.nextUp(maxDouble);
        }
        System.out.println("Наибольшее положительное значение числа типа double (при использовании Math.nextUp):\t\t\t\t\t"+maxDouble);

    }
}
