package logical;

public class AddNumbersTo50 {
    public static void main(String[] args) {

        int i;
        int total = 0;

        for (i = 1; i <= 50; i++) {
            total = total + i;
            //System.out.println(total);
        }
        System.out.println(total);

    }
}