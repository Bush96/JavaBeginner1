public class Dog extends Animal {                //extends - означает наследование, расширение последующего класса
    public void bark(){
        System.out.println("I am burking");
    }
    public void eat(){                           //когда мы пишем метод с той же сигнатурой что и у родителей EAT то работать будет метод из класса extends
        System.out.println("Dog is eating");
    }

}
