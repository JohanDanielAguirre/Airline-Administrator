package model;

import java.util.Calendar;

public class Passenger {

    private String name;
    private long id;
    private String ticket;

    private int miles;

    private boolean isFirstClass;

    private Calendar ArrivalTime;

    private int Age;
    private TypeHelp typeHelp;

    private boolean inAircraft;

    public String getName() {
        return name;
    }

    public long getId() {
        return id;
    }

    public String getTicket() {
        return ticket;
    }

    public TypeHelp getTypeHelp() {
        return typeHelp;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setTicket(String ticket) {
        this.ticket = ticket;
    }

    public void setTypeHelp(TypeHelp typeHelp) {
        this.typeHelp = typeHelp;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public Calendar getArrivalTime() {
        return ArrivalTime;
    }

    public void setArrivalTime(Calendar arrivalTime) {
        ArrivalTime = arrivalTime;
    }

    public boolean isInAircraft() {
        return inAircraft;
    }

    public void setInAircraft(boolean inAircraft) {
        this.inAircraft = inAircraft;
    }

    public boolean isFirstClass() {
        return isFirstClass;
    }

    public void setFirstClass(boolean firstClass) {
        isFirstClass = firstClass;
    }

    public int getMiles() {
        return miles;
    }

    public void setMiles(int miles) {
        this.miles = miles;
    }

    @Override
    public String toString() {
        
        return "Nombre : " + name + "\n" +
        "Id: " + id + "n" +
        "Asiento: " + ticket + "\n";
    }

    public Passenger(String name, long id, String ticket, int tHelp, int miles, boolean firstClass,int age){

        this.name = name;
        this.ticket = ticket;
        this.id =id;
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
                break;
        }

    }




    
}