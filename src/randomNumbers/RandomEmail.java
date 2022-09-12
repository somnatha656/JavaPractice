package randomNumbers;

import java.util.Random;

public class RandomEmail {
    public static void main(String[] args) {

        Random random = new Random();
       int myRandomNumber = random.nextInt(50);

        String email = "jalpa" +myRandomNumber + "patel@gmail.com";

        System.out.println(email);
       }
}



