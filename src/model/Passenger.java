package model;

import java.util.Calendar;

public class Passenger implements Comparable<Passenger>{

    private String name;
    private long id;
    private String ticket;
    private Calendar ArrivalTime;
    private int miles;
    private TypeHelp typeHelp;

    private boolean firstClass;

    private int priority;

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

    public Passenger(String name, long id, String ticket,int tHelp, int miles, Calendar arrivalTime){

        this.name = name;
        this.ticket = ticket;
        this.id =id;
        this.miles = miles;
        this.ArrivalTime = arrivalTime;
        priority = 0;

        switch (tHelp) {
            case 1:
                typeHelp = TypeHelp.PHYSICAL_DISABILITY;
                priority = priority + 5;
                break;
            case 2:
                typeHelp = TypeHelp.MENTAL_DISABILITY;
                priority = priority + 4;
                break;

            case 3:
                typeHelp = TypeHelp.THIRD_AGE;
                priority = priority + 3;
                break;
            case 4:
                typeHelp = TypeHelp.PREGNANCY;
                priority = priority + 2;

            case 5:
                typeHelp = TypeHelp.CHILD;
                priority = priority + 1;
            default:
                typeHelp = null;
                break;
        }

    }

    public int getPriority() {
        return priority;
    }

    public boolean getFirstClass(){
       return firstClass; 
    }

    public int getMiles() {
        return miles;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public TypeHelp getTypeHelp() {
        return typeHelp;
    }

    public void setTypeHelp(TypeHelp typeHelp) {
        this.typeHelp = typeHelp;
    }

    public void calculatePriority() {


    }

    @Override
    public int compareTo(Passenger o) {
        if (this.getFirstClass() == o.getFirstClass()) {
            if (this.getFirstClass()) {
                if (this.getPriority() != o.getPriority()) {
                    return (this.getPriority() > o.getPriority()) ? 1 : -1;
                } else if (this.getMiles() != o.getMiles()) {
                    return (this.getMiles() > o.getMiles()) ? 1 : -1;
                } else if(this.getArrivalTime().compareTo(o.getArrivalTime()) != 0){
                    return this.getArrivalTime().compareTo(o.getArrivalTime());
                }
            } else if (this.getArrivalTime().compareTo(o.getArrivalTime()) != 0) {
                return this.getArrivalTime().compareTo(o.getArrivalTime());
            }
        } else {
            return (this.getFirstClass() == true) ? 1 : -1;
        }
        return 0;
    }





    
}