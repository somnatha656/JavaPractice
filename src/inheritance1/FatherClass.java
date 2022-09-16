package inheritance1;

public class FatherClass extends GrandFatherClass {  // inheritance of grandfather class, need to use 'extends' keyword

    // class name.variable name
    static int d = GrandFatherClass.a;  // static variable of grandfather class called with class name.variable name

    public static void main(String[] args) {

       // class name.method name
        GrandFatherClass.parentClassMethod();
        System.out.println(d);
    }

    public static void fatherClassMethod(){
        System.out.println("Father Class");
    }

}
