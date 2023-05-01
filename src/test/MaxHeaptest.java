package test;
import junit.framework.TestCase;
import java.util.*;
import model.*;
import Exeptions.*;
public class MaxHeaptest extends TestCase {

	public Plane setUpStage1(){
		Plane fly1= new Plane(/*numFLight*/ "MidgetAirlines",/*rows*/5,/*columns*/ 1,/*rowsfirstclass*/ 2);
		return fly1;
	}
	public Plane setUpStage2(){
		Plane fly2= new Plane(/*numFLight*/ "Drugmaxdealer",/*rows*/4,/*columns*/ 2,/*rowsfirstclass*/ 0);
		return fly2;
	}
	public Plane setUpStage3(){
		Plane fly3= new Plane(/*numFLight*/ "Viagrafly",/*rows*/4,/*columns*/ 2,/*rowsfirstclass*/ 4);
		return fly3;
	}
	public ArrayList setUpStage4(){
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

		ArrayList<Passenger> passengers = new ArrayList<>();
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
		Passenger s5p1 = new Passenger("olvir Eusebius",1110,"1a",0,0);
		Passenger s5p2 = new Passenger("Cassian Rufina",290123,"2b",0,0);
		Passenger s5p3 = new Passenger("Harpreet Aleksandra",18200,"3c",0,0);
		Passenger s5p4 = new Passenger("Oskars Muthoni",610340,"4d",0,0);
		Passenger s5p5 = new Passenger("Anastasia Amahle",950562,"2a",0,0);
		Passenger s5p6 = new Passenger("Yasen Alaric",396014,"1b",0,0);
		Passenger s5p7 = new Passenger("Rozalija Raginaharjaz",1130584,"2c",0,0);
		Passenger s5p8 = new Passenger("Yarik Komang",851944,"1d",0,0);
		ArrayList<Passenger> passengers = new ArrayList<>();
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
		Passenger s6p1 = new Passenger("olvir Eusebius",1110,"1a",1,350);
		Passenger s6p2 = new Passenger("Cassian Rufina",290123,"2b",2,125);
		Passenger s6p3 = new Passenger("Harpreet Aleksandra",18200,"3c",3,500);
		Passenger s6p4 = new Passenger("Oskars Muthoni",610340,"4d",4,95);
		Passenger s6p5 = new Passenger("Anastasia Amahle",950562,"2a",5,350);
		Passenger s6p6 = new Passenger("Yasen Alaric",396014,"1b",1,95);
		Passenger s6p7 = new Passenger("Rozalija Raginaharjaz",1130584,"2c",4,125);
		Passenger s6p8 = new Passenger("Yarik Komang",851944,"1d",2,500);
		ArrayList<Passenger> passengers = new ArrayList<>();
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
		Passenger s8p1 = new Passenger("olvir Eusebius",1110,"1a",1,350);
		ArrayList<Passenger> passengers = new ArrayList<>();
		passengers.add(s8p1);
		return passengers;
	}
	public ArrayList setUpStage9(){
		Passenger s9p1 = new Passenger("anatoly karpov",1110290182,"4a",0,908);
		ArrayList<Passenger> passengers = new ArrayList<>();
		passengers.add(s9p1);
		return passengers;
	}
	
	public void MaxHeapinserttest2(){
		Plane fly1 = setUpStage1();
		try{
		    MaxHeap mh= new MaxHeap(2);
		   mh.insert(null);
		   fail();
		}catch(NonexistObjectExeption e){
			assertNotNull(e);
		}catch (SizePlaneExeption | KeyExeption e){
			fail();
		}
    }
	public void MaxHeapinserttest3(){
		Plane fly1 = setUpStage1();
		ArrayList<Passenger> pass2 = new ArrayList<>(setUpStage8());
		try{
		   MaxHeap mh= new MaxHeap(2);
		   mh.insert(pass2.get(0));
		   assertEquals(1,mh.getHeapSize());
	    }catch (Exception e){
		   fail();
	    }
    }
	
