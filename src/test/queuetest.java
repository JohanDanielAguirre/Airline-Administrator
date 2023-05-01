package test;
import junit.framework.TestCase;
import model.*;
import Exeptions.*;

import java.util.ArrayList;

public class queuetest extends TestCase {
	
    public void setUpStage1(){
        Plane fly1= new Plane(/*numFLight*/ "MidgetAirlines",/*rows*/5,/*columns*/ 1,/*rowsfirstclass*/ 2);
    }
	public void setUpStage2(){
        Plane fly2= new Plane(/*numFLight*/ "Drugmaxdealer",/*rows*/4,/*columns*/ 2,/*rowsfirstclass*/ 0);
    }
	public void setUpStage3(){
        Plane fly3= new Plane(/*numFLight*/ "Viagrafly",/*rows*/4,/*columns*/ 2,/*rowsfirstclass*/ 4);
    }
	public ArrayList setUpStage4(){
		PassengerNode s4p1 = new PassengerNode("1a", new Passenger("olvir Eusebius",1110,"1a",0,10));
		PassengerNode s4p2 = new PassengerNode("2b",new Passenger("Cassian Rufina",290123,"2b",0,100));
		PassengerNode s4p3 = new PassengerNode("1c",new Passenger("Erkan Noriko",18200,"1c",0,1000));
		PassengerNode s4p4 = new PassengerNode("1d",new Passenger("Harpreet Aleksandra",610340,"1d",0,250));
		PassengerNode s4p5 = new PassengerNode("2a",new Passenger("Adalhaid Milda",950562,"2a",1,2500));
		PassengerNode s4p6 = new PassengerNode("1e",new Passenger("Oskars Muthoni",396014,"1e",2,25));
		PassengerNode s4p7 = new PassengerNode("2c",new Passenger("Anastasia Amahle",1130584,"2c",0,365));
		PassengerNode s4p8 = new PassengerNode("2d",new Passenger("Yasen Alaric",851944,"2d",5,653));
		PassengerNode s4p9 = new PassengerNode("2e",new Passenger("Rozalija Raginaharjaz",1042984,"2e",3,536));
		PassengerNode s4p10 = new PassengerNode("1b",new Passenger("Yarik Komang",44100,"1b",4,9564));

		ArrayList<PassengerNode> passengers = new ArrayList<>();
		passengers.add(s4p1);
		passengers.add(s4p2);
		passengers.add(s4p3);
		passengers.add(s4p4);
		passengers.add(s4p5);
		passengers.add(s4p6);
		passengers.add(s4p7);
		passengers.add(s4p8);
		passengers.add(s4p9);
		passengers.add(s4p10);
		return passengers;

	}
	public ArrayList setUpStage5(){
		PassengerNode s5p1 = new PassengerNode("1a",new Passenger("olvir Eusebius",1110,"1a",0,0));
		PassengerNode s5p2 = new PassengerNode("2b",new Passenger("Cassian Rufina",290123,"2b",0,0));
		PassengerNode s5p3 = new PassengerNode("3c",new Passenger("Harpreet Aleksandra",18200,"3c",0,0));
		PassengerNode s5p4 = new PassengerNode("4d",new Passenger("Oskars Muthoni",610340,"4d",0,0));
		PassengerNode s5p5 = new PassengerNode("2a",new Passenger("Anastasia Amahle",950562,"2a",0,0));
		PassengerNode s5p6 = new PassengerNode("1b",new Passenger("Yasen Alaric",396014,"1b",0,0));
		PassengerNode s5p7 = new PassengerNode("2c",new Passenger("Rozalija Raginaharjaz",1130584,"2c",0,0));
		PassengerNode s5p8 = new PassengerNode("1d",new Passenger("Yarik Komang",851944,"1d",0,0));
		ArrayList<PassengerNode> passengers = new ArrayList<>();
		passengers.add(s5p1);
		passengers.add(s5p2);
		passengers.add(s5p3);
		passengers.add(s5p4);
		passengers.add(s5p5);
		passengers.add(s5p6);
		passengers.add(s5p7);
		passengers.add(s5p8);
		return passengers;
	}
	public ArrayList setUpStage6(){
		PassengerNode s6p1 = new PassengerNode("1a",new Passenger("olvir Eusebius",1110,"1a",1,350));
		PassengerNode s6p2 = new PassengerNode("2b",new Passenger("Cassian Rufina",290123,"2b",2,125));
		PassengerNode s6p3 = new PassengerNode("3c",new Passenger("Harpreet Aleksandra",18200,"3c",3,500));
		PassengerNode s6p4 = new PassengerNode("4d",new Passenger("Oskars Muthoni",610340,"4d",4,95));
		PassengerNode s6p5 = new PassengerNode("2a",new Passenger("Anastasia Amahle",950562,"2a",5,350));
		PassengerNode s6p6 = new PassengerNode("1b",new Passenger("Yasen Alaric",396014,"1b",1,95));
		PassengerNode s6p7 = new PassengerNode("2c",new Passenger("Rozalija Raginaharjaz",1130584,"2c",4,125));
		PassengerNode s6p8 = new PassengerNode("1d",new Passenger("Yarik Komang",851944,"1d",2,500));
		ArrayList<PassengerNode> passengers = new ArrayList<>();
		passengers.add(s6p1);
		passengers.add(s6p2);
		passengers.add(s6p3);
		passengers.add(s6p4);
		passengers.add(s6p5);
		passengers.add(s6p6);
		passengers.add(s6p7);
		passengers.add(s6p8);
		return passengers;
	}
	public ArrayList setUpStage8(){
		PassengerNode s8p1 = new PassengerNode("1a",new Passenger("olvir Eusebius",1110,"1a",1,350));
		ArrayList<PassengerNode> passengers = new ArrayList<>();
		passengers.add(s8p1);
		return passengers;
	}
	public ArrayList setUpStage9(){
		PassengerNode s9p1 = new PassengerNode("4a",new Passenger("anatoly karpov",1110290182,"4a",0,908));
		ArrayList<PassengerNode> passengers = new ArrayList<>();
		passengers.add(s9p1);
		return passengers;
	}
	
	
	public void queueaddtest1(){
	   setUpStage1();
	   ArrayList<PassengerNode> pass = new ArrayList<>(setUpStage4());
	   try{
		   Queue qu= new Queue(new passengerComparator());
		   qu.add(pass.get(0));
		   qu.add(pass.get(1));
		   qu.add(pass.get(2));
		   qu.add(pass.get(3));
		   qu.add(pass.get(4));
		   qu.add(pass.get(5));
		   qu.add(pass.get(6));
		   qu.add(pass.get(7));
		   qu.add(pass.get(8));
		   qu.add(pass.get(9));
		   assertEquals(10,qu.size());

		   boolean b=qu.poll().equals(pass.get(4));
		   assertEquals(true,b);
		   b=qu.poll().equals(pass.get(0));
		   assertEquals(true,b);
		   b=qu.poll().equals(pass.get(9));
		   assertEquals(true,b);
		   b=qu.poll().equals(pass.get(1));
		   assertEquals(true,b);
		   b=qu.poll().equals(pass.get(2));
		   assertEquals(true,b);
		   b=qu.poll().equals(pass.get(6));
		   assertEquals(true,b);
		   b=qu.poll().equals(pass.get(3));
		   assertEquals(true,b);
		   b=qu.poll().equals(pass.get(7));
		   assertEquals(true,b);
		   b=qu.poll().equals(pass.get(5));
		   assertEquals(true,b);
		   b=qu.poll().equals(pass.get(8));
		   assertEquals(true,b);
	    }catch (Exception e){
		   fail();
	    }
    }
	public void queueaddtest2(){
        setUpStage1();
		ArrayList<PassengerNode> pass = new ArrayList<>(setUpStage6());
		ArrayList<PassengerNode> pass2 = new ArrayList<>(setUpStage8());
		try{
		    Queue qu= new Queue(new passengerComparator());
		   qu.add(pass.get(0));
		   qu.add(pass.get(1));
		   qu.add(pass.get(2));
		   qu.add(pass.get(3));
		   qu.add(pass.get(4));
		   qu.add(pass.get(5));
		   qu.add(pass.get(6));
		   qu.add(pass.get(7));
		   qu.add(pass2.get(0));
		   fail();
		}catch(DuplicatedObjectExeption e){
			assertNotNull(e);
		}
    }
	public void queueaddtest3(){
		   setUpStage3();
		   ArrayList<PassengerNode> pass = new ArrayList<>(setUpStage4());
		   ArrayList<PassengerNode> pass2 = new ArrayList<>(setUpStage9());

		try{
		   Queue qu= new Queue(new passengerComparator());
		   qu.add(pass.get(0));
		   qu.add(pass.get(1));
		   qu.add(pass.get(2));
		   qu.add(pass.get(3));
		   qu.add(pass.get(4));
		   qu.add(pass.get(5));
		   qu.add(pass.get(6));
		   qu.add(pass.get(7));
		   qu.add(pass.get(8));
		   qu.add(pass.get(9));
		   qu.add(pass2.get(0));
		   assertEquals(11,qu.size());

		   boolean b=qu.poll().equals(pass.get(4));
		   assertEquals(true,b);

		   b=qu.poll().equals(pass2.get(0));
		   assertEquals(true,b);

		   b=qu.poll().equals(pass.get(0));
		   assertEquals(true,b);

		   b=qu.poll().equals(pass.get(9));
		   assertEquals(true,b);

		   b=qu.poll().equals(pass.get(1));
		   assertEquals(true,b);

		   b=qu.poll().equals(pass.get(2));
		   assertEquals(true,b);

		   b=qu.poll().equals(pass.get(6));
		   assertEquals(true,b);

		   b=qu.poll().equals(pass.get(3));
		   assertEquals(true,b);

		   b=qu.poll().equals(pass.get(7));
		   assertEquals(true,b);

		   b=qu.poll().equals(pass.get(5));
		   assertEquals(true,b);

		   b=qu.poll().equals(pass.get(8));
		   assertEquals(true,b);
	    }catch (Exception e){
		   fail();
	    }
    }
	
