package polymorphism;

public class Overloading {
    public void multiplication(int a, int b){
        System.out.println(a*b);

    }
public void multiplication(int a, float b, int c){
    System.out.println(a*b*c);

}
public void multiplication(int a, double b, int c, int d){
    System.out.println(a*b*c*d);
}

    public static void main(String[] args) {
   Overloading overloading = new Overloading();
   overloading.multiplication(5, 0.25 ,15,20);
   overloading.multiplication(10,12.4f, 5);
   overloading.multiplication(20,10);


    }
}
