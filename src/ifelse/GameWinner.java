package ifelse;

public class GameWinner {
    public static void announceWinnerPlayer( int x, int y, int z) {
        if (x > y && x > z) {
            System.out.println("1st Player is a winner");
        } else if (y > x && y > z) {
            System.out.println("2nd Player is a winner");
        } else if (z > x && z > y) {
            System.out.println("3rd Player is a winner");
        } else if (x == y && y > z) {
            System.out.println("1st and 3rd players are winners");
        } else if (y == z && z > x) {
            System.out.println("2nd and 3rd players are winners");
        } else if (y == z && z == x) {
            System.out.println("it's a tie between all players");
        }
    }

        public static void main (String[]args){
            announceWinnerPlayer(20, 20, 10);
            announceWinnerPlayer(10, 20, 20);
            announceWinnerPlayer(30, 30, 30);
        }
    }






