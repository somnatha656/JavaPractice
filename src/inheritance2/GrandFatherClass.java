package inheritance2;

public class GrandFatherClass {

    int a = 10;
    int b = 20;

    public void instanceAdditionGF(){
        int c = a+b;
        System.out.println(c);
    }


    public static void staticSubtraction(){ //non static method
        GrandFatherClass object1 = new GrandFatherClass();

        int c = object1.b - object1.a;

        System.out.println(c);

    }



}
