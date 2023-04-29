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
                admin.jsonInFlightInfo();
                admin.jsonInFlightPassengerInfo();
                break;
            case 2:
                admin.jsonArrivalTimeInfo();
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

    public void passengerEntry(){
        admin.addPassengersToPlane();
    }
}