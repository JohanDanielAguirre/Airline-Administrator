package model;

import java.util.Calendar;

public class Passenger {

    private String name;
    private long id;
    private String ticket;
    private Calendar ArrivalTime;
    private int miles;
    private TypeHelp typeHelp;

    private boolean firstClass;

    public String getName() {
        return name;
    }

    public long getId() {
        return id;
    }

    public String getTicket() {
        return ticket;
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

    public Calendar getArrivalTime() {
        return ArrivalTime;
    }

    public void setArrivalTime(Calendar arrivalTime) {
        ArrivalTime = arrivalTime;
    }

    @Override
    public String toString() {
        return "Passenger{" +
                "name=" + name + '\'' +
                ", id=" + id +
                ", ticket=" + ticket + '\'' +
                ", ArrivalTime=" + ArrivalTime +
                '}';
    }

    public Passenger(String name, long id, String ticket,int tHelp, int miles){

        this.name = name;
        this.ticket = ticket;
        this.id =id;
        this.miles = miles;

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




    
}