	public void Maxheapmaximumtest1(){
		Plane fly1 = setUpStage1();
		ArrayList<Passenger> pass = new ArrayList<>(setUpStage4());
	   try{
		   MaxHeap mh= new MaxHeap(11);
		   mh.insert(pass.get(0));
		   mh.insert(pass.get(1));
		   mh.insert(pass.get(2));
		   mh.insert(pass.get(3));
		   mh.insert(pass.get(4));
		   mh.insert(pass.get(5));
		   mh.insert(pass.get(6));
		   mh.insert(pass.get(7));
		   mh.insert(pass.get(8));
		   mh.insert(pass.get(9));

		   boolean b=mh.Maximum().equals(pass.get(4));
		   assertEquals(true,b);
		   assertEquals(10,mh.getHeapSize());
	    }catch (Exception e){
		   fail();
	    }
    }
	
	public void Maxheapmaximumtest2(){
		Plane fly1 = setUpStage1();
	   try{
		   MaxHeap mh= new MaxHeap(2);

		   assertEquals(null,mh.Maximum());
		   assertEquals(0,mh.getHeapSize());
	    }catch (Exception e){
		   fail();
	    }
    }
	
	
	public void Maxheapmaximumtest3(){
		Plane fly = setUpStage3();
		ArrayList<Passenger> pass = new ArrayList<>(setUpStage9());
		try{
		   MaxHeap mh= new MaxHeap(2);
		   mh.insert(pass.get(0));

		   boolean b=mh.Maximum().equals(pass.get(0));
		   assertEquals(true,b);
		   assertEquals(1,mh.getHeapSize());
	    }catch (Exception e){
		   fail();
	    }
    }
	
	public void MaxheapExtractmaximumtest1(){
		Plane fly1 = setUpStage1();
		ArrayList<Passenger> pass = new ArrayList<>(setUpStage4());
	   try{
		   MaxHeap mh= new MaxHeap(11);
		   mh.insert(pass.get(0));
		   mh.insert(pass.get(1));
		   mh.insert(pass.get(2));
		   mh.insert(pass.get(3));
		   mh.insert(pass.get(4));
		   mh.insert(pass.get(5));
		   mh.insert(pass.get(6));
		   mh.insert(pass.get(7));
		   mh.insert(pass.get(8));
		   mh.insert(pass.get(9));

		   boolean b=mh.extract_Max().equals(pass.get(4));
		   assertEquals(true,b);
		   assertEquals(9,mh.getHeapSize());
	    }catch (Exception e){
		   fail();
	    }
    }
	public void MaxheapExtractmaximumtest2(){
		Plane fly1 = setUpStage1();
	   try{
		   MaxHeap mh= new MaxHeap(0);

		   assertEquals(null,mh.Maximum());
		   assertEquals(0,mh.getHeapSize());
	    }catch (Exception e){
		   fail();
	    }
    }
	
	public void MaxheapExtractmaximumtest3(){
		Plane fly1 = setUpStage3();
		ArrayList<Passenger> pass = new ArrayList<>(setUpStage9());
		try{
		   MaxHeap mh= new MaxHeap(2);
		   mh.insert(pass.get(0));

		   boolean b=mh.Maximum().equals(pass.get(0));
		   assertEquals(true,b);
		   assertEquals(0,mh.getHeapSize());
	    }catch (Exception e){
		   fail();
	    }
    }
	
	public void Maxheapincreasekeytest1(){
		Plane fly1 = setUpStage1();
		ArrayList<Passenger> pass2 = new ArrayList<>(setUpStage8());
		try{
		   MaxHeap mh= new MaxHeap(10);
		   mh.insert(pass2.get(0));
		   mh.increase_Key(0,-100);
		   fail();
	    }catch(KeyExeption e){
			assertNotNull(e);
		}catch (SizePlaneExeption | NonexistObjectExeption e){
			fail();
		}
    }
	
	public void Maxheapincreasekeytest2(){
		Plane fly1 = setUpStage1();
		ArrayList<Passenger> pass = new ArrayList<>(setUpStage9());
		try{
		   MaxHeap mh= new MaxHeap(10);
		   mh.insert(pass.get(0));
		   mh.increase_Key(0,10000);
		   fail();
	    }catch(SizePlaneExeption e){
			assertNotNull(e);
		}catch (KeyExeption | NonexistObjectExeption e){
			fail();
		}
    }
	public void Maxheapincreasekeytest3(){
		Plane fly1 = setUpStage1();
		ArrayList<Passenger> pass2 = new ArrayList<>(setUpStage8());
		try{
		   MaxHeap mh= new MaxHeap(10);
		   mh.insert(pass2.get(0));
		   mh.increase_Key(0,1);
		   assertEquals(1,1);
	    }catch(Exception e){
			fail();
		}
    }
	
}