public class Arrays {
    public static void main(String [] args){
        int number = 10;                 ////примитивный тип данных   /// тут находится просто 10
        int[] numbers = new int[5];             ///numbers --> [массив] ссылочны тип данных, на эту ссылаются
        for (int i = 0; i <numbers.length; i++){          //способо когда данные в массив будем класть потом
            numbers[i] = i*10;
        }
        for (int i = 0; i<numbers.length; i++){
            System.out.println(numbers[i]);
        }
        System.out.println();                         //способо, если данные в массив вносятся сразу
        int[] numbers1 = {1,2,3};
        for (int i = 0; i<numbers1.length; i++){
            System.out.println(numbers1[i]);
        }
        System.out.println();
        int[] numbers2 = {2,6,8};
        for (int i = 2; i<numbers2.length; i++){
            System.out.println(numbers2[i]);
        }
    }
}
