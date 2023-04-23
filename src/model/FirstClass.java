package model;

public class FirstClass extends Passenger{

    private int miles;
    
    public FirstClass(String name, long id, String ticket,TypeHelp typeHelp,int miles) {
        super(name, id, ticket,typeHelp);
        this.miles = miles;
    }

    public int getMiles() {
        return miles;
    }

    public void setMiles(int miles) {
        this.miles = miles;
    }


    

}
