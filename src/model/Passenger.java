package model;

public class Passenger {

    private String name;
    private long id;
    private String ticket;
    private TypeHelp typeHelp;

    public String getName() {
        return name;
    }

    public long getId() {
        return id;
    }

    public String getTicket() {
        return ticket;
    }

    public TypeHelp getTypeHelp() {
        return typeHelp;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setTicket(String ticket) {
        this.ticket = ticket;
    }

    public void setTypeHelp(TypeHelp typeHelp) {
        this.typeHelp = typeHelp;
    }

    @Override
    public String toString() {
        
        return "Nombre : " + name + "\n" +
        "Id: " + id + "n" +
        "Asiento: " + ticket + "\n";
    }

    public Passenger(String name, long id, String ticket, int tHelp){

        this.name = name;
        this.ticket = ticket;
        this.id =id;
        
        switch (tHelp) {
            case 1:
                typeHelp = TypeHelp.PHYSICAL_DISABILITY;
                break;
            case 2: 
                typeHelp = TypeHelp.MENTAL_DISABILITY;
                break;
            
            case 3: 
                typeHelp = TypeHelp.THIRD_AGE;
                break;
            case 4: 
                typeHelp = TypeHelp.PREGNANCY;

            case 5: 
                typeHelp = TypeHelp.CHILD;
            default:
                typeHelp = null;
                break;
        }

    }




    
}