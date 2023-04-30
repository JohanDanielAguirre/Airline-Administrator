package test;
import junit.framework.TestCase;
import java.util.*;
import model.*;
import Exeptions.*;
public class HashTabletest extends TestCase {
	
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
		Passenger s4p1 = new Passenger("olvir Eusebius",1110,1a,10,none,2023-04-01 08:30:00);
		Passenger s4p2 = new Passenger("Cassian Rufina",290123,2b,100,none,2023-04-01 10:15:00);
		Passenger s4p3 = new Passenger("Erkan Noriko",18200,1c,1000,none,2023-04-01 11:00:00);
		Passenger s4p4 = new Passenger("Harpreet Aleksandra",610340,1d,250,none,2023-04-01 12:45:00);
		Passenger s4p5 = new Passenger("Adalhaid Milda",950562,2a,2500,physical disability,2023-04-01 13:30:00);
		Passenger s4p6 = new Passenger("Oskars Muthoni",396014,1e,25,mental disability,2023-04-01 15:00:00);
		Passenger s4p7 = new Passenger("Anastasia Amahle",1130584,2c,365,none,2023-04-01 16:15:00);
		Passenger s4p8 = new Passenger("Yasen Alaric",851944,2d,653,kid,2023-04-01 18:00:00);
		Passenger s4p9 = new Passenger("Rozalija Raginaharjaz",1042984,2e,536,age,2023-04-01 19:45:00);
		Passenger s4p10 = new Passenger("Yarik Komang",44100,1b,9564,pregnancy,2023-04-01 20:30:00);
	}	
	public void setUpStage5(){
		Passenger s5p1 = new Passenger("olvir Eusebius",1110,1a,0,none,2023-04-01 08:30:00);
		Passenger s5p2 = new Passenger("Cassian Rufina",290123,2b,0,none,2023-04-01 10:15:00);
		Passenger s5p3 = new Passenger("Harpreet Aleksandra",18200,3c,0,none,2023-04-01 11:00:00);
		Passenger s5p4 = new Passenger("Oskars Muthoni",610340,4d,0,none,2023-04-01 12:45:00);
		Passenger s5p5 = new Passenger("Anastasia Amahle",950562,2a,0,none,2023-04-01 13:30:00);
		Passenger s5p6 = new Passenger("Yasen Alaric",396014,1b,0,none,2023-04-01 15:00:00);
		Passenger s5p7 = new Passenger("Rozalija Raginaharjaz",1130584,2c,0,none,2023-04-01 16:15:00);
		Passenger s5p8 = new Passenger("Yarik Komang",851944,1d,0,none,2023-04-01 18:00:00);
    }
	public void setUpStage6(){
		Passenger s6p1 = new Passenger("olvir Eusebius",1110,1a,350,physical disability,2023-04-01 08:30:00);
		Passenger s6p2 = new Passenger("Cassian Rufina",290123,2b,125,mental disability,2023-04-01 10:15:00);
		Passenger s6p3 = new Passenger("Harpreet Aleksandra",18200,3c,500,age,2023-04-01 11:00:00);
		Passenger s6p4 = new Passenger("Oskars Muthoni",610340,4d,95,pregnancy,2023-04-01 12:45:00);
		Passenger s6p5 = new Passenger("Anastasia Amahle",950562,2a,350,kid,2023-04-01 13:30:00);
		Passenger s6p6 = new Passenger("Yasen Alaric",396014,1b,95,physical disability,2023-04-01 15:00:00);
		Passenger s6p7 = new Passenger("Rozalija Raginaharjaz",1130584,2c,125,pregnancy,2023-04-01 16:15:00);
		Passenger s6p8 = new Passenger("Yarik Komang",851944,1d,500,mental disability,2023-04-01 18:00:00);
    }
	public void setUpStage7(){
		Passenger s7p1 = new Passenger("olvir Eusebius",A100,1a,350,physical disability,2023-04-01 10:15:00);
		Passenger s7p2 = new Passenger("Cassian Rufina",290123,2b,125,mental disability,2023-04-01 10:15:00);
		Passenger s7p3 = new Passenger("Harpreet Aleksandra",18R200,3c,500,age,2023-04-01 11:00:00);
		Passenger s7p4 = new Passenger("Oskars Muthoni",610+340,4d,95,pregnancy,2023-04-01 12:45:00);
		Passenger s7p5 = new Passenger("Anastasia Amahle",950562,5e,350,kid,2023-04-01 13:30:00);
		Passenger s7p6 = new Passenger("Yasen Alaric",396*014,6f,95,physical disability,2023-04-01 15:00:00);
		Passenger s7p7 = new Passenger("Rozalija Raginaharjaz",1130584,7,pregnancy,2023-04-01 16:15:00);
		Passenger s7p8 = new Passenger("Yarik Komang",851+-944,8p,125,s00,mental disability,2023-04-01 18:00:00);
    }
	public void setUpStage8(){
		Passenger s8p1 = new Passenger("olvir Eusebius",1110,1a,350,physical disability,2023-04-01 08:30:00);
    }
	public void setUpStage9(){
		Passenger s9p1 = new Passenger("anatoly karpov",1110290182,4a,908,none,2023-04-01 08:35:00);
    }
	
	
	public void HashInserttest1(){
	   setUpStage4();
	   setUpStage8();
	   try{
		   HashTable has= new HashTable(1);
		   has.insert(s4p1.getticket(),s4p1);
		   has.insert(s4p2.getticket(),s4p2);
		   has.insert(s4p3.getticket(),s4p3);
		   has.insert(s4p4.getticket(),s4p4);
		   has.insert(s4p5.getticket(),s4p5);
		   has.insert(s4p6.getticket(),s4p6);
		   has.insert(s4p7.getticket(),s4p7);
		   has.insert(s4p8.getticket(),s4p8);
		   has.insert(s4p9.getticket(),s4p9);
		   has.insert(s4p10.getticket(),s4p10);
		   has.insert(s8p1.getticket(),s8p1);
		   assertEquals(11,has.getsize());
	   }catch (Exception e){
		   fail();
	   }
    }
	public void HashInserttest2(){
        setUpStage6();
		setUpStage8();
		try{
		   HashTable has= new HashTable(1);
		   has.insert(s6p1.getticket(),s6p1);
		   has.insert(s6p2.getticket(),s6p2);
		   has.insert(s6p3.getticket(),s6p3);
		   has.insert(s6p4.getticket(),s6p4);
		   has.insert(s6p5.getticket(),s6p5);
		   has.insert(s6p6.getticket(),s6p6);
		   has.insert(s6p7.getticket(),s6p7);
		   has.insert(s6p8.getticket(),s6p8);
		   has.insert(s8p1.getticket(),s8p1);
		   fail();
		}catch(DuplicatedObjectExeption e){
			assertNotNull(e);
		}
    }
	public void HashInserttest3(){
      setUpStage1();
	  try{
		HashTable has= new HashTable(1);
		has.insert(fly1.getnumflight(),fly1);
		fail();
	  }catch(IncorrectObjectExeption e){
		 assertNotNull(e); 
	  }
    }
	
	public void HashDeletetest1(){
	   setUpStage4();
	   setUpStage8();
	   try{
		   HashTable has= new HashTable(1);
		   has.insert(s4p1.getticket(),s4p1);
		   has.insert(s4p2.getticket(),s4p2);
		   has.insert(s4p3.getticket(),s4p3);
		   has.insert(s4p4.getticket(),s4p4);
		   has.insert(s4p5.getticket(),s4p5);
		   has.insert(s4p6.getticket(),s4p6);
		   has.insert(s4p7.getticket(),s4p7);
		   has.insert(s4p8.getticket(),s4p8);
		   has.insert(s4p9.getticket(),s4p9);
		   has.insert(s4p10.getticket(),s4p10);
		   has.delete(s8p1.getticket());
		   fail();
	   }catch (NonexistObjectExeption e){
		   assertNotNull(e);
	   }
    }
	public void HashDeletetest2(){
        setUpStage6();
		setUpStage8();
		try{
		   HashTable has= new HashTable(1);
		   has.insert(s6p1.getticket(),s6p1);
		   has.insert(s6p2.getticket(),s6p2);
		   has.insert(s6p3.getticket(),s6p3);
		   has.insert(s6p4.getticket(),s6p4);
		   has.insert(s6p5.getticket(),s6p5);
		   has.insert(s6p6.getticket(),s6p6);
		   has.insert(s6p7.getticket(),s6p7);
		   has.insert(s6p8.getticket(),s6p8);
		   has.delete(s8p1.getticket(),s8p1);
		   assertEquals(7,has.getsize());
		}catch(Exception e){
			fail();
		}
    }
	
	public void HashDeletetest3(){
      setUpStage1();
	  try{
		HashTable has= new HashTable(1);
		has.delete(fly1.getnumflight());
		fail();
	  }catch(IncorrectObjectExeption e){
		 assertNotNull(e); 
	  }
    }
	
	public void HashSearchtest1(){
	   setUpStage4();
	   setUpStage8();
	   try{
		   HashTable has= new HashTable(1);
		   has.insert(s4p1.getticket(),s4p1);
		   has.insert(s4p2.getticket(),s4p2);
		   has.insert(s4p3.getticket(),s4p3);
		   has.insert(s4p4.getticket(),s4p4);
		   has.insert(s4p5.getticket(),s4p5);
		   has.insert(s4p6.getticket(),s4p6);
		   has.insert(s4p7.getticket(),s4p7);
		   has.insert(s4p8.getticket(),s4p8);
		   has.insert(s4p9.getticket(),s4p9);
		   has.insert(s4p10.getticket(),s4p10);
		   Passenger p= new Passenger(has.search(s8p1.getticket()));
		   fail();
	   }catch (NonexistObjectExeption e){
		   assertNotNull(e);
	   }
    }
	public void HashSearchtest2(){
        setUpStage6();
		setUpStage8();
		try{
		   HashTable has= new HashTable(1);
		   has.insert(s6p1.getticket(),s6p1);
		   has.insert(s6p2.getticket(),s6p2);
		   has.insert(s6p3.getticket(),s6p3);
		   has.insert(s6p4.getticket(),s6p4);
		   has.insert(s6p5.getticket(),s6p5);
		   has.insert(s6p6.getticket(),s6p6);
		   has.insert(s6p7.getticket(),s6p7);
		   has.insert(s6p8.getticket(),s6p8);
		   Passenger p= new Passenger (has.search(s8p1.getticket(),s8p1));
		   Passenger s8p1 = new Passenger(" ",1110,1a,350,physical disability,2023-04-01 08:30:00);
		   assertEquals("olvir Eusebius",p.getname());
		   assertEquals(1110,p.getid());
		   assertEquals(1a,p.getticket());
		   assertEquals(350,p.getmiles());
		   assertEquals(physical disability,p.gettypeofhelp());
		   assertEquals(2023-04-01 08:30:00,p.getArrivaltime());
		}catch(Exception e){
			fail();
		}
    }
	
	public void HashSearchtest3(){
      setUpStage1();
	  try{
		HashTable has= new HashTable(1);
		has.search(fly1.getnumflight());
		fail();
	  }catch(IncorrectObjectExeption e){
		 assertNotNull(e); 
	  }
    }
	
}