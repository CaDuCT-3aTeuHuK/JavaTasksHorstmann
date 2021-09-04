package Chapter1.Task7;

public class Task7 {
    public static void main(String[] args) {
        short firstNumber = (short) 31001;
        short secondNumber = (short) 31000;

        System.out.printf("Сумма: %d + %d = %d\n", firstNumber, secondNumber, (short)(firstNumber+secondNumber));
        System.out.printf("Разность: %d - %d = %d\n", firstNumber, secondNumber, (short)(firstNumber-secondNumber));
        System.out.printf("Произведение: %d * %d = %d\n", firstNumber, secondNumber, firstNumber*secondNumber);
        System.out.printf("Частное: %d / %d = %f\n", firstNumber, secondNumber, ((double)firstNumber/(double)secondNumber));
        System.out.printf("Остаток от деления: %d %% %d = %d\n", firstNumber, secondNumber, (short)(firstNumber%secondNumber));


    }
}
