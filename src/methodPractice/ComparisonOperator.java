package methodPractice;

public class ComparisonOperator {


    public static void comparisonOperator() {
        int a = 20;
        int b = 20;
        boolean c = a == b;
        System.out.println(a + " equal to " + b + " is " + c);
        c = a > b;
        System.out.println(a + " is greater than " + b + " is " + c);
        c = a != b;
        System.out.println(a + " is not equal to " + b + " is " + c);

        a += 3;
        b -= 3;
        c = a < b;
        System.out.println(a + " is less than " + b + " is " + c);
        c = a > b;
        System.out.println(a + " is greater than " + b + " is " + c);
        c = a != b;
        System.out.println(a + " is not equal to " + b + " is " + c);
    }

    public static void main(String[] args) {
        comparisonOperator();


    }


}


