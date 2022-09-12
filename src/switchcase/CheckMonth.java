package switchcase;

public class CheckMonth {
    public static void checkMonth(String months) {
        switch (months) {
            case "One":
                System.out.println("January");
                break;
            case "Two":
                System.out.println("February");
                break;
            case "Three":
                System.out.println("March");
                break;
            case "Four":
                System.out.println("April");
                break;
            case "Five":
                System.out.println("May");
                break;
            case "Six":
                System.out.println("June");
                break;
            case "Seven":
                System.out.println("July");
                break;
            case "Eight":
                System.out.println("August");
                break;
            case "Nine":
                System.out.println("September");
                break;
            case "Ten":
                System.out.println("October");
                break;
            case "Elevan":
                System.out.println("November");
                break;
            case "Twelve":
                System.out.println("December");
                break;

        }

    }

    public static void main(String[] args) {
        checkMonth("Four");
        checkMonth("One");
        checkMonth("Two");
        checkMonth("Seven");
        checkMonth("Five");
        checkMonth("Elevan");
        checkMonth("Six");
        checkMonth("Twelve");


    }
}