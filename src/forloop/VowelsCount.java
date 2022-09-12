package forloop;

public class VowelsCount {
    public static void calcVowels(String calc) {
        String a;
        a = calc;
        calc = calc.toLowerCase();
        int count = 0;

        for (int i = 0; i < calc.length(); i++) {
            if (calc.charAt(i) == 'a'
                    || calc.charAt(i) == 'e'
                    || calc.charAt(i) == 'i'
                    || calc.charAt(i) == 'o'
                    || calc.charAt(i) == 'u'
            ) {
                count++;
            }

        }
        System.out.println("Total no of vowels in " + " ' " + a + " '"+ "are: " + count);

    }

    public static void main(String[] args) {
        calcVowels("My favourite colour is Pink");
        calcVowels("I live in UK");
        calcVowels("Today is Monday");

    }
}
