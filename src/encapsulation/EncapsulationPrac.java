package encapsulation;
//idea behind encapsulation if to hide the implementation details from users. If a data member is private it means it can accessed within the same class. No outside
//class can access private data member(variable) of other class.*/
//in a object orientd programming, Encapsulation is defined as binding together the data and the functions that manipulates them.
//Consider a real life example of encapsulation, in a company there are different sections like the accounts section, finanace section, sales section etc.

public class EncapsulationPrac {
    private int sno;
    private String carName;
    private String carRegno;

    public int getSno(){ //Hiding the variable of a class from other classes, and giving access to them only through methods(setters and getters  ). Hence , Encapsulation
        //in Java language means binding the data (variable) with the code (methods - setters and getters)
        return sno;
    }
    public String getCarName(){
        return carName;
    }
    public String getCarRegno(){
        return carRegno;
    }
           public void setSno(int newValue){
        sno = newValue;

           }
           public void setCarName(String newValue){
        carName = newValue;
           }
    public void setCarRegno(String newValue){
        carRegno = newValue;
    }

}
