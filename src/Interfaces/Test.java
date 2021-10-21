package Interfaces;

public class Test {
    public static void main(String[] args){
        /*
        Info info1 = new Animal(1);                      //такое возможно лишь потому что класс обьеденен с инфо общей строкой
        Info info2 = new Person("Kenny");              //ака - полиморфизм
        info1.showInfo();
        info2.showInfo();
         */
        Animal anima1 = new Animal(1);
        Person person1 = new Person("Ken");
        outputInfo(anima1);
        outputInfo(person1);

    }
    public static void outputInfo(Info info){
        info.showInfo();
    }
}
