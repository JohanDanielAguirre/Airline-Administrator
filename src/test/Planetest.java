package test;
import junit.framework.TestCase;
import java.util.*;
import model.*;
import Exeptions.*;
public class Planetest extends TestCase {
	
	public void uploadtest1(){
	   AirlineController arc= new AirlineController();
	   try{
		  arc.jsonInFlightPassengerInfo("D:\Documents\Downloads\a\airline_administrator\src\outs_or_inputs\passengerInfoSetupStage6"); 
		  arc.jsonInFlightInfo("D:\Documents\Downloads\a\airline_administrator\src\outs_or_inputs\flightInfoSetupStage1");
		  assertequals(0,0);
	   }catch (Exception e){
		   fail();
	   }
    }
	public void uploadtest2(){
	   AirlineController arc= new AirlineController();
	   try{
		  arc.jsonInFlightPassengerInfo("D:\Documents\Downloads\a\airline_administrator\src\outs_or_inputs\passengerInfoSetupStage4"); 
		  arc.jsonInFlightInfo("D:\Documents\Downloads\a\airline_administrator\src\outs_or_inputs\flightInfoSetupStage1");
		  assertequals(0,0);
	   }catch (Exception e){
		   fail();
	   }
    }
	public void uploadtest3(){
	   AirlineController arc= new AirlineController();
	   try{
		  arc.jsonInFlightPassengerInfo("D:\Documents\Downloads\a\airline_administrator\src\outs_or_inputs\passengerInfoSetupStage4"); 
		  arc.jsonInFlightInfo("D:\Documents\Downloads\a\airline_administrator\src\outs_or_inputs\flightInfoSetupStage3");
		  fail();
	   }catch (SizePlaneExeption e){
		   assertNotnull(e);
	   }
    }
	public void uploadtest4(){
	   AirlineController arc= new AirlineController();
	   try{
		  arc.jsonInFlightPassengerInfo("D:\Documents\Downloads\a\airline_administrator\src\outs_or_inputs\passengerInfoSetupStage4"); 
		  fail();
	   }catch (MissingPlaneDataExeption e){
		   assertNotnull(e);
	   }
    }
	public void uploadtest5(){
	   AirlineController arc= new AirlineController();
	   try{
		  arc.jsonInFlightInfo("D:\Documents\Downloads\a\airline_administrator\src\outs_or_inputs\flightInfoSetupStage1");
		  fail();
	   }catch (MissingPassengerDataExeption e){
		   assertNotnull(e);
	   }
    }
}