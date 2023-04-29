package ui;

import java.io.*;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;
import com.google.gson.Gson;
import java.io.FileReader;
import java.io.Reader;
import java.nio.charset.StandardCharsets;

import model.AirlineAdministrator;

public class Main{
    
    public Scanner sc;
    private AirlineAdministrator admin;
    
    public static void main(String[] args) {

        System.out.println("Welcome to Airline Administrator\n" +
        "Initializing app...");

        Main oMain = new Main();

        int op = 1;

        do {
            op = oMain.Menu();
        } while (op != 0);

    }

    public Main(){
        sc = new Scanner(System.in);
        admin = new AirlineAdministrator();
    }

    public int Menu(){
        int op = 0;


        System.out.println("What do you want to do?\n" +
        "[1] Load passenger's and flight's information\n" +
        "[2] Load passenger arrival time\n"+
        "[3] Enter a passengers to the plane\n"+
        "[0] Exit\n");

        op = sc.nextInt();
        sc.nextLine();
        switch(op){
            case 1:
                uploadFlightInfo();
                break;
            case 2:
                uploadArrivalTimes();
                break;
            case 3:
                passengerEntry();
                break;

        }

        return op;

    }

    public void executeOp(int op){
        
        switch (op) {
            case 1:
                
                break;
        
            default:
                break;
        }
    }
    public void jsonInFlightInfo(){

        Gson gson = new Gson();
        File projectDir = new File(System.getProperty("user.dir"));
        File dataDirectory = new File(projectDir+"/data");
        File result = new File(projectDir+"/data/result.json");

        try {
            FileInputStream fileIn = new FileInputStream("flightInfo.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            //read dunno how to use yet----in.readObject();
            in.close();
            fileIn.close();
        } catch (FileNotFoundException e) {
            System.err.println("File not found");
        }catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("Deserialized data:");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).toString());
        }

    }
    public void jsonInFlightInfo(){

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
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
    public void uploadFlightInfo(){

        //Flight number
        String flightNum = sc.nextLine();
        //Flight rows
        int flightRows = sc.nextInt();
        //Flight columns
        int flightColumns = sc.nextInt();

        admin.AirlineAdministrator(flightNum, flightRows, flightColumns);

        //Passenger amount
        int passengerNum = sc.nextInt();

        for(int i = 0; i<passengerNum; i++){
            int miles = 0;
            int tHelp = 0;
            int opClass = sc.nextInt();
            sc.nextLine();
            String passName = sc.nextLine();
            long id = sc.nextLong();
            String ticket = sc.nextLine();
            if(opClass == 2){
                System.out.println("What kind of help needs the passenger. If none help required press 0: \n"+
                        "1. phisical disiability\n" +
                        "2. mental disiability\n" +
                        "3. third age\n" +
                        "4. pregnancy\n" +
                        "5. child\n");
                tHelp = sc.nextInt();

                System.out.println("Amount of miles");
                miles = sc.nextInt();
            }
            admin.addPassenger(opClass, passName, id, ticket, tHelp, miles);
        }
        return;
    }

    public void uploadArrivalTimes(){
        //Amount of passenger data
        int amountOnTime = sc.nextInt();

        for(int i = 0; i<amountOnTime; i++){
            //id, ticket and calendar arrival time
            long id = sc.nextLong();
            int year = sc.nextInt();
            int month = sc.nextInt();
            int day = sc.nextInt();
            Calendar calendar = Calendar.getInstance();
            calendar.set(year, month - 1, day);
            admin.addArrival(id, calendar);
        }
        return;
    }
    public void passengerEntry(){
        admin.addPassengersToPlane();
    }
}