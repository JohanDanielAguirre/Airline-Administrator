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
		Passenger s4p1 = new Passenger("olvir Eusebius",1110,"1a",0,10);
		Passenger s4p2 = new Passenger("Cassian Rufina",290123,"2b",0,100);
		Passenger s4p3 = new Passenger("Erkan Noriko",18200,"1c",0,1000);
		Passenger s4p4 = new Passenger("Harpreet Aleksandra",610340,"1d",0,250);
		Passenger s4p5 = new Passenger("Adalhaid Milda",950562,"2a",1,2500);
		Passenger s4p6 = new Passenger("Oskars Muthoni",396014,"1e",2,25);
		Passenger s4p7 = new Passenger("Anastasia Amahle",1130584,"2c",0,365);
		Passenger s4p8 = new Passenger("Yasen Alaric",851944,"2d",5,653);
		Passenger s4p9 = new Passenger("Rozalija Raginaharjaz",1042984,"2e",3,536);
		Passenger s4p10 = new Passenger("Yarik Komang",44100,"1b",4,9564);
	}
	public void setUpStage5(){
		Passenger s5p1 = new Passenger("olvir Eusebius",1110,"1a",0,0);
		Passenger s5p2 = new Passenger("Cassian Rufina",290123,"2b",0,0);
		Passenger s5p3 = new Passenger("Harpreet Aleksandra",18200,"3c",0,0);
		Passenger s5p4 = new Passenger("Oskars Muthoni",610340,"4d",0,0);
		Passenger s5p5 = new Passenger("Anastasia Amahle",950562,"2a",0,0);
		Passenger s5p6 = new Passenger("Yasen Alaric",396014,"1b",0,0);
		Passenger s5p7 = new Passenger("Rozalija Raginaharjaz",1130584,"2c",0,0);
		Passenger s5p8 = new Passenger("Yarik Komang",851944,"1d",0,0);
	}
	public void setUpStage6(){
		Passenger s6p1 = new Passenger("olvir Eusebius",1110,"1a",1,350);
		Passenger s6p2 = new Passenger("Cassian Rufina",290123,"2b",2,125);
		Passenger s6p3 = new Passenger("Harpreet Aleksandra",18200,"3c",3,500);
		Passenger s6p4 = new Passenger("Oskars Muthoni",610340,"4d",4,95);
		Passenger s6p5 = new Passenger("Anastasia Amahle",950562,"2a",5,350);
		Passenger s6p6 = new Passenger("Yasen Alaric",396014,"1b",1,95);
		Passenger s6p7 = new Passenger("Rozalija Raginaharjaz",1130584,"2c",4,125);
		Passenger s6p8 = new Passenger("Yarik Komang",851944,"1d",2,500);
	}
	public void setUpStage8(){
		Passenger s8p1 = new Passenger("olvir Eusebius",1110,"1a",1,350);
	}
	public void setUpStage9(){
		Passenger s9p1 = new Passenger("anatoly karpov",1110290182,"4a",0,908);
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