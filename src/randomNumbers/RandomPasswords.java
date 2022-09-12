package randomNumbers;

import java.util.Random;

public class RandomPasswords {
    public static void main(String[] args) {

        Random random = new Random();
        int myRandomPasswords = random.nextInt(250);

        System.out.println(myRandomPasswords);

    }
}
