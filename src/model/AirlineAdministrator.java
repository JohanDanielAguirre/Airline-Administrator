package model;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.*;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;

public class AirlineAdministrator {
    
    private HashTable<Long,Passenger> passengersInfo;

    private Plane plane;

    public void AirlineAdministrator(String flightNum, int rows, int columns, int firstClassRows){
        passengersInfo = new HashTable<>(rows*columns);
        plane = new Plane(flightNum, rows, columns, firstClassRows);
        return;
    }

    public String addPassenger(Passenger passenger){
        String msg = "";

        msg = "Se creo el pasajero de clase economica";
        passengersInfo.insert(passenger.getId(), passenger);

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

            AirlineAdministrator(planes[0].getNumFlight(), planes[0].getRows(), planes[0].getColumns(), planes[0].getFirstClassRows());
        } catch (FileNotFoundException e) {
            System.err.println("File not found");
        }catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void jsonInFlightPassengerInfo(){
        Gson gson = new Gson();
        File dataDirectory = new File("data");
        File passengerInfoFile = new File(dataDirectory, "passengerInfo.json");

        try {
            BufferedReader reader = new BufferedReader(new FileReader(passengerInfoFile));
            Passenger[] passengers = gson.fromJson(reader, Passenger[].class);
            reader.close();

            for(int i = 0; i<passengers.length; i++){
                addPassenger(passengers[i]);
            }

        } catch (FileNotFoundException e) {
            System.err.println("File not found");
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void jsonArrivalTimeInfo(){

        Gson gson = new Gson();
        File dataDirectory = new File("data");
        File arrivalTimeInfoFile = new File(dataDirectory, "arrivalTimeInfo.json");

        try {
            BufferedReader reader = new BufferedReader(new FileReader(arrivalTimeInfoFile));
            Type arrivalTimeType = new TypeToken<HashMap<Long, Calendar>>(){}.getType();
            HashMap<Long, Calendar> arrivalTimeMap = gson.fromJson(reader, arrivalTimeType);
            reader.close();

            for (Long id : arrivalTimeMap.keySet()) {
                Calendar arrivalTime = arrivalTimeMap.get(id);
                passengersInfo.search(id).setArrivalTime(arrivalTime);
            }
        } catch (FileNotFoundException e) {
            System.err.println("File not found");
        }catch (IOException e) {
            e.printStackTrace();
        }
    }

}
