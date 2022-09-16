package inheritance2;

public class FatherClass extends GrandFatherClass {

    int a = 10;
    int b = 20;

    public static void main(String[] args) {
        GrandFatherClass object2 = new GrandFatherClass();
        object2.instanceAdditionGF();
        GrandFatherClass.staticSubtraction();
    }

    public void instanceAdditionFC(){
        int c = a+b;
        System.out.println(c);
    }

}
