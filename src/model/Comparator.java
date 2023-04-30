package model;

public class Comparator {
    public <T extends Passenger> int comparePassengers(T c1, T c2) {
        if (c1.getFirstClass() == c2.getFirstClass()) {
            if (c1.getFirstClass() == true) {
                if (c1.getPriority() != c2.getPriority()) {
                    return (c1.getPriority() > c2.getPriority()) ? 1 : -1;
                } else if (c1.getMiles() != c2.getMiles()) {
                    return (c1.getMiles() > c2.getMiles()) ? 1 : -1;
                } else if(c1.getArrivalTime().compareTo(c2.getArrivalTime()) != 0){
                    return c1.getArrivalTime().compareTo(c2.getArrivalTime());
                }
            } else if (c1.getArrivalTime().compareTo(c2.getArrivalTime()) != 0) {
                return c1.getArrivalTime().compareTo(c2.getArrivalTime());
            }
        } else {
            return (c1.getFirstClass() == true) ? 1 : -1;
        }
        return 0;
    }
}