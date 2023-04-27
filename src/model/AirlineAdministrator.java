package model;

public class AirlineAdministrator {
    
    private HashTable<Long,Passenger> passengersInfo;

    public AirlineAdministrator(){
        passengersInfo = new HashTable<>(1001);
    }

    public String addPassenger(String name, long id, String ticket, int tHelp){
        String msg = "";

        Passenger passenger = new Passenger(name, id, ticket,tHelp);

        passengersInfo.insert(passenger.getId(), passenger);


        return msg;
    }
}
