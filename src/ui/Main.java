package ui;

import java.util.Scanner;

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
        "[1] Add a passenger\n"+
        "[2] Enter a passenger to the plane\n" + 
        "[3] Load passenger's and flight's information\n"+
        "[0] Exit\n");

        op = sc.nextInt();
        sc.nextLine();
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

    public void addPassenger(){

        System.out.println("What kind of passenger are you going to add\n"+ 
        "1. Economic\n" + 
        "2. First class\n");
        int opClass = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter the name of the passenger");
        String passName = sc.nextLine();

        System.out.println("Enter the id of the passenger");
        long id = sc.nextLong();

        System.out.println("Enter the ticket of the passenger");
        String ticket = sc.nextLine();

        System.out.println("What kind of help needs the passenger. If none help required press 0: \n"+
        "1. phisical disiability\n" + 
        "2. mental disiability\n" +
        "3. third age\n" + 
        "4. pregnancy\n" + 
        "5. child\n");
        int tHelp = sc.nextInt();

        int miles = 0;
        if(opClass == 2){
            System.out.println("Enter the quantity of miles of the passenger");
            miles = sc.nextInt();
        }

        admin.addPassenger(opClass, passName, id, ticket, tHelp, miles);

        
    }


}