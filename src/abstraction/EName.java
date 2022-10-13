package abstraction;

abstract class EName {
    abstract String eDetail();

    }

class EN extends EName {
    String eDetail() {
        return ("Jalpa");

    }
}
class EmpNo extends EName{
        String eDetail(){
            return ("124562");
        }

}
class EmpSalary extends EName {
    String eDetail() {
        return ("20000");

    }

    public static void main(String[] args) {
        EN e = new EN();
       System.out.println(e.eDetail()); // needs to call with variable and abstract method
       EmpNo n = new EmpNo();
       System.out.println(n.eDetail());
        EmpSalary s = new EmpSalary();
        System.out.println(s.eDetail());

    }
}

