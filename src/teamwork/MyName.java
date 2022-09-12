package teamwork;

public class MyName {
    static String myName;

    public static void main(String[]args){
//       String firstname = "Jalpa";
//            String middlename = "Jimil";
        String lastName = "Patel";
//       String myname = "Jalpa";
//       int date = 03;
//       int month = 05;
//       int year = 1983;

        myName = "Jimil";
        System.out.println(myName);
        System.out.println(lastName);

        test1();


//        System.out.println(firstname+ " "+ middlename + " "+lastname);
//        System.out.println("my name is "+ myname);
//        System.out.println("my date of birth is " +date+"/"+month+"/"+ year);
    }


    public static String test1(){
        String lastName = "Patel";
        System.out.println(myName);
        System.out.println(lastName);
        return myName;
    }

}
