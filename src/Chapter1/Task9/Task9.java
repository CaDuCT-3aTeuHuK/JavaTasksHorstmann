package Chapter1.Task9;

public class Task9 {
    public static void main(String[] args) {        
        //Пример с использованием new. Явно создаем новый объект, ссылка на который каждый раз будет новой
        String firstString = new String("Говно");
        String secondString = new String("Говно");
        String thirdString = new String(firstString);

        System.out.println("Пример 1:\nПроверки созданных с помощью new строк, используя \"==\":");
        //Из-за того, что с помощью "==" проверяются ссылки на объекты, а не их содержимое, то все выводы будут false
        System.out.println(firstString==secondString);
        System.out.println(firstString==thirdString);
        System.out.println(secondString==thirdString);

        System.out.println("Проверки с помощью метода equals:");
        //Метод equals проверяет содержимое объектов, поскольку они равны, то все выводы будут true
        System.out.println(firstString.equals(secondString));
        System.out.println(firstString.equals(thirdString));
        System.out.println(secondString.equals(thirdString));

        System.out.println("Пример 2:\nПроверки, созданных в результате сплита, строк, используя \"==\":");
        String splitString = "Говно Говно";
        //Из-за того, что с помощью "==" проверяются ссылки на объекты, а не их содержимое, то все выводы будут false
        String[] masString = splitString.split(" ");
        System.out.println(masString[0]==masString[1]);

        System.out.println("Проверки с помощью метода equals:");
        //Метод equals проверяет содержимое объектов, поскольку они равны, то все выводы будут true
        System.out.println(masString[0].equalsIgnoreCase(masString[1]));
    }
}
