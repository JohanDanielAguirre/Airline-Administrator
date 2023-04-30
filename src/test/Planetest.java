package test;
import junit.framework.TestCase;
import java.util.*;
import model.*;
import Exeptions.*;
public class Planetest extends TestCase {
	
	public void uploadtest1(){
	   AirlineAdministrator arc= new AirlineAdministrator();
	   try{
		  arc.jsonInFlightPassengerInfo("D:\Documents\Downloads\a\airline_administrator\src\outs_or_inputs\passengerInfoSetupStage6"); 
		  arc.jsonInFlightInfo("D:\Documents\Downloads\a\airline_administrator\src\outs_or_inputs\flightInfoSetupStage1");
		  assertEquals(0,0);
	   }catch (Exception e){
		   fail();
	   }
    }

	public void uploadtest2(){
		AirlineAdministrator arc= new AirlineAdministrator();
	   try{
		  arc.jsonInFlightPassengerInfo("D:\Documents\Downloads\a\airline_administrator\src\outs_or_inputs\passengerInfoSetupStage4"); 
		  arc.jsonInFlightInfo("D:\Documents\Downloads\a\airline_administrator\src\outs_or_inputs\flightInfoSetupStage1");
		  assertEquals(0,0);
	   }catch (Exception e){
		   fail();
	   }
    }
	public void uploadtest3(){
		AirlineAdministrator arc= new AirlineAdministrator();
	   try{
		  arc.jsonInFlightPassengerInfo("D:\Documents\Downloads\a\airline_administrator\src\outs_or_inputs\passengerInfoSetupStage4"); 
		  arc.jsonInFlightInfo("D:\Documents\Downloads\a\airline_administrator\src\outs_or_inputs\flightInfoSetupStage3");
		  fail();
	   }catch (SizePlaneExeption e){
		   assertNotNull(e);
	   }
    }
	public void uploadtest4(){
		AirlineAdministrator arc= new AirlineAdministrator();
	   try{
		  arc.jsonInFlightPassengerInfo("D:\Documents\Downloads\a\airline_administrator\src\outs_or_inputs\passengerInfoSetupStage4"); 
		  fail();
	   }catch (MissingPlaneDataExeption e){
		   assertNotNull(e);
	   }
    }
	public void uploadtest5(){
		AirlineAdministrator arc= new AirlineAdministrator();
	   try{
		  arc.jsonInFlightInfo("D:\Documents\Downloads\a\airline_administrator\src\outs_or_inputs\flightInfoSetupStage1");
		  fail();
	   }catch (MissingPassengerDataExeption e){
		   assertNotNull(e);
	   }
    }
}