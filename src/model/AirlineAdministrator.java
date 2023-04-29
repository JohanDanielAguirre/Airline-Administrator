package model;

import com.google.gson.Gson;

import java.io.*;
import java.util.ArrayList;
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

    public void jsonInFlightInfo(){
        Gson gson = new Gson();
        File dataDirectory = new File("data");
        File flightInfoFile = new File(dataDirectory, "flightInfo.json");

        try {
            BufferedReader reader = new BufferedReader(new FileReader(flightInfoFile));
            Plane[] planes = gson.fromJson(reader, Plane[].class);
            reader.close();

            AirlineAdministrator(planes[0].getNumFlight(), planes[0].getRows(), planes[0].getColumns());
        } catch (FileNotFoundException e) {
            System.err.println("File not found");
        }catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void jsonInFlightPassengerInfo(){
        Gson gson = new Gson();
        File dataDirectory = new File("data");
        File flightInfoFile = new File(dataDirectory, "flightPassengerInfo.json");

        try {
            BufferedReader reader = new BufferedReader(new FileReader(flightInfoFile));
            Plane[] planes = gson.fromJson(reader, Plane[].class);
            reader.close();

            AirlineAdministrator(planes[0].getNumFlight(), planes[0].getRows(), planes[0].getColumns());
        } catch (FileNotFoundException e) {
            System.err.println("File not found");
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void jsonArrivalTimeInfo(){

        Gson gson = new Gson();
        File projectDir = new File(System.getProperty("user.dir"));
        File dataDirectory = new File(projectDir+"/data");
        File result = new File(projectDir+"/data/result.json");

        try {
            FileInputStream fileIn = new FileInputStream("arrivalTimes.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            //read dunno how to use yet----in.readObject();
            in.close();
            fileIn.close();
        } catch (FileNotFoundException e) {
            System.err.println("File not found");
        }catch (IOException e) {
            e.printStackTrace();
        }

    }
}
