package collections;

import java.util.HashMap;

public class HashMapPrac {
    public static void main(String[] args) {
        HashMap<String, String> vegetableNames = new HashMap<String, String>();

        //Add keys and values (colour, Name)
        vegetableNames.put ("Green", "Brocolly");
        vegetableNames.put ("White", "Potato");
        vegetableNames.put ("Brown", "Onion");
        vegetableNames.put ("Orange", "Onion"); //value can be repeated and key needs to be unique can not be same
        System.out.println(vegetableNames);
        vegetableNames.replace("White", "Onion");
        System.out.println(vegetableNames);
        vegetableNames.remove("Green", "Brocolly");
        System.out.println(vegetableNames);
        System.out.println(vegetableNames.get("Orange"));

        System.out.println(vegetableNames.get("Green"));
        System.out.println(vegetableNames.get("Black"));

        System.out.println(vegetableNames.containsKey("Turqoice"));
        System.out.println(vegetableNames.containsValue("Cabbage"));

}
}
