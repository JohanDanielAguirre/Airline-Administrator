package test;
import junit.framework.TestCase;
import java.util.*;
import model.*;
import Exeptions.*;
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
	public void setUpStage4(){
		Passenger s4p1 = new Passenger("olvir Eusebius",1110,"1a",10,0,2023-04-01 08:30:00);
		Passenger s4p2 = new Passenger("Cassian Rufina",290123,"2b",100,0,2023-04-01 10:15:00);
		Passenger s4p3 = new Passenger("Erkan Noriko",18200,"1c",1000,0,2023-04-01 11:00:00);
		Passenger s4p4 = new Passenger("Harpreet Aleksandra",610340,"1d",250,0,2023-04-01 12:45:00);
		Passenger s4p5 = new Passenger("Adalhaid Milda",950562,"2a",2500,1,2023-04-01 13:30:00);
		Passenger s4p6 = new Passenger("Oskars Muthoni",396014,"1e",25,2,2023-04-01 15:00:00);
		Passenger s4p7 = new Passenger("Anastasia Amahle",1130584,"2c",365,0,2023-04-01 16:15:00);
		Passenger s4p8 = new Passenger("Yasen Alaric",851944,"2d",653,5,2023-04-01 18:00:00);
		Passenger s4p9 = new Passenger("Rozalija Raginaharjaz",1042984,"2e",536,3,2023-04-01 19:45:00);
		Passenger s4p10 = new Passenger("Yarik Komang",44100,"1b",9564,4,2023-04-01 20:30:00);
	}	
	public void setUpStage5(){
		Passenger s5p1 = new Passenger("olvir Eusebius",1110,"1a",0,0,2023-04-01 08:30:00);
		Passenger s5p2 = new Passenger("Cassian Rufina",290123,"2b",0,0,2023-04-01 10:15:00);
		Passenger s5p3 = new Passenger("Harpreet Aleksandra",18200,"3c",0,0,2023-04-01 11:00:00);
		Passenger s5p4 = new Passenger("Oskars Muthoni",610340,"4d",0,0,2023-04-01 12:45:00);
		Passenger s5p5 = new Passenger("Anastasia Amahle",950562,"2a",0,0,2023-04-01 13:30:00);
		Passenger s5p6 = new Passenger("Yasen Alaric",396014,"1b",0,0,2023-04-01 15:00:00);
		Passenger s5p7 = new Passenger("Rozalija Raginaharjaz",1130584,"2c",0,0,2023-04-01 16:15:00);
		Passenger s5p8 = new Passenger("Yarik Komang",851944,"1d",0,0,2023-04-01 18:00:00);
    }
	public void setUpStage6(){
		Passenger s6p1 = new Passenger("olvir Eusebius",1110,"1a",350,1,2023-04-01 08:30:00);
		Passenger s6p2 = new Passenger("Cassian Rufina",290123,"2b",125,2,2023-04-01 10:15:00);
		Passenger s6p3 = new Passenger("Harpreet Aleksandra",18200,"3c",500,3,2023-04-01 11:00:00);
		Passenger s6p4 = new Passenger("Oskars Muthoni",610340,"4d",95,4,2023-04-01 12:45:00);
		Passenger s6p5 = new Passenger("Anastasia Amahle",950562,"2a",350,5,2023-04-01 13:30:00);
		Passenger s6p6 = new Passenger("Yasen Alaric",396014,"1b",95,1,2023-04-01 15:00:00);
		Passenger s6p7 = new Passenger("Rozalija Raginaharjaz",1130584,"2c",125,4,2023-04-01 16:15:00);
		Passenger s6p8 = new Passenger("Yarik Komang",851944,"1d",500,2,2023-04-01 18:00:00);
    }
	public void setUpStage8(){
		Passenger s8p1 = new Passenger("olvir Eusebius",1110,"1a",350,1,2023-04-01 08:30:00);
    }
	public void setUpStage9(){
		Passenger s9p1 = new Passenger("anatoly karpov",1110290182,"4a",908,0,2023-04-01 08:35:00);
    }
	
	
	public void queueaddtest1(){
	   setUpStage1();
	   setUpStage4();

	   try{
		   Queue qu= new Queue();
		   qu.add(s4p1);
		   qu.add(s4p2);
		   qu.add(s4p3);
		   qu.add(s4p4);
		   qu.add(s4p5);
		   qu.add(s4p6);
		   qu.add(s4p7);
		   qu.add(s4p8);
		   qu.add(s4p9);
		   qu.add(s4p10);
		   assertEquals(10,qu.getsize());
		   Passenger p= new Passenger(qu.poll());
		   boolean b=p.equals(s4p5);
		   assertEquals(true,b);
		   p=qu.poll();
		   b=p.equals(s4p1);
		   assertEquals(true,b);
		   p=qu.poll();
		   b=p.equals(s4p10);
		   assertEquals(true,b);
		   p=qu.poll();
		   b=p.equals(s4p2);
		   assertEquals(true,b);
		   p=qu.poll();
		   b=p.equals(s4p3);
		   assertEquals(true,b);
		   p=qu.poll();
		   b=p.equals(s4p7);
		   assertEquals(true,b);
		   p=qu.poll();
		   b=p.equals(s4p4);
		   assertEquals(true,b);
		   p=qu.poll();
		   b=p.equals(s4p8);
		   assertEquals(true,b);
		   p=qu.poll();
		   b=p.equals(s4p6);
		   assertEquals(true,b);
		   p=qu.poll();
		   b=p.equals(s4p9);
		   assertEquals(true,b);
	    }catch (Exception e){
		   fail();
	    }
    }
	public void queueaddtest2(){
        setUpStage1();
		setUpStage6();
		setUpStage8();
		try{
		    Queue qu= new Queue();
		   qu.add(s6p1);
		   qu.add(s6p2);
		   qu.add(s6p3);
		   qu.add(s6p4);
		   qu.add(s6p5);
		   qu.add(s6p6);
		   qu.add(s6p7);
		   qu.add(s6p8);
		   qu.add(s8p1);
		   fail();
		}catch(DuplicatedObjectExeption e){
			assertNotNull(e);
		}
    }
	public void queueaddtest3(){
		   setUpStage3();
		   setUpStage4();
		   setUpStage9();
		try{
		   Queue qu= new Queue();
		   qu.add(s4p1);
		   qu.add(s4p2);
		   qu.add(s4p3);
		   qu.add(s4p4);
		   qu.add(s4p5);
		   qu.add(s4p6);
		   qu.add(s4p7);
		   qu.add(s4p8);
		   qu.add(s4p9);
		   qu.add(s4p10);
		   qu.add(s8p1);
		   assertEquals(11,qu.getsize());
		   Passenger p= new Passenger(qu.poll());
		   boolean b=p.equals(s4p5);
		   assertEquals(true,b);
		   p=qu.poll();
		   b=p.equals(s9p1);
		   assertEquals(true,b);
		   p=qu.poll();
		   b=p.equals(s4p1);
		   assertEquals(true,b);
		   p=qu.poll();
		   b=p.equals(s4p10);
		   assertEquals(true,b);
		   p=qu.poll();
		   b=p.equals(s4p2);
		   assertEquals(true,b);
		   p=qu.poll();
		   b=p.equals(s4p3);
		   assertEquals(true,b);
		   p=qu.poll();
		   b=p.equals(s4p7);
		   assertEquals(true,b);
		   p=qu.poll();
		   b=p.equals(s4p4);
		   assertEquals(true,b);
		   p=qu.poll();
		   b=p.equals(s4p8);
		   assertEquals(true,b);
		   p=qu.poll();
		   b=p.equals(s4p6);
		   assertEquals(true,b);
		   p=qu.poll();
		   b=p.equals(s4p9);
		   assertEquals(true,b);
	    }catch (Exception e){
		   fail();
	    }
    }
	
	public void queuepolltest1(){
	   setUpStage1();
	   setUpStage4();
	   try{
		   Queue qu= new Queue();
		   qu.add(s4p1.getticket(),s4p1);
		   qu.add(s4p2.getticket(),s4p2);
		   qu.add(s4p3.getticket(),s4p3);
		   qu.add(s4p4.getticket(),s4p4);
		   qu.add(s4p5.getticket(),s4p5);
		   qu.add(s4p6.getticket(),s4p6);
		   qu.add(s4p7.getticket(),s4p7);
		   qu.add(s4p8.getticket(),s4p8);
		   qu.add(s4p9.getticket(),s4p9);
		   qu.add(s4p10.getticket(),s4p10);
		   Passenger p= new Passenger(qu.poll());
		   boolean b=p.equals(s4p5);
		   assertEquals(true,b);
	    }catch (Exception e){
		   fail();
	    }
    }
	
	public void queuepolltest2(){
	   setUpStage1();
	   try{
		   Queue qu= new Queue();
		   Passenger p= new Passenger(qu.poll());
		   assertEquals(null,p);
	    }catch (Exception e){
		   fail();
	    }
    }
	
	
	public void queuepolltest3(){
		   setUpStage3();
		   setUpStage4();
		   setUpStage9();
		try{
		   Queue qu= new Queue();
		   qu.add(s4p1);
		   qu.add(s4p2);
		   qu.add(s4p3);
		   qu.add(s4p4);
		   qu.add(s4p5);
		   qu.add(s4p6);
		   qu.add(s4p7);
		   qu.add(s4p8);
		   qu.add(s4p9);
		   qu.add(s4p10);
		   qu.add(s8p1);
		   Passenger p= new Passenger(qu.poll());
		   boolean b=p.equals(s4p5);
		   assertEquals(true,b);
	    }catch (Exception e){
		   fail();
	    }
    }
	
	public void queueisEmptytest1(){
	   setUpStage1();
	   setUpStage4();
	   try{
		   Queue qu= new Queue();
		   qu.add(s4p1);
		   qu.add(s4p2);
		   qu.add(s4p3);
		   qu.add(s4p4);
		   qu.add(s4p5);
		   qu.add(s4p6);
		   qu.add(s4p7);
		   qu.add(s4p8);
		   qu.add(s4p9);
		   qu.add(s4p10);
		   boolean b=qu.isEmpty();
		   assertEquals(false,b);
	    }catch (Exception e){
		   fail();
	    }
    }
	
	public void queueisEmptytest2(){
	   setUpStage2();
	   try{
		   Queue qu= new Queue();
		   boolean b=qu.isEmpty();
		   assertEquals(true,b);
	    }catch (Exception e){
		   fail();
	    }
    }
	
	public void queueisEmptytest3(){
	   setUpStage3();
	   setUpStage7();
	   try{
		   Queue qu= new Queue();
		   qu.add(s7p1);
		   qu.add(s7p2);
		   qu.add(s7p3);
		   qu.add(s7p4);
		   qu.add(s7p5);
		   qu.add(s7p6);
		   qu.add(s7p7);
		   qu.add(s7p8);
		   boolean b=qu.isEmpty();
		   assertEquals(true,b);
	    }catch (Exception e){
		   fail();
	    }
    }
	
	
}