public class StaticWord {
    public static void main(String [] args) {
        Whyman human1 = new Whyman("Офник", 228);
        Whyman human2 = new Whyman("Забивной", 16);
        Whyman human3 = new Whyman("Нормальный", 25);
        human1.printNumberofPeople();
        human2.printNumberofPeople();
        human3.printNumberofPeople();

        /*
        Whyman.discription = "Е бой";
        human1.getAllFields();
        human2.getAllFields();
        Whyman.discription = "Бой с губой";
        human1.getAllFields();
        human2.getAllFields();
         */
    }
}

class Whyman {

    private String name;
    private int age;
    private static int countPeople;                 //Статическая переменная работающая одна со всеми обьектами класса
    /*
    public static String discription;

     */
    public Whyman(String name, int age){
        this.name = name;
        this.age = age;
        countPeople++;
    }

    public void setName(String name) {this.name = name;}

    public void setAge(int age){ this.age = age;}
/*
    public void getAllFields(){
        System.out.println(name+","+age+","+discription);

 */

    public void printNumberofPeople(){
        System.out.println("Число людей "+countPeople);
    }

}