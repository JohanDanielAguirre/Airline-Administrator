package model;

import java.util.Calendar;

public class FirstClass extends Passenger{

    private int miles;

    private boolean isFirstClass;

    private int Age;

    private TypeHelp typeHelp;

    public FirstClass(String name, long id, String ticket,int tHelp, int miles, boolean firstClass,int age) {
        super(name, id, ticket);
        this.miles = miles;
        this.isFirstClass = firstClass;
        this.Age = age;

        switch (tHelp) {
            case 1:
                typeHelp = TypeHelp.PHYSICAL_DISABILITY;
                break;
            case 2:
                typeHelp = TypeHelp.MENTAL_DISABILITY;
                break;

            case 3:
                typeHelp = TypeHelp.THIRD_AGE;
                break;
            case 4:
                typeHelp = TypeHelp.PREGNANCY;

            case 5:
                typeHelp = TypeHelp.CHILD;
            default:
                typeHelp = null;
                break;
        }
    }

    public int getMiles() {
        return miles;
    }

    public void setMiles(int miles) {
        this.miles = miles;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }


    public boolean isFirstClass() {
        return isFirstClass;
    }

    public void setFirstClass(boolean firstClass) {
        isFirstClass = firstClass;
    }



}
