package methodPractice;

public class AssignmentOperator {
    public static int assignmentOpr() {

        int a = 10;
        a+=5;
        return a;
    }
public static void assignOperator1(){
        int a = 20;
        a-=4;
    System.out.println(a);
    System.out.println(a*=5);
    System.out.println(a/=4);
}

    public static void main(String[] args) {
        System.out.println(assignmentOpr());
        assignOperator1();

    }


    }

