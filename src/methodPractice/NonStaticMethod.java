package methodPractice;

public class NonStaticMethod {

        public void sum() { //nonstatic void method
            int a = 10;
            int b = 12;
            int c = a + b;
            System.out.println(c);

        }
public int division(){ //nonstatic return method
            int a = 10;
            int b = 5 ;
            int c = a/b;
    return c;

}
public void calculation (int a, int b, int c){ //nonstatic parameter method
            int d = a*b%c;
    System.out.println(d);


    }
    public static void main(String[] args) {
        NonStaticMethod x = new NonStaticMethod();
        x.sum();
        NonStaticMethod y = new NonStaticMethod();
        y.division();
        System.out.println(y.division());
        NonStaticMethod z = new NonStaticMethod();
        z.calculation(500,600,700);

    }
           }


