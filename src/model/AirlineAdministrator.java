package model;

public class AirlineAdministrator {
    
    private HashTable<Long,Passenger> passengersInfo;

    public AirlineAdministrator(){
        passengersInfo = new HashTable<>(1001);
    }

<<<<<<< HEAD
    public String addPassenger(String name, long id, String ticket, int tHelp, int miles, boolean firstclass, int age){
        String msg = "";

        Passenger passenger = new Passenger(name, id, ticket,tHelp, miles, firstclass, age);
=======
    public String addPassenger(int opClass, String name, long id, String ticket, int tHelp,int miles){
        String msg = "";

        switch (opClass)
        {
            case 1: 
               Passenger passenger = new Passenger(name, id, ticket,tHelp);
               msg = "Se creo el pasajero de clase economica";
               passengersInfo.insert(passenger.getId(), passenger);
               break;
>>>>>>> 1b773fa291cef6ce3d21c0557e5842caa2238acd

            case 2:
                Passenger passenger2 = new FirstClass(name, id, ticket, tHelp, miles);
                msg = "Se creo el pasajero de primera clase";
                passengersInfo.insert(passenger2.getId(), passenger2);
                break; 
        }


        return msg;
    }

    public String addPassengerToPlane(long id){
        String msg = "";

        Passenger passenger = passengersInfo.search(id);

        

        return msg;
    }
}
