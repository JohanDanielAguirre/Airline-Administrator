package model;

import java.util.Calendar;

public class Passenger {

    private String name;
    private long id;
    private String ticket;

    private Calendar ArrivalTime;

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
        
        return "Nombre : " + name + "\n" +
        "Id: " + id + "n" +
        "Asiento: " + ticket + "\n";
    }

    public Passenger(String name, long id, String ticket){

        this.name = name;
        this.ticket = ticket;
        this.id =id;

    }




    
}