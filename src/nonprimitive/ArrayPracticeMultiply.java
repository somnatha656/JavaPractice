package nonprimitive;

public class ArrayPracticeMultiply {
public static void main(String[] args) {

    int[] values = {5, 4, 2, 4, 3, 8, 9, 4, 5, 12, 15};
    int result = 1;
    for (int value : values) {
        result *= value;
        System.out.println("sub result: " + result);
    }
    System.out.println("The result: " + result);

}
}