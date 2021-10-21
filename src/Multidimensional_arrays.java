public class Multidimensional_arrays {
    public static void main(String [] args){
        int[] number = {1,2,3};
        int[][] matrice = {{1,2,3},
                {4,5,6},
                {7,8,9}};
        System.out.println(matrice[2][2]);             //сперва указываем строку, потом столбец
        System.out.println(matrice[1][0]);

        int[] numbers1 = new int[5];

        String[][] strings = new String[2][3];
        strings[0][1] = "привет";
        System.out.println(strings[0][1]);



}}
