public class Incapsulation {
    public static void main(String [] args){
        Person person1 = new Person();
        Person person2 = new Person();
        person1.setName("Карл");
        person1.setAge(15);
        System.out.println("Выводим значение в мэйн методе: "+person1.getName());
        System.out.println("Выводим значение в мэйн методе: "+person1.getAge());

    }
}

class Person{
    private String name;                //прайвит значит что это поле доступно только в этом классе
    private int age;


    public void setName(String username){
        if (username.isEmpty()) {                                    //проверят ввели ли чтото
            System.out.println("Ты ввел пустое имя");
        } else{
        name = username;
    }}
    public String getName(){
        return name;
    }


    public void setAge(int userAge){
        if (userAge<0){
            System.out.println("Ошибка");}
        else{

        age = userAge;}
    }
    public int getAge(){
        return age;
    }




    int calculateYearsRetirement(){
        int years = 65-age;
        return years;                                  //вычисление делает тут, возвращает лишь ответ в мэйн
    }

    void speak() {
        for (int i = 0; i < 3; i++) {
            System.out.println("Меня зовут " + name + ",мне " + age + " лет");
        }

}}
