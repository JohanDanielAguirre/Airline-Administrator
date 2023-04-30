package Exeptions;

public class MissingPlaneDataExeption extends Exception{
    public MissingPlaneDataExeption(String text){
        super(text);
    }
}