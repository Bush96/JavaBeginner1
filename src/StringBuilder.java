import java.util.Locale;

public class StringBuilder {
    public static void main(String [] args) {          //сущ 2 класса строк: изменяемый и неизменяемый.
        /*
        String x = "hello";
        x = x.toUpperCase();                          //эмьютбл обьекты обязательно нужно перемещать в переменные
        System.out.println(x);

         */
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Hello");
        System.out.println(sb.toString());
        sb.append(" my").append(" friend");
        System.out.println(sb.toString());

    }
}
