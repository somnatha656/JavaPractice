package ifelse;

public class OysterCardBalance {
    public static void checkBalance(double balance) {
        if (balance<10){
            System.out.println("not enough balance. please top up");
        }
        else{
            System.out.println("Gate will open");
        }

    }

    public static void main(String[] args) {
        checkBalance(15);
        checkBalance(10.05);
        checkBalance(6.00);
        checkBalance(9.99);
        checkBalance(22);
    }


}
