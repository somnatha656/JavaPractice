package inheritance;

public class ParentClass {
    int a = 10;
    int b = 20;
    static int c = 30;
    static int d = 40;

    public void instanceAddition(){ //non static method because it does not have static keyword
        int c = a+b;
        System.out.println(c);
        System.out.println(ParentClass.c + ParentClass.d);
            }
    public static void staticSubtraction(){ //static method because it has static keyword.
        ParentClass obj1 = new ParentClass();
        int e = c + obj1.b;
        System.out.println(e);

    }
    public void instanceMultiplication(){
        int f = a*ParentClass.c;
        System.out.println(f);
    }

    public static void staticDivision(){
        ParentClass object1 = new ParentClass();
        int z = d / object1.b;
        System.out.println(z);

    }
}
