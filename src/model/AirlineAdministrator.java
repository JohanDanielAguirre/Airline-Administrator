package model;

import java.util.Calendar;

public class AirlineAdministrator {
    
    private HashTable<Long,Passenger> passengersInfo;

    private Plane plane;

    public void AirlineAdministrator(String flightNum, int rows, int columns){
        passengersInfo = new HashTable<>(rows*columns);
        plane = new Plane(flightNum, rows, columns);
        return;
    }

    public String addPassenger(int opClass, String name, long id, String ticket, int tHelp,int miles){
        String msg = "";

        switch (opClass)
        {
            case 1: 
               Passenger passenger = new Passenger(name, id, ticket);
               msg = "Se creo el pasajero de clase economica";
               passengersInfo.insert(passenger.getId(), passenger);
               break;

            case 2:
                Passenger passenger2 = new FirstClass(name, id, ticket, tHelp, miles);
                msg = "Se creo el pasajero de primera clase";
                passengersInfo.insert(passenger2.getId(), passenger2);
                break; 
        }

        return msg;
    }

    public void addArrival(long id, Calendar calendar){
        passengersInfo.search(id).setArrivalTime(calendar);
        return;
    }

    public void addPassengersToPlane(){

        return;
    }
}
