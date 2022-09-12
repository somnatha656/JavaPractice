package ifelse;

public class LeapYear {
    public static void checkLeapYear(int year)
    {
        if (year%4==0) {
            System.out.println(year + "is leap year");
        }
        else
                System.out.println( year + "is not Leap Year");

            }

    public static void main(String[] args) {
        checkLeapYear(1685);
        checkLeapYear(1456);
        checkLeapYear(2000);
        checkLeapYear(1988);
        checkLeapYear(1350);
        checkLeapYear(2045);

    }
        }

