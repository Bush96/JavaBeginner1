public class Konstructor {
    public static void main(String[] args){
        Whoman human1 = new Whoman();                      //вызывается тот конструктор, чьи параметры ты в него вложишь
    }                                                      //на этом примере ничего не вложив выбирается 1ый котструктор
}                                                          //введи мы возраст и имя - вызвался бы 3ий конструктор

class Whoman {

    private String name;
    private int age;

    public Whoman(){
        this.name = "Имя по умолчанию";
        this.age = 0;
    }

    public Whoman(String name){
        System.out.println("Привет из второго контруктора!");
        this.name = name;
    }

    public Whoman(String name, int age){
        System.out.println("Привет из третьего конструктора1");
        this.name = name;
        this.age = age;

    }

    public void setName(String name){ this.name = name; }

    public void setAge(int age){ this.age = age; }

}