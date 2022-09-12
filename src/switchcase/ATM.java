package switchcase;

public class ATM {
    public static void checkBalance(int Balance) {
        switch (Balance) {
            case 1:
                System.out.println("Available Balance");
                break;
            case 2:
                System.out.println("Deposit Money");
                break;
            case 3:
                System.out.println("Withdraw Money");
                break;
            default:
                System.out.println("Wrong number");
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i <= 3; i++)

            checkBalance(i);


    }
}