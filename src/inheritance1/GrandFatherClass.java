package inheritance1;

public class GrandFatherClass {

    static int a = 10; // static variable can be called to static method directly or with class name
    static int b = 20;

    public static void main(String[] args) {
    parentClassMethod(); // static method can be called to main method directly or with class name, because main method is static method
    }

    public static void parentClassMethod(){  // static method
        int c = a+b; // static variable can be called to static method directly or with class name
        System.out.println(c);
    }

}
