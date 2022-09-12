package stringMethod;

public class StringOperations {
    public static void main(String[] args) {
                    String myName = "Jalpa";
                    String middleName = "Jimil";
                    String lastName = "Patel";
                    String dateofBirth = "03/05/1983";
                    StringBuffer x = new StringBuffer(myName);
                    StringBuffer y = new StringBuffer(dateofBirth);

        System.out.println("myName's reverse: " + x.reverse());
        System.out.println("dateofbirth's reverse:" +y.reverse());
        int mlength= myName.length();
        int llengh= lastName.length();
        int mmlength= middleName.length();

        System.out.println(myName+"has" + mlength + "characters");
        System.out.println(lastName+"has" + mlength + "characters");
        System.out.println( middleName+"has" + mlength + "characters");
        System.out.println(myName.toUpperCase());
        System.out.println(lastName.toLowerCase());
        System.out.println(myName.replaceAll(myName, lastName));
        System.out.println(lastName.replaceAll(lastName, myName));

        System.out.println(middleName.contains("i"));
        System.out.println(lastName.contains("q"));

















    }
}
