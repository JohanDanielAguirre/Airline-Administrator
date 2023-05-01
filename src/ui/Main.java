package ui;

import java.util.Scanner;

import Exeptions.IncorrectObjectExeption;
import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime;    

import model.AirlineAdministrator;

public class Main{
    
    public Scanner sc;
    private AirlineAdministrator admin;
    DateTimeFormatter dtf;
    LocalDateTime now;

    
    public static void main(String[] args) throws IncorrectObjectExeption {

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
        dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        
    }

    public int Menu() throws IncorrectObjectExeption {
        int op = 0;


        System.out.println("What do you want to do?\n" +
        "[1] Load passenger's and flight's information\n" +
        "[2] Load passenger arrival time\n"+
        "[3] Enter a passengers to the plane\n"+
        "[4] Exit passengers off the plane\n" +
        "[0] Exit\n");

        op = sc.nextInt();
        sc.nextLine();
        switch(op){
            case 1:
                admin.jsonInFlightInfo("flightInfoSetupStage1.json");
                admin.jsonInFlightPassengerInfo("passengerInfoSetupStage4.json");
                break;
            case 2:
                admin.jsonArrivalTimeInfo("arrivalInfo.json");
                break;
            case 3:
                passengerEntry();
                break;

        }

        return op;

    }

    public void passengerEntry() throws IncorrectObjectExeption {
        System.out.println("Enter the ticket of the passenger");
        String ticket = sc.nextLine();

        System.out.println(admin.addPassengersToPlane(ticket));

        
    }
}