	public void queuepolltest1(){
	   setUpStage1();
	   ArrayList<PassengerNode> pass = new ArrayList<>(setUpStage4());
	   try{
		   Queue qu= new Queue(new passengerComparator());
		   qu.add(pass.get(0));
		   qu.add(pass.get(1));
		   qu.add(pass.get(2));
		   qu.add(pass.get(3));
		   qu.add(pass.get(4));
		   qu.add(pass.get(5));
		   qu.add(pass.get(6));
		   qu.add(pass.get(7));
		   qu.add(pass.get(8));
		   qu.add(pass.get(9));
		   boolean b=qu.poll().equals(pass.get(4));
		   assertEquals(true,b);
	    }catch (Exception e){
		   fail();
	    }
    }
	
	public void queuepolltest2(){
	   setUpStage1();
	   try{
		   Queue qu= new Queue(new passengerComparator());
		   assertEquals(null,qu.poll());
	    }catch (Exception e){
		   fail();
	    }
    }
	
	
	public void queuepolltest3(){
		   setUpStage3();
		   ArrayList<PassengerNode> pass = new ArrayList<>(setUpStage4());
		   ArrayList<PassengerNode> pass2 = new ArrayList<>(setUpStage9());
		try{
		   Queue qu= new Queue(new passengerComparator());
			qu.add(pass.get(0));
			qu.add(pass.get(1));
			qu.add(pass.get(2));
			qu.add(pass.get(3));
			qu.add(pass.get(4));
			qu.add(pass.get(5));
			qu.add(pass.get(6));
			qu.add(pass.get(7));
			qu.add(pass.get(8));
			qu.add(pass.get(9));
			qu.add(pass2.get(0));
		   boolean b=qu.poll().equals(pass.get(4));
		   assertEquals(true,b);
	    }catch (Exception e){
		   fail();
	    }
    }
	
	public void queueisEmptytest1(){
	   setUpStage1();
	   ArrayList<PassengerNode> pass = new ArrayList<>(setUpStage4());
	   try{
		   Queue qu= new Queue(new passengerComparator());
		   qu.add(pass.get(0));
		   qu.add(pass.get(1));
		   qu.add(pass.get(2));
		   qu.add(pass.get(3));
		   qu.add(pass.get(4));
		   qu.add(pass.get(5));
		   qu.add(pass.get(6));
		   qu.add(pass.get(7));
		   qu.add(pass.get(8));
		   qu.add(pass.get(9));
		   assertEquals(false,qu.isEmpty());
	    }catch (Exception e){
		   fail();
	    }
    }
	
	public void queueisEmptytest2(){
	   setUpStage2();
	   try{
		   Queue qu= new Queue(new passengerComparator());
		   assertEquals(true,qu.isEmpty());
	    }catch (Exception e){
		   fail();
	    }
    }
	
	
}