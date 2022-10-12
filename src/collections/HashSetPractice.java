package collections;

import java.util.HashSet;

public class HashSetPractice {
    public static void main(String[] args) {
        //create a Hashset object called numbers
        HashSet<Integer> numbers = new HashSet<Integer>();
        //Add values to the set
        numbers.add(5);
        numbers.add(6);
        numbers.add(6);
        numbers.add(7);
        numbers.add(8);
        numbers.add(10);
        System.out.println(numbers);

        //show which numbers between 1 and 10 are in the set
        for (int i=1; i<= 10; i++) {
            if (numbers.contains(i)){
                System.out.println(i + " is found ");
            }
            else{
                System.out.println(i + " is not found ");

            }

        }

        }
    }


