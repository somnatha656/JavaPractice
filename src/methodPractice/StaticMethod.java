package methodPractice;

public class StaticMethod {

    public static class StaticThreeMethod {

        public static void add() { //static void method
            int a = 10;
            int b = 12;
            int c = a + b;
            System.out.println(c);

        }

        public static int multiplication() { //static return method
            int a = 8;
            int b = 10;
            int c = a * b;
            return c;

        }

        public static String printMyName() {
            String myName = "Jalpa";
            return myName;
        }

        public static boolean answerType() {// static return method
            boolean b = true;
            return b;


        }
    public static void addTwoNumber(int a, int b){ //parameter method
            int c = a + b;
        System.out.println(c);
    }

        public static void main(String[] args) {
            add();
            int d = multiplication();
            System.out.println(multiplication());
            System.out.println(d);
            System.out.println(printMyName());
            System.out.println(answerType());
            addTwoNumber( 800,900);



        }

    }
}
