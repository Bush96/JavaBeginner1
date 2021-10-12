import java.util.Scanner;

public class Input {
    public static void main(String [] args){
        Scanner s = new Scanner(System.in);     ///пока неясная строка
        System.out.println("Напиши что-нибудь, дружок");

        int x = s.nextInt();             ///чтобы числа
        String string = s.nextLine();         ///чтобы буквы
        System.out.println("вроде ввел "+x);
    }
}
