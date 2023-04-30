package test;
import junit.framework.TestCase;
import java.util.*;
import model.*;
import Exeptions.*;
public class MaxHeaptest extends TestCase {
	
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
	
	
	public void MaxHeapinserttest1(){
	   setUpStage1();
	   setUpStage2();
	   try{
		   Maxheap mh= new Maxheap(2);
		   mh.insert(fly2,fly2);
		   fail();
	    }catch (IncorrectObjectExeption e){
		   assertNotNull();
	    }
    }
	public void MaxHeapinserttest2(){
        setUpStage1();
		try{
		    Maxheap mh= new Maxheap(2);
		   mh.insert(null,null);
		   fail();
		}catch(NonexistObjectExeption e){
			assertNotNull(e);
		}
    }
	public void MaxHeapinserttest3(){
		   setUpStage1();
		   setUpStage8();
		try{
		   Maxheap mh= new Maxheap(2);
		   mh.insert(s8p1.getticket(),s8p1);
		   assertequals(1,mh.getsize());
	    }catch (Exception e){
		   fail();
	    }
    }
	
	public void Maxheapmaximumtest1(){
	   setUpStage1();
	   setUpStage4();
	   try{
		   Maxheap mh= new Maxheap(11);
		   mh.insert(s4p1.getticket(),s4p1);
		   mh.insert(s4p2.getticket(),s4p2);
		   mh.insert(s4p3.getticket(),s4p3);
		   mh.insert(s4p4.getticket(),s4p4);
		   mh.insert(s4p5.getticket(),s4p5);
		   mh.insert(s4p6.getticket(),s4p6);
		   mh.insert(s4p7.getticket(),s4p7);
		   mh.insert(s4p8.getticket(),s4p8);
		   mh.insert(s4p9.getticket(),s4p9);
		   mh.insert(s4p10.getticket(),s4p10);
		   Passenger p= new Passenger(mh.maximum());
		   boolean b=p.equals(s4p5);
		   assertequals(true,b);
		   assertequals(10,mh.getsize());
	    }catch (Exception e){
		   fail();
	    }
    }
	
	public void Maxheapmaximumtest2(){
	   setUpStage1();
	   try{
		   Maxheap mh= new Maxheap(2);
		   Passenger p= new Passenger(mh.maximum());
		   assertequals(null,p);
		   assertequals(0,mh.getsize());
	    }catch (Exception e){
		   fail();
	    }
    }
	
	
	public void Maxheapmaximumtest3(){
		   setUpStage3();
		   setUpStage9();
		try{
		   Maxheap mh= new Maxheap(2);
		   mh.insert(s9p1.getticket(),s9p1);
		   Passenger p= new Passenger(mh.maximum());
		   boolean b=p.equals(s9p1);
		   assertequals(true,b);
		   assertequals(1,mh.getsize());
	    }catch (Exception e){
		   fail();
	    }
    }
	
	public void MaxheapExtractmaximumtest1(){
	   setUpStage1();
	   setUpStage4();
	   try{
		   Maxheap mh= new Maxheap(11);
		   mh.insert(s4p1.getticket(),s4p1);
		   mh.insert(s4p2.getticket(),s4p2);
		   mh.insert(s4p3.getticket(),s4p3);
		   mh.insert(s4p4.getticket(),s4p4);
		   mh.insert(s4p5.getticket(),s4p5);
		   mh.insert(s4p6.getticket(),s4p6);
		   mh.insert(s4p7.getticket(),s4p7);
		   mh.insert(s4p8.getticket(),s4p8);
		   mh.insert(s4p9.getticket(),s4p9);
		   mh.insert(s4p10.getticket(),s4p10);
		   Passenger p= new Passenger(mh.Extractmaximum());
		   boolean b=p.equals(s4p5);
		   assertequals(true,b);
		   assertequals(9,mh.getsize());
	    }catch (Exception e){
		   fail();
	    }
    }
	public void MaxheapExtractmaximumtest2(){
	   setUpStage1();
	   try{
		   Maxheap mh= new Maxheap();
		   Passenger p= new Passenger(mh.maximum());
		   assertequals(null,p);
		   assertequals(0,mh.getsize());
	    }catch (Exception e){
		   fail();
	    }
    }
	
	public void MaxheapExtractmaximumtest3(){
		   setUpStage3();
		   setUpStage9();
		try{
		   Maxheap mh= new Maxheap(2);
		   mh.insert(s9p1.getticket(),s9p1);
		   Passenger p= new Passenger(mh.maximum());
		   boolean b=p.equals(s9p1);
		   assertequals(true,b);
		   assertequals(0,mh.getsize());
	    }catch (Exception e){
		   fail();
	    }
    }
	
	public void Maxheapincreasekeytest1(){
		   setUpStage1();
		   setUpStage8();
		try{
		   Maxheap mh= new Maxheap(10);
		   mh.insert(s8p1.getticket(),s8p1);
		   int i =mh.increasekey(s8p1.getticket(),-100);
		   fail();
	    }catch(KeyExeption e){
			assertNotNull(e);
		}
    }
	
	public void Maxheapincreasekeytest2(){
		   setUpStage1();
		   setUpStage9();
		try{
		   Maxheap mh= new Maxheap(10);
		   mh.insert(s9p1.getticket(),s9p1);
		   int i =mh.increasekey(s9p1.getticket(),10000);
		   fail();
	    }catch(SizePlaneExeption e){
			assertNotNull(e);
		}
    }
	public void Maxheapincreasekeytest3(){
		   setUpStage1();
		   setUpStage8();
		try{
		   Maxheap mh= new Maxheap(10);
		   mh.insert(s8p1.getticket(),s8p1);
		   int i = mh.increasekey(s8p1.getticket(),1);
		   assertequals(1,i);
	    }catch(Exception e){
			fail();
		}
    }
	
}