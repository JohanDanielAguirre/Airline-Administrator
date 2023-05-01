package model;

import Exeptions.DuplicatedObjectExeption;
import Exeptions.IncorrectObjectExeption;
import Exeptions.NonexistObjectExeption;
import Exeptions.SizePlaneExeption;
import Exeptions.*;

import java.util.Comparator;

public class Plane {
    
    private String numFlight;

    private MaxHeap entry;

    private Queue<String, Passenger> exit;

    private HashTable<String,Passenger> passengers;

    private int rows;

    private int columns;

    private int firstClassRows;

    public Plane(String numF, int rows, int columns, int firstClassRows){
        this.numFlight = numF;
        passengers = new HashTable<>(1001);
        entry = new MaxHeap(rows*columns);
        this.rows = rows;
        this.columns = columns;
        this.firstClassRows = firstClassRows;
    }

    public String getNumFlight() {
        return numFlight;
    }

    public void setNumFlight(String numFlight) {
        this.numFlight = numFlight;
    }

    public int getColumns() {
        return columns;
    }

    public void setColumns(int columns) {
        this.columns = columns;
    }

    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }

    public int getFirstClassRows() {
        return firstClassRows;
    }

    public void setFirstClassRows(int firstClassRows) {
        this.firstClassRows = firstClassRows;
    }

    public String enterPlane(Passenger passenger)  throws SizePlaneExeption, KeyExeption, NonexistObjectExeption {
        String msg = "";
        
        if(entry.searhPassenger(passenger) != null){
            msg = "The passenger is already in";
        }else{
            entry.insert(passenger);
            rows--;
        }
        

        return msg;
    }

    @Override
    public String toString() {
        return "Plane{" +
                "numFlight=" + numFlight + '\'' +
                ", entry=" + entry +
                ", passengers=" + passengers +
                ", rows=" + rows +
                ", columns=" + columns +
                '}';
    }

    public MaxHeap getEntry() {
        return entry;
    }

    public void fillPassengers() throws IncorrectObjectExeption, DuplicatedObjectExeption, NonexistObjectExeption {
        Queue<String, Passenger> queue = new Queue<>(new passengerComparator());
        for(int i = 0; i<rows*columns;i++){
            Passenger passenger = entry.extract_Max();
            try {
                queue.add(new PassengerNode<>(passenger.getTicket(), passenger));
                passengers.insert(passenger.getTicket(), passenger);
            } catch (DuplicatedObjectExeption | IncorrectObjectExeption | NonexistObjectExeption e) {
                e.printStackTrace();
            } catch (SizePlaneExeption e) {
                throw new RuntimeException(e);
            } catch (KeyExeption e) {
                throw new RuntimeException(e);
            }
        }
        this.exit = queue;
    }

    public void exitPassengers() throws IncorrectObjectExeption {
        while(!exit.isEmpty()){
            Passenger p = exit.poll();
            passengers.delete(p.getTicket());
            System.out.println("Name: " + p.getName() + "// Ticket: " + p.getTicket());
        }
    }

    public class passengerComparator implements Comparator<Passenger> {
        public int compare(Passenger c1, Passenger c2) {
            String str1 = c1.getTicket();
            String str2 = c2.getTicket();
            String[] parts1 = str1.split("(?<=\\D)(?=\\d)|(?<=\\d)(?=\\D)");
            int c1p1 = Integer.parseInt(parts1[0]);
            String c1p2 = parts1[1];
            String[] parts2 = str2.split("(?<=\\D)(?=\\d)|(?<=\\d)(?=\\D)");
            int c2p1 = Integer.parseInt(parts2[0]);
            String c2p2 = parts2[1];

            boolean compare = false;

            if(c1p2.equals(c2p2)){
                for(int i = 1; i<columns; i=i+2){
                    if(c1p1-c2p1==i){
                        compare = true;
                    } else if (c1p1-c2p1==-i) {
                        compare = true;
                    }
                }
                if(compare == true){
                    if (c1.getFirstClass() == c2.getFirstClass()) {
                        if (c1.getFirstClass() == true) {
                            if (c1.getPriority() != c2.getPriority()) {
                                return (c1.getPriority() > c2.getPriority()) ? 1 : -1;
                            } else if (c1.getMiles() != c2.getMiles()) {
                                return (c1.getMiles() > c2.getMiles()) ? 1 :-1;
                            } else if(c1.getArrivalTime().compareTo(c2.getArrivalTime()) != 0){
                                return c1.getArrivalTime().compareTo(c2.getArrivalTime());
                            }
                        } else if (c1.getArrivalTime().compareTo(c2.getArrivalTime()) != 0) {
                            return c1.getArrivalTime().compareTo(c2.getArrivalTime());
                        }
                    } else {
                        return  (c1.getFirstClass() == true) ? 1 : -1;
                    }

                } else {
                    return (Math.abs(c1p1 - columns/2) < Math.abs(c2p1 - columns/2)) ? 1:-1;
                }
            } else {
                return (rowD(c1p2)>rowD(c2p2)) ? 1 : -1;
            }
            return 0;
        }
    }

    public int rowD(String letter){
        int n = 0;
        switch (letter){
            case "a":n=1;break;
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
        return n;
    }
}
