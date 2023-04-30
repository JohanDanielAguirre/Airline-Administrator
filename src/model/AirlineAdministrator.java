package model;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.*;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;

public class AirlineAdministrator {
    
    private HashTable<String,Passenger> passengersInfo;

    private Plane plane;

    public void AirlineAdministrator(String flightNum, int rows, int columns, int firstClassRows){
        passengersInfo = new HashTable<>(rows*columns);
        plane = new Plane(flightNum, rows, columns, firstClassRows);
        return;
    }

    public String addPassenger(Passenger passenger){
        String msg = "";

        msg = "Se creo el pasajero de clase economica";
        passengersInfo.insert(passenger.getTicket(), passenger);

        return msg;
    }

    public void addArrival(String ticket, Calendar calendar){
        passengersInfo.search(ticket).setArrivalTime(calendar);
        return;
    }

    public void addPassengersToPlane(){

        return;
    }

    public void jsonInFlightInfo(String filePath){
        Gson gson = new Gson();
        File dataDirectory = new File("data");
        File flightInfoFile = new File(dataDirectory, filePath);

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

    public void jsonInFlightPassengerInfo(String filePath){
        Gson gson = new Gson();
        File dataDirectory = new File("data");
        File passengerInfoFile = new File(dataDirectory, filePath);

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

    public void jsonArrivalTimeInfo(String filePath){

        Gson gson = new Gson();
        File dataDirectory = new File("data");
        File arrivalTimeInfoFile = new File(dataDirectory, filePath);

        try {
            BufferedReader reader = new BufferedReader(new FileReader(arrivalTimeInfoFile));
            Type arrivalTimeType = new TypeToken<HashMap<String, Calendar>>(){}.getType();
            HashMap<String, Calendar> arrivalTimeMap = gson.fromJson(reader, arrivalTimeType);
            reader.close();

            for (String id : arrivalTimeMap.keySet()) {
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
