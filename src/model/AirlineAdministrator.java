package model;

import Exeptions.DuplicatedObjectExeption;
import Exeptions.IncorrectObjectExeption;
import Exeptions.KeyExeption;
import Exeptions.NonexistObjectExeption;
import Exeptions.SizePlaneExeption;

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

    public String addPassengersToPlane(String ticket) throws IncorrectObjectExeption {
    
        String msg = "";
        Passenger toPlane = passengersInfo.search(ticket);

        if(toPlane != null){
            toPlane.setArrivalTime();

            try {
                plane.getEntry().insert(toPlane);
            } catch (SizePlaneExeption | KeyExeption | NonexistObjectExeption e) {
                e.printStackTrace();
            }
            msg = "El pasajero entro al avión\n";
        }
        
        msg += plane.getEntry().print();
        
        return msg;
    }

    public void jsonInFlightInfo(String filePath){
        Gson gson = new Gson();
        File dataDirectory = new File("src\\outs_or_inputs");
        File flightInfoFile = new File(dataDirectory, filePath);

        try {
            BufferedReader reader = new BufferedReader(new FileReader(flightInfoFile));
            Plane planes = gson.fromJson(reader, Plane.class);
            reader.close();

            AirlineAdministratorInfo(planes.getNumFlight(), planes.getRows(), planes.getColumns(), planes.getFirstClassRows());
        } catch (FileNotFoundException e) {
            System.err.println("File not found");
        }catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void jsonInFlightPassengerInfo(String filePath){
        Gson gson = new Gson();
        File dataDirectory = new File("src\\outs_or_inputs");
        File passengerInfoFile = new File(dataDirectory, filePath);

        try {
            BufferedReader reader = new BufferedReader(new FileReader(passengerInfoFile));
            Passenger[] passengers = gson.fromJson(reader, Passenger[].class);
            reader.close();

            for(int i = 0; i<passengers.length; i++){
                String str = passengers[i].getTicket();
                String[] parts = str.split("(?<=\\D)(?=\\d)|(?<=\\d)(?=\\D)");
                String part2 = parts[1];
                passengers[i].setFirstClass(determinateFirstclass(passengers[i], part2));
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
        File dataDirectory = new File("src\\outs_or_inputs");
        File arrivalTimeInfoFile = new File(dataDirectory, filePath);

        try {
            BufferedReader reader = new BufferedReader(new FileReader(arrivalTimeInfoFile));
            Type arrivalTimeType = new TypeToken<HashMap<String, Calendar>>(){}.getType();
            HashMap<String, LocalDateTime> arrivalTimeMap = gson.fromJson(reader, arrivalTimeType);
            reader.close();

            for (String id : arrivalTimeMap.keySet()) {
                passengersInfo.search(id).setArrivalTime();
            }
        } catch (FileNotFoundException e) {
            System.err.println("File not found");
        }catch (IOException | IncorrectObjectExeption e) {
            e.printStackTrace();
        }
    }

    public void passengerExit(){
        for(int i = 0; i < plane.getEntry().heapSize; i++){
           // plane.getEntry()
        }
        return;
    }

    public boolean determinateFirstclass(Passenger p,String letter){
        int n=0;
        switch (letter){
            case "a": n=1;break;
            case "b":n=2 ;break;
            case "c":n=3 ;break;
            case "d":n=4 ;break;
            case "e":n=5 ;break;
            case "f":n=6 ;break;
            case "g":n=7 ;break;
            case "h":n=8 ;break;
            case "i":n=9 ;break;
            case "j":n=10 ;break;
            case "k":n=11 ;break;
            case "l":n=12 ;break;
            case "m":n=13 ;break;
            case "n":n=14 ;break;
            case "o":n=15 ;break;
            case "p":n=16 ;break;
            case "q":n=17 ;break;
            case "r":n=18 ;break;
            case "s":n=19 ;break;
            case "t":n=20 ;break;
            case "u":n=21 ;break;
            case "w":n=22 ;break;
            case "x":n=23 ;break;
            case "y":n=24 ;break;
            case "z":n=25 ;break;
        }
        if(n<=plane.getFirstClassRows()){
            return true;
        } else {
            return false;
        }
    }

}
