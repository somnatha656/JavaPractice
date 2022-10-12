package exception;

public class ExceptionPractice extends Throwable {
    public static void main(String[] args) {

        String[] myFamily = new String[' '];
        try {

            myFamily = new String[]{"Jalpa", "Jimil", "Parthvi", "Vansh", "Ba"};
            System.out.println(myFamily[8]);
        }
        catch (Exception e){
            System.out.println("out of range");
        }
        finally{
            System.out.println(myFamily[8]);

                            }

            }


        }
