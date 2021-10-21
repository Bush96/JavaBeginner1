import org.w3c.dom.ls.LSOutput;

public class ClassesAndObjects {
    public static void main(String [] args){
         Persons person1 = new Persons();                               //присваивание значения
         person1.setNameAndAge("Рома", 20);
         String s1 = "Вова";
         Persons person2 = new Persons();
         person2.setNameAndAge(s1, 30);
         person1.speak();
         person2.speak();

    }

}

class what{
    //У класса могут быть:
    // 1. Данные (поля)
    // 2. Действия, которые он может совершать (методы)
}

class Persons{
    String name;
    int age;

    void setNameAndAge(String username, int userage){
        name = username;
        age = userage;
    }

    int calculateYearsRetirement(){
        int years = 65-age;
        return years;                                  //вычисление делает тут, возвращает лишь ответ в мэйн
    }

    void speak() {
        for (int i = 0; i < 3; i++) {
            System.out.println("Меня зовут " + name + ",мне " + age + " лет");
        }


        }
    void sayHello() {
        System.out.println("Привет");
    }

}

