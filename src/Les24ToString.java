import javax.lang.model.element.NestingKind;

public class Les24ToString {
    public static void main(String [] args) {
        Humana h1 = new Humana("Bob", 24);
        System.out.println(h1);
    }
}
class Humana {
    private String name;
    private int age;

    public Humana(String name, int age){
        this.name = name;
        this.age =age;
    }

    public String toString(){                 //так определяем тот метод в котором обьект будет представляться в виде стрки, по дефолту присваивается рандомное значение
        return name+","+age;
    }

}
