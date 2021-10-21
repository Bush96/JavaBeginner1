public class Multidimensional_arrays_2 {
    public static void main(String [] args){
        int[] number = {1,2,3};

        int[][] matrice = {{1,2,3},
                {4,5,6},
                {7,8,9}};
        for(int i = 0; i< matrice.length; i++){                      // matrice.leength - количествопримитивов в матрице
            for(int j = 0; j< matrice[1].length; j++){                       ///matriceх1х.leength -запрашиваем длину строки
                System.out.print(matrice[i][j] + " ");
            }
            System.out.println();
            }
        }
}
