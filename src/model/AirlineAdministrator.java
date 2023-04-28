package model;

public class AirlineAdministrator {
    
    private HashTable<Long,Passenger> passengersInfo;

    public AirlineAdministrator(){
        passengersInfo = new HashTable<>(1001);
    }

    public String addPassenger(String name, long id, String ticket, int tHelp, int miles, boolean firstclass, int age){
        String msg = "";

        Passenger passenger = new Passenger(name, id, ticket,tHelp, miles, firstclass, age);

        passengersInfo.insert(passenger.getId(), passenger);


        return msg;
    }

    public String addPassengerToPlane(long id){
        String msg = "";

        Passenger passenger = passengersInfo.search(id);

        

        return msg;
    }
}
