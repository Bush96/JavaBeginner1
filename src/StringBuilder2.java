public class StringBuilder2 {
    public static void main(String [] args) {
        /*
        System.out.print("Hello");                      //текст будет идти в одну строку LN
        System.out.println("Hello again");

         */
        /*
        System.out.printf("This is a string, %s", "NICE");           // %s - вставка строки
        System.out.printf("This is a string, %d", 10);           // %d - вставка цифры
        System.out.printf("%f This is %s a string, %d", 10.5, "HIHI", 1231);        //во.

         */
        System.out.printf("String %10d \n", 540);             //   %10d - ширина окончательного числа, \n - перенос строки
        System.out.printf("String %10d \n", 5);
        System.out.printf("String %10d \n", 54000);
        System.out.printf("String %.2f \n", 43.4456);         // .2 - количество чиел после запятой
    }
}
