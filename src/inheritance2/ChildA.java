package inheritance2;

public class ChildA extends FatherClass{

    public static void main(String[] args) {
        GrandFatherClass.staticSubtraction();

        FatherClass object3 = new FatherClass();

        object3.instanceAdditionFC();

    }

}


// this applies to variable and methods//
// instance to instance - direct
// instance to static - by creating object
// static to static - direct or with class name
// static to instance - with class name