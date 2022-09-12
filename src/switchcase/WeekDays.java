package switchcase;

public class WeekDays {

    public static void checkWeekDays (int weekdays) {
        switch (weekdays){
            case 1:
            System.out.println("Monday");
            break;
            case 2:
                System.out.println("Tuesday" );
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
            break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("you have enter invalid day number");
        }
    }

    public static void main(String[] args) {
        for(int i=1;i<8;i++)
        {
            checkWeekDays(i);

        }

    }

}
