public class Break_Continue_2 {
    public static void main(String [] args){
        for (int i = 0; i<=15; i++){
            if (i%2==0){                            ////оператор процент это остаток при делении, у любого четного это 0
                continue;
            }
            System.out.println("Это нечетное число " +i);
        }
    }
}
