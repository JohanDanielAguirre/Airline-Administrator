package model;

import Exeptions.DuplicatedObjectExeption;
import Exeptions.IncorrectObjectExeption;
import Exeptions.NonexistObjectExeption;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.*;
import java.lang.reflect.Type;
import java.util.Calendar;
import java.util.HashMap;
import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime;

public class AirlineAdministrator {
    
    private HashTable<String,Passenger> passengersInfo;

    private Plane plane;

    DateTimeFormatter dtf;
    LocalDateTime now;

    public void AirlineAdministratorInfo(String flightNum, int rows, int columns, int firstClassRows){
        passengersInfo = new HashTable<>(rows*columns);
        plane = new Plane(flightNum, rows, columns, firstClassRows); 
        return;
    }

    public String addPassenger(Passenger passenger) throws IncorrectObjectExeption, DuplicatedObjectExeption, NonexistObjectExeption {
        String msg = "";

        msg = "Se creo el pasajero de clase economica";
        passengersInfo.insert(passenger.getTicket(), passenger);


        return msg;
    }

    public void addPassengersToPlane(String ticket) throws IncorrectObjectExeption {

        Passenger toPlane = passengersInfo.search(ticket);
        toPlane.setArrivalTime(LocalDateTime.now());

        plane.getEntry().insert(toPlane);
        
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

            AirlineAdministratorInfo(planes[0].getNumFlight(), planes[0].getRows(), planes[0].getColumns(), planes[0].getFirstClassRows());
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
        }catch (IOException | IncorrectObjectExeption | DuplicatedObjectExeption | NonexistObjectExeption e) {
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
            HashMap<String, LocalDateTime> arrivalTimeMap = gson.fromJson(reader, arrivalTimeType);
            reader.close();

            for (String id : arrivalTimeMap.keySet()) {
                LocalDateTime arrivalTime = arrivalTimeMap.get(id);
                passengersInfo.search(id).setArrivalTime(arrivalTime);
            }
        } catch (FileNotFoundException e) {
            System.err.println("File not found");
        }catch (IOException | IncorrectObjectExeption e) {
            e.printStackTrace();
        }
    }

}
