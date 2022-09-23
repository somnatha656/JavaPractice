package polymorphism;

public class Overriding2 extends Overriding1 {
    public static void division() {
        int a = 100;
        int b = 10;
        int c = a / b;
        System.out.println(c);

    }

    public static void add (int a, int b){
        int add;
        add = a + b;
        System.out.println(add);
    }

    public static void main(String[] args) {
        division();
        add(10,15);
    }

}

