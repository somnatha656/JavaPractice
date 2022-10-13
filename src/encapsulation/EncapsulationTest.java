package encapsulation;

public class EncapsulationTest {
    public static void main(String[] args) {
        EncapsulationPrac pra = new EncapsulationPrac();
        pra.setSno(112011);
        pra.setCarName("BMW");
        pra.setCarRegno("gh100j");
        System.out.println(" Cars sno " + pra.getSno());
        System.out.println(" Cars name " + pra.getCarName());
        System.out.println(" Cars Regno " + pra.getCarRegno());


    }
}
