package polymorphism;

public class Overloading2 {
    public void add(int a, int b) {
        System.out.println(a + b);

    }
    public void add(int a, int b, int c) {
        System.out.println(a + b + c);

    }
    public void add(int a, double b, int c, int d) {
        System.out.println(a + b + c + d);
    }
    public static void main(String[] args) {
        Overloading overloading = new Overloading();
        overloading.multiplication(5, 0.25, 15, 20);
        overloading.multiplication(10, 15, 5);
        overloading.multiplication(20, 10);

    }
}
